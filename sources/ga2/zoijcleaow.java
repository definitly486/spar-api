package ga2;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ma0.eablkybsjg;
import ru.myspar.user.models.User;
import ru.myspar.user.models.UserCard;
import ru.myspar.user.models.UserNotifications;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    public static final User iobyxmoadg(ha2.ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        List listVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
        if (listVdvldrhtss == null) {
            listVdvldrhtss = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listVdvldrhtss, 10));
        Iterator it = listVdvldrhtss.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg.f66657yggfygwlhe.iobyxmoadg((String) it.next()));
        }
        String strKcexrzcfyt = ppxfxbqfkfVar.kcexrzcfyt();
        String strWflxmlrfwp = ppxfxbqfkfVar.wflxmlrfwp();
        String strLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg();
        String strNufgyqmvbu = ppxfxbqfkfVar.nufgyqmvbu();
        String strGtknphoqwx = ppxfxbqfkfVar.gtknphoqwx();
        String strZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        Double dIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        double dDoubleValue = dIobyxmoadg != null ? dIobyxmoadg.doubleValue() : 0.0d;
        String strWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
        if (strWkgbmnqykc == null) {
            strWkgbmnqykc = "";
        }
        UserCard userCard = new UserCard(strZoijcleaow, dDoubleValue, strWkgbmnqykc);
        String strBtonecajqb = ppxfxbqfkfVar.btonecajqb();
        String strPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        UserNotifications userNotifications = new UserNotifications(ppxfxbqfkfVar.yggfygwlhe(), ppxfxbqfkfVar.cqumvgiudr(), ppxfxbqfkfVar.iwizpuwonk());
        boolean zJyumaefscl = ppxfxbqfkfVar.jyumaefscl();
        boolean zOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
        boolean zZdlpuopuiu = ppxfxbqfkfVar.zdlpuopuiu();
        boolean zEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        int iGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo();
        int iAgtfadlqog = ppxfxbqfkfVar.agtfadlqog();
        Double dOxmwwwfdhm = ppxfxbqfkfVar.oxmwwwfdhm();
        List listRgvfuqvkyq = ppxfxbqfkfVar.rgvfuqvkyq();
        if (listRgvfuqvkyq == null) {
            listRgvfuqvkyq = jyumaefscl.wflxmlrfwp();
        }
        List list = listRgvfuqvkyq;
        String strDxjokdxxww = ppxfxbqfkfVar.dxjokdxxww();
        return new User(strKcexrzcfyt, strWflxmlrfwp, strLqeggnwhkg, strNufgyqmvbu, strGtknphoqwx, userCard, strBtonecajqb, strPpxfxbqfkf, userNotifications, zJyumaefscl, zOjitshcjhn, zZdlpuopuiu, zEablkybsjg, iDraadjrbmk, iGxszxtbevo, iAgtfadlqog, arrayList, dOxmwwwfdhm, jyumaefscl.wflxmlrfwp(), list, strDxjokdxxww == null ? "" : strDxjokdxxww);
    }
}
