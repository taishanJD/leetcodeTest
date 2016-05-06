package code160506;

class Solution2 {
    // һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
    public int JumpFloor(int target) {
	if (target <= 0) {
	    return -1;
	} else if (target == 1) {
	    return 1;
	} else if (target == 2) {
	    return 2;
	} else {
	    return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
    }

    /*
     * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
     */
    public int JumpFloorII(int target) {
	if (target <= 0) {
	    return -1;
	} else if (target == 1) {
	    return 1;
	} else {
	    return 2 * JumpFloorII(target - 1);
	}
    }
}