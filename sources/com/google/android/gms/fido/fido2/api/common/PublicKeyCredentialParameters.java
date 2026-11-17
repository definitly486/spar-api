package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialParametersCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new zzan();

    @SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType zza;

    @SafeParcelable.Field(getter = "getAlgorithmIdAsInteger", id = 3, type = "java.lang.Integer")
    private final COSEAlgorithmIdentifier zzb;

    @SafeParcelable.Constructor
    public PublicKeyCredentialParameters(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i13) {
        Preconditions.checkNotNull(str);
        try {
            this.zza = PublicKeyCredentialType.fromString(str);
            Preconditions.checkNotNull(Integer.valueOf(i13));
            try {
                this.zzb = COSEAlgorithmIdentifier.fromCoseValue(i13);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e13) {
                throw new IllegalArgumentException(e13);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e14) {
            throw new IllegalArgumentException(e14);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.zza.equals(publicKeyCredentialParameters.zza) && this.zzb.equals(publicKeyCredentialParameters.zzb);
    }

    public COSEAlgorithmIdentifier getAlgorithm() {
        return this.zzb;
    }

    public int getAlgorithmIdAsInteger() {
        return this.zzb.toCoseValue();
    }

    public PublicKeyCredentialType getType() {
        return this.zza;
    }

    public String getTypeAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, Integer.valueOf(getAlgorithmIdAsInteger()), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
