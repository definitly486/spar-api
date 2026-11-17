package yr0;

import android.os.Parcel;
import j0.l;
import j0.m;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements ak.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f126300iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    public tzroggbefp iobyxmoadg(Parcel parcel) {
        zdlpuopuiu.btonecajqb(parcel, "parcel");
        String string = parcel.readString();
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        if (string == null) {
            string = "";
        }
        return new tzroggbefp(string, m.zoijcleaow(i13, i14), (l) null, 4, (gtknphoqwx) null);
    }

    public void zoijcleaow(tzroggbefp tzroggbefpVar, Parcel parcel, int i13) {
        zdlpuopuiu.btonecajqb(tzroggbefpVar, "<this>");
        zdlpuopuiu.btonecajqb(parcel, "parcel");
        parcel.writeString(tzroggbefpVar.draadjrbmk());
        parcel.writeInt(l.agtfadlqog(tzroggbefpVar.gtknphoqwx()));
        parcel.writeInt(l.dxjokdxxww(tzroggbefpVar.gtknphoqwx()));
    }
}
