package kk;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import npi.spay.Jn;

/* JADX INFO: loaded from: classes3.dex */
public final class we implements y60 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ArrayList f59135iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public String f59136zoijcleaow = "";

    @Override // kk.y60
    public final Object iobyxmoadg(nb0 nb0Var) {
        Object objValueOf;
        if ((nb0Var instanceof la ? (la) nb0Var : null) != null) {
            int iOrdinal = ((la) nb0Var).ordinal();
            boolean z13 = true;
            if (iOrdinal == 0) {
                if ((this.f59135iobyxmoadg.isEmpty() || this.f59135iobyxmoadg.contains("3.0.6")) && !this.f59135iobyxmoadg.isEmpty()) {
                    z13 = false;
                }
                objValueOf = Boolean.valueOf(z13);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                objValueOf = this.f59136zoijcleaow;
            }
            if (objValueOf != null) {
                return objValueOf;
            }
        }
        throw new Jn(String.valueOf(nb0Var));
    }

    @Override // kk.y60
    public final void zoijcleaow(ia0 ia0Var) {
        if ((ia0Var instanceof td ? (td) ia0Var : null) != null) {
            td tdVar = (td) ia0Var;
            if (tdVar instanceof ob) {
                this.f59136zoijcleaow = ((ob) ia0Var).f57922zoijcleaow;
            } else {
                if (!(tdVar instanceof qc)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList = this.f59135iobyxmoadg;
                arrayList.clear();
                arrayList.addAll(((qc) ia0Var).f58173zoijcleaow);
            }
        }
    }
}
