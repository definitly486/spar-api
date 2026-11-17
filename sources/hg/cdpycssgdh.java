package hg;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cdpycssgdh extends istkbnxepw {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int crxdokpmqz(List list, int i13) {
        if (i13 >= 0 && i13 <= list.size()) {
            return list.size() - i13;
        }
        throw new IndexOutOfBoundsException("Position index " + i13 + " must be in range [" + new zg.btonecajqb(0, list.size()) + "].");
    }

    public static List mbcevpiqjq(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        return new vipkmwdibw(list);
    }

    public static List ntlheqmsrt(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        return new ribwqtqdhb(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sopmlzcsov(List list, int i13) {
        return jyumaefscl.ojitshcjhn(list) - i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ulzqkzuiru(List list, int i13) {
        if (i13 >= 0 && i13 <= jyumaefscl.ojitshcjhn(list)) {
            return jyumaefscl.ojitshcjhn(list) - i13;
        }
        throw new IndexOutOfBoundsException("Element index " + i13 + " must be in range [" + new zg.btonecajqb(0, jyumaefscl.ojitshcjhn(list)) + "].");
    }
}
