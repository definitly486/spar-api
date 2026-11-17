package n41;

import hg.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import zg.btonecajqb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {
    public static final String iobyxmoadg(String rawCardNumber) {
        zdlpuopuiu.btonecajqb(rawCardNumber, "rawCardNumber");
        return jyumaefscl.iwxlajgraz(kcexrzcfyt.s(rawCardNumber, 4), " ", null, null, 0, null, null, 62, null);
    }

    public static final j0.eablkybsjg zoijcleaow(String phoneNumber) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        j0.eablkybsjg.zoijcleaow zoijcleaowVar = new j0.eablkybsjg.zoijcleaow(0, 1, null);
        if (phoneNumber.length() != 11) {
            zoijcleaowVar.gtknphoqwx(phoneNumber);
        } else {
            zoijcleaowVar.gtknphoqwx("+7");
            zoijcleaowVar.gtknphoqwx(" (");
            zoijcleaowVar.gtknphoqwx(kcexrzcfyt.eslsurpljm(phoneNumber, new btonecajqb(1, 3)));
            zoijcleaowVar.gtknphoqwx(") ");
            zoijcleaowVar.gtknphoqwx(kcexrzcfyt.eslsurpljm(phoneNumber, new btonecajqb(4, 6)));
            zoijcleaowVar.gtknphoqwx("-");
            zoijcleaowVar.gtknphoqwx(kcexrzcfyt.eslsurpljm(phoneNumber, new btonecajqb(7, 8)));
            zoijcleaowVar.gtknphoqwx("-");
            zoijcleaowVar.gtknphoqwx(kcexrzcfyt.eslsurpljm(phoneNumber, new btonecajqb(9, 10)));
        }
        return zoijcleaowVar.yggfygwlhe();
    }
}
