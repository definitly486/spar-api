package ru.myspar.subscription.api.model.detail;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0002-.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0013\u0010,\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter$Value;", ExternalMetricsManagerImpl.VALUES, "Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter$AdditionalInfo;", "additionalInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter$AdditionalInfo;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "iwizpuwonk", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter$AdditionalInfo;", "zoijcleaow", "()Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter$AdditionalInfo;", "ppxfxbqfkf", "()Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter$Value;", "selectedValue", "Value", "AdditionalInfo", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubscriptionDetailCustomizableParameter implements Parcelable {
    public static final Parcelable.Creator<SubscriptionDetailCustomizableParameter> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final AdditionalInfo additionalInfo;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List values;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter$AdditionalInfo;", "Landroid/os/Parcelable;", "", "title", "", "Lru/myspar/core/models/progress_bar/CartProgressBarRapid;", "rapids", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo implements Parcelable {
        public static final Parcelable.Creator<AdditionalInfo> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final List rapids;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final AdditionalInfo createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                String string = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readParcelable(AdditionalInfo.class.getClassLoader()));
                }
                return new AdditionalInfo(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final AdditionalInfo[] newArray(int i13) {
                return new AdditionalInfo[i13];
            }
        }

        public AdditionalInfo(String title, List rapids) {
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(rapids, "rapids");
            this.title = title;
            this.rapids = rapids;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalInfo)) {
                return false;
            }
            AdditionalInfo additionalInfo = (AdditionalInfo) other;
            return zdlpuopuiu.eablkybsjg(this.title, additionalInfo.title) && zdlpuopuiu.eablkybsjg(this.rapids, additionalInfo.rapids);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.rapids.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            return "AdditionalInfo(title=" + this.title + ", rapids=" + this.rapids + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.title);
            List list = this.rapids;
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final List getRapids() {
            return this.rapids;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParameter$Value;", "Landroid/os/Parcelable;", "", "id", "value", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getValue", "jyumaefscl", "Z", "wkgbmnqykc", "()Z", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {
        public static final Parcelable.Creator<Value> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSelected;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Value createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Value(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Value[] newArray(int i13) {
                return new Value[i13];
            }
        }

        public Value(String id2, String value, boolean z13) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(value, "value");
            this.id = id2;
            this.value = value;
            this.isSelected = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return zdlpuopuiu.eablkybsjg(this.id, value.id) && zdlpuopuiu.eablkybsjg(this.value, value.value) && this.isSelected == value.isSelected;
        }

        public final String getId() {
            return this.id;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return "Value(id=" + this.id + ", value=" + this.value + ", isSelected=" + this.isSelected + ")";
        }

        /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.value);
            dest.writeInt(this.isSelected ? 1 : 0);
        }
    }

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetailCustomizableParameter createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(Value.CREATOR.createFromParcel(parcel));
            }
            return new SubscriptionDetailCustomizableParameter(string, string2, arrayList, parcel.readInt() == 0 ? null : AdditionalInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetailCustomizableParameter[] newArray(int i13) {
            return new SubscriptionDetailCustomizableParameter[i13];
        }
    }

    public SubscriptionDetailCustomizableParameter(String id2, String name, List values, AdditionalInfo additionalInfo) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(values, "values");
        this.id = id2;
        this.name = name;
        this.values = values;
        this.additionalInfo = additionalInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getValues() {
        return this.values;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDetailCustomizableParameter)) {
            return false;
        }
        SubscriptionDetailCustomizableParameter subscriptionDetailCustomizableParameter = (SubscriptionDetailCustomizableParameter) other;
        return zdlpuopuiu.eablkybsjg(this.id, subscriptionDetailCustomizableParameter.id) && zdlpuopuiu.eablkybsjg(this.name, subscriptionDetailCustomizableParameter.name) && zdlpuopuiu.eablkybsjg(this.values, subscriptionDetailCustomizableParameter.values) && zdlpuopuiu.eablkybsjg(this.additionalInfo, subscriptionDetailCustomizableParameter.additionalInfo);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.values.hashCode()) * 31;
        AdditionalInfo additionalInfo = this.additionalInfo;
        return iHashCode + (additionalInfo == null ? 0 : additionalInfo.hashCode());
    }

    public final Value ppxfxbqfkf() {
        Object next;
        Iterator it = this.values.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((Value) next).getIsSelected()) {
                return (Value) next;
            }
        }
        next = null;
        return (Value) next;
    }

    public String toString() {
        return "SubscriptionDetailCustomizableParameter(id=" + this.id + ", name=" + this.name + ", values=" + this.values + ", additionalInfo=" + this.additionalInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        List list = this.values;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Value) it.next()).writeToParcel(dest, flags);
        }
        AdditionalInfo additionalInfo = this.additionalInfo;
        if (additionalInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalInfo.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }
}
