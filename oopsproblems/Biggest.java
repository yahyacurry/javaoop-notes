


package oopsproblems;
    //5. Create a class Biggest that contains a single-dimensional array
// as a data member and a method display()
// to find and display the largest element of the array.

    class Biggest {

        int[] num;

        public Biggest(int[] nums) {

            this.num = nums;
        }

        public void display() {
            int l = 0;
            for (int i = 0; i< num.length; i++){

            }
        }

        public static void main(String[] args) {
            int[] nums = {10, 20, 5, 8, 25};
            Biggest b = new Biggest(nums);
            b.display();
        }
    }
