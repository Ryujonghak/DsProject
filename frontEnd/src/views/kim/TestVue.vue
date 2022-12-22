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
    data() {
        return {
            values: [
				{ label: 'Value 1', value: '1' },
				{ label: 'Value 2', value: '2' },
				{ label: 'Value 3', value: '3' },
			],
            values2: [
				{ label: 'Value 1', value: '1' },
				{ label: 'Value 2', value: '2' },
				{ label: 'Value 3', value: '3' },
			],
			currentValue: '',
            currentValue2: '',
            testt : false
        }
    },
    methods: {
        test() {
            if(this.currentValue == 1) {
                this.testt = true;
                console.log(this.currentValue);
            }
            
            else{
                console.log(22);
            }
        }
    },

}
</script>

<style lang="scss" scoped>
@import '../assets/css/style.css';
</style>

