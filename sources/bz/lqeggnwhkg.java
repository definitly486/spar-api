package bz;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class lqeggnwhkg extends rlfsiqarku {
    lqeggnwhkg(Context context, t6.zdlpuopuiu zdlpuopuiuVar, t6.yadqdtsiqt yadqdtsiqtVar, t6.hcddaimhww hcddaimhwwVar) {
        super(context, kc2.lqeggnwhkg.AgentSignalStrengthCellular, zdlpuopuiuVar, yadqdtsiqtVar, hcddaimhwwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx, u4 {
        List listPkzmftpjix = pkzmftpjix();
        if (listPkzmftpjix.isEmpty()) {
            throw new jhduphickx(t6.iwizpuwonk.iobyxmoadg(new byte[]{-47, -8, 20, 123, 74, -56, -55, 127, -18, -115, 29, -99, 108, 110, 15, -121, 3, -27, 56, 123, 84, 107, -31, -123, -123, -32, 69, 2, -85, -49, -49, -63, 69, 93, -20, 68, 43, 49, -60, 7, -78, 125, 110, -103, 70, 126, -78, -40, 63, -97, 103, 87, -20, 82, 5, 2, 122, -118, 119, 116, 110, -46, 42, 104}));
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it = listPkzmftpjix.iterator();
        while (it.hasNext()) {
            sb3.append(((t6.wflxmlrfwp) it.next()).eablkybsjg());
            sb3.append(t6.iwizpuwonk.iobyxmoadg(new byte[]{91, -119, -16, -117, -91, -64, 2, 25, 94, -21, -40, -106, -36, 105, -23, -34}));
        }
        return sb3.toString().trim();
    }
}
