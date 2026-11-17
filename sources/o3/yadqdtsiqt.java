package o3;

import f3.hcddaimhww;
import java.util.Objects;
import v2.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Object f71901eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f71902iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final esjtqupxsv[] f71903ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final wwaezpbzkn f71904wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final hcddaimhww[] f71905zoijcleaow;

    public yadqdtsiqt(hcddaimhww[] hcddaimhwwVarArr, esjtqupxsv[] esjtqupxsvVarArr, wwaezpbzkn wwaezpbzknVar, Object obj) {
        y2.iobyxmoadg.iobyxmoadg(hcddaimhwwVarArr.length == esjtqupxsvVarArr.length);
        this.f71905zoijcleaow = hcddaimhwwVarArr;
        this.f71903ppxfxbqfkf = (esjtqupxsv[]) esjtqupxsvVarArr.clone();
        this.f71904wkgbmnqykc = wwaezpbzknVar;
        this.f71901eablkybsjg = obj;
        this.f71902iobyxmoadg = hcddaimhwwVarArr.length;
    }

    public boolean iobyxmoadg(yadqdtsiqt yadqdtsiqtVar) {
        if (yadqdtsiqtVar == null || yadqdtsiqtVar.f71903ppxfxbqfkf.length != this.f71903ppxfxbqfkf.length) {
            return false;
        }
        for (int i13 = 0; i13 < this.f71903ppxfxbqfkf.length; i13++) {
            if (!zoijcleaow(yadqdtsiqtVar, i13)) {
                return false;
            }
        }
        return true;
    }

    public boolean ppxfxbqfkf(int i13) {
        return this.f71905zoijcleaow[i13] != null;
    }

    public boolean zoijcleaow(yadqdtsiqt yadqdtsiqtVar, int i13) {
        return yadqdtsiqtVar != null && Objects.equals(this.f71905zoijcleaow[i13], yadqdtsiqtVar.f71905zoijcleaow[i13]) && Objects.equals(this.f71903ppxfxbqfkf[i13], yadqdtsiqtVar.f71903ppxfxbqfkf[i13]);
    }
}
