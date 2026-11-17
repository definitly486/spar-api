package bz;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class ulzqkzuiru extends rlfsiqarku {
    ulzqkzuiru(Context context, t6.zdlpuopuiu zdlpuopuiuVar, t6.yadqdtsiqt yadqdtsiqtVar, t6.hcddaimhww hcddaimhwwVar) {
        super(context, kc2.lqeggnwhkg.CellTowerId, zdlpuopuiuVar, yadqdtsiqtVar, hcddaimhwwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx, u4 {
        List listPkzmftpjix = pkzmftpjix();
        if (listPkzmftpjix.isEmpty()) {
            throw new jhduphickx("Could not get the cell ID of the network");
        }
        return String.valueOf(((t6.wflxmlrfwp) listPkzmftpjix.get(0)).oxmwwwfdhm());
    }
}
