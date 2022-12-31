export default function btnclick() {
  // TODO: 철원이가 쓰는 버튼색 변경
    // 버튼
    var div2 = document.getElementsByClassName("div2");
  
    function handleClick(event) {
      console.log(event.target);
      // console.log(this);
      // 콘솔창을 보면 둘다 동일한 값이 나온다
  
      console.log(event.target.classList);
  
      if (event.target.classList[1] === "clicked") {
        event.target.classList.remove("clicked");
      } else {
        for (var i = 0; i < div2.length; i++) {
          div2[i].classList.remove("clicked");
        }
  
        event.target.classList.add("clicked");
      }
    }
  
    function init() {
      for (var i = 0; i < div2.length; i++) {
        div2[i].addEventListener("click", handleClick);
      }
    }
  
    init();
  
    // 버튼2
    var btndiv2 = document.getElementsByClassName("btndiv2");
  
    function handleClick2(event) {
      console.log(event.target);
      // console.log(this);
      // 콘솔창을 보면 둘다 동일한 값이 나온다
  
      console.log(event.target.classList);
  
      if (event.target.classList[1] === "clicked") {
        event.target.classList.remove("clicked");
      } else {
        for (var i = 0; i < btndiv2.length; i++) {
          btndiv2[i].classList.remove("clicked");
        }
  
        event.target.classList.add("clicked");
      }
    }
  
    function init2() {
      for (var i = 0; i < btndiv2.length; i++) {
        btndiv2[i].addEventListener("click", handleClick2);
      }
    }
    init2();

  }
  