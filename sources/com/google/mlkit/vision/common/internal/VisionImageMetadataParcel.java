package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ne.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "VisionImageMetadataParcelCreator")
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new dxjokdxxww();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final int f25223cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final int f25224iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final long f25225jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final int f25226yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final int f25227zdlpuopuiu;

    public VisionImageMetadataParcel(int i13, int i14, int i15, long j13, int i16) {
        this.f25227zdlpuopuiu = i13;
        this.f25226yggfygwlhe = i14;
        this.f25223cqumvgiudr = i15;
        this.f25225jyumaefscl = j13;
        this.f25224iwizpuwonk = i16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f25227zdlpuopuiu);
        SafeParcelWriter.writeInt(parcel, 2, this.f25226yggfygwlhe);
        SafeParcelWriter.writeInt(parcel, 3, this.f25223cqumvgiudr);
        SafeParcelWriter.writeLong(parcel, 4, this.f25225jyumaefscl);
        SafeParcelWriter.writeInt(parcel, 5, this.f25224iwizpuwonk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
