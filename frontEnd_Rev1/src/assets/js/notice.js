/*eslint-disable*/
export default function notice() {
  // $(function () {
  //   var article = ".notice_table .show";

  //   $(".notice_table .item  td").click(function () {
  //     var myArticle = $(this).parents().next("tr");

  //     if ($(myArticle).hasClass("hide")) {
  //       $(article).removeClass("show").addClass("hide");

  //       $(myArticle).removeClass("hide").addClass("show");
  //     } else {
  //       $(myArticle).addClass("hide").removeClass("show");
  //     }
  //   });
  // });

  // $(function(){
  //   $( ".notice_table" ).accordion();
  // })
  $(".item").on('click',function(){
    $(".hide").slideUp(100);
    $(this).next(".hide").slideDown(100);
  });
}
