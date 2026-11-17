package bz;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mhtqkkgtqm extends rlfsiqarku {
    mhtqkkgtqm(Context context, t6.zdlpuopuiu zdlpuopuiuVar, t6.yadqdtsiqt yadqdtsiqtVar, t6.hcddaimhww hcddaimhwwVar) {
        super(context, kc2.lqeggnwhkg.CellIdentities, zdlpuopuiuVar, yadqdtsiqtVar, hcddaimhwwVar);
    }

    private static void kegysxyocb(oc2.iobyxmoadg iobyxmoadgVar, String str, String str2) {
        if (str2 != null) {
            iobyxmoadgVar.put(str, str2);
        }
    }

    private static oc2.iobyxmoadg stevsuqkhv(t6.wflxmlrfwp wflxmlrfwpVar) {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        iobyxmoadgVar.put("type", wflxmlrfwpVar.zoijcleaow());
        iobyxmoadgVar.put("cid", Long.valueOf(wflxmlrfwpVar.oxmwwwfdhm()));
        iobyxmoadgVar.put("lac", Integer.valueOf(wflxmlrfwpVar.iwizpuwonk()));
        kegysxyocb(iobyxmoadgVar, "mcc", wflxmlrfwpVar.gtknphoqwx());
        kegysxyocb(iobyxmoadgVar, "mnc", wflxmlrfwpVar.esjtqupxsv());
        iobyxmoadgVar.put("time", Long.valueOf(wflxmlrfwpVar.wflxmlrfwp()));
        iobyxmoadgVar.put("serving", wflxmlrfwpVar.ppxfxbqfkf());
        iobyxmoadgVar.put("level", Integer.valueOf(wflxmlrfwpVar.gxszxtbevo()));
        iobyxmoadgVar.put("dbm", Integer.valueOf(wflxmlrfwpVar.eablkybsjg()));
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public oc2.ppxfxbqfkf lereixgezr() throws jhduphickx, u4 {
        List listPkzmftpjix = pkzmftpjix();
        if (listPkzmftpjix.isEmpty()) {
            throw new jhduphickx("Could not get the cell ID of the network");
        }
        oc2.ppxfxbqfkf ppxfxbqfkfVar = new oc2.ppxfxbqfkf(listPkzmftpjix.size());
        Iterator it = listPkzmftpjix.iterator();
        while (it.hasNext()) {
            ppxfxbqfkfVar.add(stevsuqkhv((t6.wflxmlrfwp) it.next()));
        }
        return ppxfxbqfkfVar;
    }
}
