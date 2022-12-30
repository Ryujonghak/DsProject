<template>
  <div >
    <RadioToggleButtons
		v-model='currentValue'
		:values='values'
		color='purple'
		textColor='#000'
		selectedTextColor='#fff'

        @change="test()"
	/>
    <RadioToggleButtons
    v-show="testt"
		v-model='currentValue2'
		:values='values2'
		color='black'
		textColor='#000'
		selectedTextColor='#fff'
	/>

  </div>
</template>

<script>
import custom from "../assets/js/custom"

export default {
    mounted() {
        custom()
    },
    

}
</script>

<style lang="scss" scoped>
@import '../assets/css/style.css';
</style>

