package ru.myspar.components.promo_collection.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u00013B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0011\u0010.\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010\u0017R\u0011\u00100\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010\u0017R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010\u0017¨\u00064"}, d2 = {"Lru/myspar/components/promo_collection/api/models/PromoCollectionItem;", "Landroid/os/Parcelable;", "", "id", "description", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;", "currentStatus", "", "statusList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;Ljava/util/List;)Lru/myspar/components/promo_collection/api/models/PromoCollectionItem;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;", "eablkybsjg", "()Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;", "iwizpuwonk", "Ljava/util/List;", "lqeggnwhkg", "()Ljava/util/List;", "getName", ExternalMetricsManagerImpl.NAME, "ojitshcjhn", "imageUrl", "istkbnxepw", "buttonText", "draadjrbmk", "textAboveButton", "Status", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PromoCollectionItem implements Parcelable {
    public static final Parcelable.Creator<PromoCollectionItem> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List statusList;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Status currentStatus;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\f\r\u000eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\u0082\u0001\u0003\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;", "Landroid/os/Parcelable;", "", "getName", "()Ljava/lang/String;", ExternalMetricsManagerImpl.NAME, "ojitshcjhn", "imageUrl", "istkbnxepw", "buttonText", "draadjrbmk", "textAboveButton", "Opened", "ReadyToOpen", "Blocked", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status$Blocked;", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status$Opened;", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status$ReadyToOpen;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Status extends Parcelable {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status$Blocked;", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;", "", ExternalMetricsManagerImpl.NAME, "imageUrl", "buttonText", "textAboveButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getName", "yggfygwlhe", "ojitshcjhn", "jyumaefscl", "istkbnxepw", "iwizpuwonk", "draadjrbmk", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Blocked implements Status {
            public static final Parcelable.Creator<Blocked> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
            private final String textAboveButton;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
            private final String buttonText;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
            private final String imageUrl;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final Blocked createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new Blocked(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Blocked[] newArray(int i13) {
                    return new Blocked[i13];
                }
            }

            public Blocked(String name, String imageUrl, String buttonText, String textAboveButton) {
                zdlpuopuiu.btonecajqb(name, "name");
                zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
                zdlpuopuiu.btonecajqb(buttonText, "buttonText");
                zdlpuopuiu.btonecajqb(textAboveButton, "textAboveButton");
                this.name = name;
                this.imageUrl = imageUrl;
                this.buttonText = buttonText;
                this.textAboveButton = textAboveButton;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: draadjrbmk, reason: from getter */
            public String getTextAboveButton() {
                return this.textAboveButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Blocked)) {
                    return false;
                }
                Blocked blocked = (Blocked) other;
                return zdlpuopuiu.eablkybsjg(this.name, blocked.name) && zdlpuopuiu.eablkybsjg(this.imageUrl, blocked.imageUrl) && zdlpuopuiu.eablkybsjg(this.buttonText, blocked.buttonText) && zdlpuopuiu.eablkybsjg(this.textAboveButton, blocked.textAboveButton);
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            public String getName() {
                return this.name;
            }

            public int hashCode() {
                return (((((this.name.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.textAboveButton.hashCode();
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
            public String getButtonText() {
                return this.buttonText;
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
            public String getImageUrl() {
                return this.imageUrl;
            }

            public String toString() {
                return "Blocked(name=" + this.name + ", imageUrl=" + this.imageUrl + ", buttonText=" + this.buttonText + ", textAboveButton=" + this.textAboveButton + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeString(this.name);
                dest.writeString(this.imageUrl);
                dest.writeString(this.buttonText);
                dest.writeString(this.textAboveButton);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R \u0010$\u001a\u00020\u00028\u0016X\u0096D¢\u0006\u0012\n\u0004\b \u0010\u001a\u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0012¨\u0006%"}, d2 = {"Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status$Opened;", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;", "", ExternalMetricsManagerImpl.NAME, "imageUrl", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getName", "yggfygwlhe", "ojitshcjhn", "jyumaefscl", "istkbnxepw", "iwizpuwonk", "draadjrbmk", "getTextAboveButton$annotations", "()V", "textAboveButton", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Opened implements Status {
            public static final Parcelable.Creator<Opened> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
            private final String textAboveButton;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
            private final String buttonText;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
            private final String imageUrl;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final Opened createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new Opened(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Opened[] newArray(int i13) {
                    return new Opened[i13];
                }
            }

            public Opened(String name, String imageUrl, String buttonText) {
                zdlpuopuiu.btonecajqb(name, "name");
                zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
                zdlpuopuiu.btonecajqb(buttonText, "buttonText");
                this.name = name;
                this.imageUrl = imageUrl;
                this.buttonText = buttonText;
                this.textAboveButton = "";
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: draadjrbmk, reason: from getter */
            public String getTextAboveButton() {
                return this.textAboveButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Opened)) {
                    return false;
                }
                Opened opened = (Opened) other;
                return zdlpuopuiu.eablkybsjg(this.name, opened.name) && zdlpuopuiu.eablkybsjg(this.imageUrl, opened.imageUrl) && zdlpuopuiu.eablkybsjg(this.buttonText, opened.buttonText);
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            public String getName() {
                return this.name;
            }

            public int hashCode() {
                return (((this.name.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.buttonText.hashCode();
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
            public String getButtonText() {
                return this.buttonText;
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
            public String getImageUrl() {
                return this.imageUrl;
            }

            public String toString() {
                return "Opened(name=" + this.name + ", imageUrl=" + this.imageUrl + ", buttonText=" + this.buttonText + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeString(this.name);
                dest.writeString(this.imageUrl);
                dest.writeString(this.buttonText);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status$ReadyToOpen;", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem$Status;", "", ExternalMetricsManagerImpl.NAME, "imageUrl", "buttonText", "textAboveButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getName", "yggfygwlhe", "ojitshcjhn", "jyumaefscl", "istkbnxepw", "iwizpuwonk", "draadjrbmk", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReadyToOpen implements Status {
            public static final Parcelable.Creator<ReadyToOpen> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
            private final String textAboveButton;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
            private final String buttonText;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
            private final String imageUrl;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final ReadyToOpen createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new ReadyToOpen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final ReadyToOpen[] newArray(int i13) {
                    return new ReadyToOpen[i13];
                }
            }

            public ReadyToOpen(String name, String imageUrl, String buttonText, String textAboveButton) {
                zdlpuopuiu.btonecajqb(name, "name");
                zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
                zdlpuopuiu.btonecajqb(buttonText, "buttonText");
                zdlpuopuiu.btonecajqb(textAboveButton, "textAboveButton");
                this.name = name;
                this.imageUrl = imageUrl;
                this.buttonText = buttonText;
                this.textAboveButton = textAboveButton;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: draadjrbmk, reason: from getter */
            public String getTextAboveButton() {
                return this.textAboveButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadyToOpen)) {
                    return false;
                }
                ReadyToOpen readyToOpen = (ReadyToOpen) other;
                return zdlpuopuiu.eablkybsjg(this.name, readyToOpen.name) && zdlpuopuiu.eablkybsjg(this.imageUrl, readyToOpen.imageUrl) && zdlpuopuiu.eablkybsjg(this.buttonText, readyToOpen.buttonText) && zdlpuopuiu.eablkybsjg(this.textAboveButton, readyToOpen.textAboveButton);
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            public String getName() {
                return this.name;
            }

            public int hashCode() {
                return (((((this.name.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.textAboveButton.hashCode();
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
            public String getButtonText() {
                return this.buttonText;
            }

            @Override // ru.myspar.components.promo_collection.api.models.PromoCollectionItem.Status
            /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
            public String getImageUrl() {
                return this.imageUrl;
            }

            public String toString() {
                return "ReadyToOpen(name=" + this.name + ", imageUrl=" + this.imageUrl + ", buttonText=" + this.buttonText + ", textAboveButton=" + this.textAboveButton + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeString(this.name);
                dest.writeString(this.imageUrl);
                dest.writeString(this.buttonText);
                dest.writeString(this.textAboveButton);
            }
        }

        /* JADX INFO: renamed from: draadjrbmk */
        String getTextAboveButton();

        String getName();

        /* JADX INFO: renamed from: istkbnxepw */
        String getButtonText();

        /* JADX INFO: renamed from: ojitshcjhn */
        String getImageUrl();
    }

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PromoCollectionItem createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Status status = (Status) parcel.readParcelable(PromoCollectionItem.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(PromoCollectionItem.class.getClassLoader()));
            }
            return new PromoCollectionItem(string, string2, status, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PromoCollectionItem[] newArray(int i13) {
            return new PromoCollectionItem[i13];
        }
    }

    public PromoCollectionItem(String id2, String description, Status currentStatus, List statusList) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(currentStatus, "currentStatus");
        zdlpuopuiu.btonecajqb(statusList, "statusList");
        this.id = id2;
        this.description = description;
        this.currentStatus = currentStatus;
        this.statusList = statusList;
    }

    public static /* synthetic */ PromoCollectionItem ppxfxbqfkf(PromoCollectionItem promoCollectionItem, String str, String str2, Status status, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = promoCollectionItem.id;
        }
        if ((i13 & 2) != 0) {
            str2 = promoCollectionItem.description;
        }
        if ((i13 & 4) != 0) {
            status = promoCollectionItem.currentStatus;
        }
        if ((i13 & 8) != 0) {
            list = promoCollectionItem.statusList;
        }
        return promoCollectionItem.zoijcleaow(str, str2, status, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String draadjrbmk() {
        return this.currentStatus.getTextAboveButton();
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCollectionItem)) {
            return false;
        }
        PromoCollectionItem promoCollectionItem = (PromoCollectionItem) other;
        return zdlpuopuiu.eablkybsjg(this.id, promoCollectionItem.id) && zdlpuopuiu.eablkybsjg(this.description, promoCollectionItem.description) && zdlpuopuiu.eablkybsjg(this.currentStatus, promoCollectionItem.currentStatus) && zdlpuopuiu.eablkybsjg(this.statusList, promoCollectionItem.statusList);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.currentStatus.getName();
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.description.hashCode()) * 31) + this.currentStatus.hashCode()) * 31) + this.statusList.hashCode();
    }

    public final String istkbnxepw() {
        return this.currentStatus.getButtonText();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getStatusList() {
        return this.statusList;
    }

    public final String ojitshcjhn() {
        return this.currentStatus.getImageUrl();
    }

    public String toString() {
        return "PromoCollectionItem(id=" + this.id + ", description=" + this.description + ", currentStatus=" + this.currentStatus + ", statusList=" + this.statusList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.description);
        dest.writeParcelable(this.currentStatus, flags);
        List list = this.statusList;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
    }

    public final PromoCollectionItem zoijcleaow(String id2, String description, Status currentStatus, List statusList) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(currentStatus, "currentStatus");
        zdlpuopuiu.btonecajqb(statusList, "statusList");
        return new PromoCollectionItem(id2, description, currentStatus, statusList);
    }
}
