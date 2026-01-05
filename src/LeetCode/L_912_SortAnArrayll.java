public class L_912_SortAnArrayll {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1 || nums == null) return nums;
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int temp[] = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }
        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        L_912_SortAnArrayll solution = new L_912_SortAnArrayll();

        int[] nums = {5, 3, 1, 1, 2, 0, 0};
        solution.sortArray(nums);

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}

