<template>
  <div id="app">
    <NavCom/>
    <router-view/>
    <FooterCom/>
  </div>
</template>

<script>
import NavCom from "@/components/common/NavCom.vue"
import FooterCom from "@/components/common/FooterCom.vue"
export default{
 components:{
  NavCom,
  FooterCom
 }
}
</script>
<style lang="scss">

</style>
