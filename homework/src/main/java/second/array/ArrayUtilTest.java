package second.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * ${}
 * Created by spark_lizhy on 2017/3/20.
 */

public class ArrayUtilTest {

    private int[] temp;
    private int size;

    @Before
    public void setUp()throws Exception{
        size = 10;
        temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = i;
        }

    }
    @Test
    public void reverseArray() throws Exception {
        ArrayUtil.reverseArray(temp);
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(size - 1 - i, temp[i]);
        }
    }

    @Test
    public void removeZero()throws Exception{
        for (int i = 0; i < size; i++) {
            if (i % 5 == 0) {
                temp[i] = 0;
            } else {
                temp[i] = i;
            }
        }

        temp=ArrayUtil.removeZero(temp);
        Assert.assertNotNull(temp);
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                continue;
            }
            Assert.assertEquals(temp[i], i);
        }

        // 测试空数组
        {
            int[] testArray = new int[5];
            for (int i = 0; i < 5; i++) {
                testArray[i] = 0;
            }

            int[] newArray = ArrayUtil.removeZero(testArray);
            Assert.assertNotNull(newArray);
            Assert.assertEquals(newArray.length, 0);
        }
    }

}
