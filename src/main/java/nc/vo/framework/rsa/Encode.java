package nc.vo.framework.rsa;

public class Encode {

    private static long key = 1231234234L;

    public Encode() {
    }

    public static void setKey(long k) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String decode(String s, long k) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String decode(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String encode(String s, long k) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String encode(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private byte[] subArr(byte[] a) {
        int al = a.length;
        int end = this.checkEnd(a);
        if (end == 0) {
            return a;
        } else {
            byte[] rtn = new byte[al - end];
            System.arraycopy(a, 0, rtn, 0, al - end);
            return rtn;
        }
    }

    private int checkEnd(byte[] arr) {
        int rtn = 0;
        for (int i = arr.length - 1; i > 0 && arr[i] == 32; --i) {
            ++rtn;
        }
        return rtn;
    }
}
