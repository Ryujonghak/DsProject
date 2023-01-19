// MypageCom 프로필 사진 업로드 백엔드 부분

import express from 'express'
import multer from 'multer'


let upload = multer({ dest: 'public/uploads/' })
 
import { uploadToStorage } from "./apis/uploadToStorage"
 
export default (app, http) => {
  
  // ... 생략 ...
  
  app.post('/upload', upload.single('image'), (req, res) => {
    uploadToStorage(req.file).then( (response) => {
      res.send(response.Location)
    }).catch(err=>console.log(err))
  })
}

////////////////////////////////////////////////////////////////////////////////// 

import AWS from 'aws-sdk'
import fs from 'fs'
 
AWS.config.region = 'ap-northeast-2'
 
let s3 = new AWS.S3()
 
async function uploadToStorage(file) {
    let path = file.path
    let name = file.originalname
    let type = file.mimetype
    let image = fs.createReadStream(path)
    
    let parameters = {
        Bucket: 'my-bucket-name',
        Key: name,
        ACL: 'public-read',
        Body: image,
        ContentType: type,
    }
 
    return await s3.upload(parameters, function(err) {
        err ? console.log(err) : false
    }).promise()
}
 
export { uploadToStorage }