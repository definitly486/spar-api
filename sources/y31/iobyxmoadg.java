package y31;

import p0.jhduphickx;
import p0.ylkuphrtab;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: y31.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3126iobyxmoadg implements ylkuphrtab {
        C3126iobyxmoadg() {
        }

        @Override // p0.ylkuphrtab
        public int iobyxmoadg(int i13) {
            if (i13 <= 4) {
                return i13;
            }
            if (i13 <= 9) {
                return i13 - 1;
            }
            if (i13 <= 14) {
                return i13 - 2;
            }
            if (i13 <= 19) {
                return i13 - 3;
            }
            return 16;
        }

        @Override // p0.ylkuphrtab
        public int zoijcleaow(int i13) {
            if (i13 <= 3) {
                return i13;
            }
            if (i13 <= 7) {
                return i13 + 1;
            }
            if (i13 <= 11) {
                return i13 + 2;
            }
            if (i13 <= 16) {
                return i13 + 3;
            }
            return 19;
        }
    }

    public static final jhduphickx iobyxmoadg(j0.eablkybsjg text, String divider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(divider, "divider");
        int length = text.btonecajqb().length();
        String strBtonecajqb = text.btonecajqb();
        if (length >= 16) {
            strBtonecajqb = mj.kcexrzcfyt.eslsurpljm(strBtonecajqb, new zg.btonecajqb(0, 15));
        }
        int length2 = strBtonecajqb.length();
        String str = "";
        for (int i13 = 0; i13 < length2; i13++) {
            str = str + strBtonecajqb.charAt(i13);
            if (i13 % 4 == 3 && i13 != 15) {
                str = str + divider;
            }
        }
        return new jhduphickx(new j0.eablkybsjg(str, null, 2, null), new C3126iobyxmoadg());
    }

    public static /* synthetic */ jhduphickx zoijcleaow(j0.eablkybsjg eablkybsjgVar, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = " ";
        }
        return iobyxmoadg(eablkybsjgVar, str);
    }
}
