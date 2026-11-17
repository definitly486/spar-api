package npi.spay;

import android.os.Parcel;
import android.os.Parcelable;
import kk.p1;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class Gr implements Parcelable {
    public static final Parcelable.Creator<Gr> CREATOR = new p1();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final draadjrbmk f70547zdlpuopuiu;

    public Gr() {
        this.f70547zdlpuopuiu = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        zdlpuopuiu.btonecajqb(out, "out");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Gr(tg.draadjrbmk draadjrbmkVar) {
        this.f70547zdlpuopuiu = (draadjrbmk) draadjrbmkVar;
    }
}
