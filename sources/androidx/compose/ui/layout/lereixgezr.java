package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class lereixgezr {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static final float zoijcleaow(kcexrzcfyt.iobyxmoadg iobyxmoadgVar, boolean z13, esjtqupxsv[] esjtqupxsvVarArr, float f13) {
        float f14 = Float.NaN;
        for (esjtqupxsv esjtqupxsvVar : esjtqupxsvVarArr) {
            float fWflxmlrfwp = iobyxmoadgVar.wflxmlrfwp(esjtqupxsvVar, Float.NaN);
            if (Float.isNaN(f14)) {
                f14 = fWflxmlrfwp;
            } else if (z13 == (fWflxmlrfwp > f14)) {
                f14 = fWflxmlrfwp;
            }
        }
        return Float.isNaN(f14) ? f13 : f14;
    }
}
