package com.pandulapeter.beagle.common.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/pandulapeter/beagle/common/configuration/Text;", "Landroid/os/Parcelable;", "<init>", "()V", "", "suffix", "zoijcleaow", "(Ljava/lang/CharSequence;)Lcom/pandulapeter/beagle/common/configuration/Text;", "<set-?>", "zdlpuopuiu", "Ljava/lang/CharSequence;", "getSuffix", "()Ljava/lang/CharSequence;", "CharSequence", "ResourceId", "Lcom/pandulapeter/beagle/common/configuration/Text$CharSequence;", "Lcom/pandulapeter/beagle/common/configuration/Text$ResourceId;", "internal-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Text implements Parcelable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private java.lang.CharSequence suffix;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/pandulapeter/beagle/common/configuration/Text$CharSequence;", "Lcom/pandulapeter/beagle/common/configuration/Text;", "", "charSequence", "<init>", "(Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "yggfygwlhe", "Ljava/lang/CharSequence;", "ppxfxbqfkf", "()Ljava/lang/CharSequence;", "internal-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CharSequence extends Text {
        public static final Parcelable.Creator<CharSequence> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.lang.CharSequence charSequence;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final CharSequence createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new CharSequence((java.lang.CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final CharSequence[] newArray(int i13) {
                return new CharSequence[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CharSequence(java.lang.CharSequence charSequence) {
            super(null);
            zdlpuopuiu.btonecajqb(charSequence, "charSequence");
            this.charSequence = charSequence;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CharSequence) && zdlpuopuiu.eablkybsjg(this.charSequence, ((CharSequence) other).charSequence);
        }

        public int hashCode() {
            return this.charSequence.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final java.lang.CharSequence getCharSequence() {
            return this.charSequence;
        }

        public String toString() {
            return "CharSequence(charSequence=" + ((Object) this.charSequence) + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            TextUtils.writeToParcel(this.charSequence, parcel, flags);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/pandulapeter/beagle/common/configuration/Text$ResourceId;", "Lcom/pandulapeter/beagle/common/configuration/Text;", "", "resourceId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "yggfygwlhe", "I", "ppxfxbqfkf", "internal-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResourceId extends Text {
        public static final Parcelable.Creator<ResourceId> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final int resourceId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final ResourceId createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new ResourceId(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final ResourceId[] newArray(int i13) {
                return new ResourceId[i13];
            }
        }

        public ResourceId(int i13) {
            super(null);
            this.resourceId = i13;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResourceId) && this.resourceId == ((ResourceId) other).resourceId;
        }

        public int hashCode() {
            return Integer.hashCode(this.resourceId);
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        public String toString() {
            return "ResourceId(resourceId=" + this.resourceId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(this.resourceId);
        }
    }

    public /* synthetic */ Text(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public final Text zoijcleaow(java.lang.CharSequence suffix) {
        zdlpuopuiu.btonecajqb(suffix, "suffix");
        this.suffix = suffix;
        return this;
    }

    private Text() {
        this.suffix = "";
    }
}
