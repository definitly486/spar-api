package kk;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f58225iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Integer[] f58226ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final List f58227zoijcleaow;

    public qq(List adapters, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapters, "adapters");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f58225iobyxmoadg = adapters;
        this.f58227zoijcleaow = data;
        int size = data.size();
        Integer[] numArr = new Integer[size];
        for (int i13 = 0; i13 < size; i13++) {
            numArr[i13] = -1;
        }
        this.f58226ppxfxbqfkf = numArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq)) {
            return false;
        }
        qq qqVar = (qq) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58225iobyxmoadg, qqVar.f58225iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58227zoijcleaow, qqVar.f58227zoijcleaow);
    }

    public final int hashCode() {
        return this.f58227zoijcleaow.hashCode() + (this.f58225iobyxmoadg.hashCode() * 31);
    }

    public final int iobyxmoadg(int i13) {
        Integer num = this.f58226ppxfxbqfkf[i13];
        Integer num2 = null;
        if (num.intValue() == -1) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        Iterator it = this.f58225iobyxmoadg.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            ba0 ba0Var = (ba0) it.next();
            List items = this.f58227zoijcleaow;
            ba0Var.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
            if (ba0Var.ppxfxbqfkf(items.get(i13))) {
                break;
            }
            i14++;
        }
        Integer numValueOf = Integer.valueOf(i14);
        if (i14 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.f58226ppxfxbqfkf[i13] = Integer.valueOf(numValueOf.intValue());
            num2 = numValueOf;
        }
        if (num2 != null) {
            return num2.intValue();
        }
        throw new IllegalStateException(("Provide adapter for type " + this.f58227zoijcleaow.get(i13).getClass() + " at position: " + i13).toString());
    }

    public final String toString() {
        return "AdaptersState(adapters=" + this.f58225iobyxmoadg + ", data=" + this.f58227zoijcleaow + ")";
    }
}
