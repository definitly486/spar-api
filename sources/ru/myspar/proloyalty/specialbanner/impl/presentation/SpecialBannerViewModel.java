package ru.myspar.proloyalty.specialbanner.impl.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mapkit.geometry.Point;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionItem;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.error_handler.exceptions.FileSizeException;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.proloyalty.domain.feature.qrcode.store.QrCodeButton;
import ru.myspar.proloyalty.domain.feature.shops.store.ShopsArgs;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.promo_collection.api.models.PromoCollectionPayload;
import ru.myspar.proloyalty.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.rate.feedback.api.models.FeedbackArgs;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.RegistrationFormView;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.videoplayer.api.model.VideoPlayerArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class SpecialBannerViewModel extends sw0.eablkybsjg implements r01.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final p01.ppxfxbqfkf f101218agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ow1.iwizpuwonk f101219btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final li1.iobyxmoadg f101220cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final ow1.wflxmlrfwp f101221cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ts1.iobyxmoadg f101222cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private final Calendar f101223crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private String f101224czzsidtyhn;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final cz0.iobyxmoadg f101225draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final lw1.iobyxmoadg f101226dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ow1.zoijcleaow f101227dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final m01.nufgyqmvbu f101228esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ow1.esjtqupxsv f101229gtknphoqwx;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final vm0.zoijcleaow f101230hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final wq1.iobyxmoadg f101231hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private auzgnhcxok f101232ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final kc1.zoijcleaow f101233iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final xo0.iobyxmoadg f101234istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final dz0.gtknphoqwx f101235iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private auzgnhcxok f101236jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private String f101237jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f101238jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final SpecialBannerPayload f101239jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private auzgnhcxok f101240jztzpxfvev;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final x01.zoijcleaow f101241kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final n91.ppxfxbqfkf f101242kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final q41.iobyxmoadg f101243lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final vw1.iobyxmoadg f101244lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f101245lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private RegistrationFormState f101246mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private boolean f101247metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private gg.vdvldrhtss f101248ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final el1.iobyxmoadg f101249nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final jztzpxfvev f101250ojitshcjhn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private auzgnhcxok f101251okpsazkaxt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final t71.iobyxmoadg f101252oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final androidx.lifecycle.pkzmftpjix f101253pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final pw1.iobyxmoadg f101254pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final xq1.ppxfxbqfkf f101255rgvfuqvkyq;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private final gg.gtknphoqwx f101256ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private ColorsModel f101257rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private List f101258sflfametgt;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private zoijcleaow f101259sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final m01.iobyxmoadg f101260stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private String f101261tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private yr1.iobyxmoadg f101262ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private final Set f101263uwvvkdfqfp;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final t71.zoijcleaow f101264vdvldrhtss;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private boolean f101265vipkmwdibw;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ow1.ylkuphrtab f101266wflxmlrfwp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final bl1.iobyxmoadg f101267wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final t81.iobyxmoadg f101268wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f101269xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final ek1.iobyxmoadg f101270yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private tg.iobyxmoadg f101271ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private pz0.iobyxmoadg f101272yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final xq1.zoijcleaow f101273yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final dv0.iobyxmoadg f101274ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final x01.iobyxmoadg f101275zdlpuopuiu;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private final gg.gtknphoqwx f101276zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final an0.iobyxmoadg f101277zynmafqrjb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    public static final iobyxmoadg f101217oipsdeybqn = new iobyxmoadg(null);

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    public static final int f101216bfopjjpdmp = 8;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lru/myspar/proloyalty/specialbanner/impl/presentation/SpecialBannerViewModel$RegistrationFormState;", "Landroid/os/Parcelable;", "", "itemId", "userName", "phone", Scopes.EMAIL, "additionalField", "orderNumber", "Lvq1/pmvmpeiblj;", "selectedOrderType", "receiptDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvq1/pmvmpeiblj;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "btonecajqb", "jyumaefscl", "lqeggnwhkg", "iwizpuwonk", "ppxfxbqfkf", "cqumvgiudr", "zoijcleaow", "esjtqupxsv", "gxszxtbevo", "lereixgezr", "Lvq1/pmvmpeiblj;", "dxjokdxxww", "()Lvq1/pmvmpeiblj;", "pmvmpeiblj", "nufgyqmvbu", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegistrationFormState implements Parcelable {
        public static final Parcelable.Creator<RegistrationFormState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String additionalField;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderNumber;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phone;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
        private final vq1.pmvmpeiblj selectedOrderType;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
        private final String receiptDate;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String userName;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String itemId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final RegistrationFormState createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new RegistrationFormState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), vq1.pmvmpeiblj.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final RegistrationFormState[] newArray(int i13) {
                return new RegistrationFormState[i13];
            }
        }

        public RegistrationFormState(String itemId, String userName, String phone, String email, String additionalField, String orderNumber, vq1.pmvmpeiblj selectedOrderType, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userName, "userName");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(email, "email");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(additionalField, "additionalField");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectedOrderType, "selectedOrderType");
            this.itemId = itemId;
            this.userName = userName;
            this.phone = phone;
            this.email = email;
            this.additionalField = additionalField;
            this.orderNumber = orderNumber;
            this.selectedOrderType = selectedOrderType;
            this.receiptDate = str;
        }

        /* JADX INFO: renamed from: btonecajqb, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
        public final vq1.pmvmpeiblj getSelectedOrderType() {
            return this.selectedOrderType;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegistrationFormState)) {
                return false;
            }
            RegistrationFormState registrationFormState = (RegistrationFormState) other;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.itemId, registrationFormState.itemId) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.userName, registrationFormState.userName) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.phone, registrationFormState.phone) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.email, registrationFormState.email) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.additionalField, registrationFormState.additionalField) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.orderNumber, registrationFormState.orderNumber) && this.selectedOrderType == registrationFormState.selectedOrderType && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.receiptDate, registrationFormState.receiptDate);
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.itemId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.additionalField.hashCode()) * 31) + this.orderNumber.hashCode()) * 31) + this.selectedOrderType.hashCode()) * 31;
            String str = this.receiptDate;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final String getReceiptDate() {
            return this.receiptDate;
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public String toString() {
            return "RegistrationFormState(itemId=" + this.itemId + ", userName=" + this.userName + ", phone=" + this.phone + ", email=" + this.email + ", additionalField=" + this.additionalField + ", orderNumber=" + this.orderNumber + ", selectedOrderType=" + this.selectedOrderType + ", receiptDate=" + this.receiptDate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.itemId);
            dest.writeString(this.userName);
            dest.writeString(this.phone);
            dest.writeString(this.email);
            dest.writeString(this.additionalField);
            dest.writeString(this.orderNumber);
            dest.writeString(this.selectedOrderType.name());
            dest.writeString(this.receiptDate);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getAdditionalField() {
            return this.additionalField;
        }
    }

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f101286cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f101288jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f101289yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f101290zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101286cqumvgiudr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new agtfadlqog(this.f101286cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0090  */
        /* JADX WARN: Code duplicated, block: B:37:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            SpecialBannerViewModel specialBannerViewModel;
            String str;
            Throwable thDxjokdxxww;
            String str2;
            SpecialBannerViewModel specialBannerViewModel2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101288jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        str2 = (String) this.f101289yggfygwlhe;
                        specialBannerViewModel2 = (SpecialBannerViewModel) this.f101290zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((String) obj);
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    str = this.f101286cqumvgiudr;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.k0((String) objWkgbmnqykc, str);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel specialBannerViewModel3 = SpecialBannerViewModel.this;
                str2 = this.f101286cqumvgiudr;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                xq1.zoijcleaow zoijcleaowVar = specialBannerViewModel3.f101273yggfygwlhe;
                xq1.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new xq1.zoijcleaow.iobyxmoadg(str2);
                this.f101290zdlpuopuiu = specialBannerViewModel3;
                this.f101289yggfygwlhe = str2;
                this.f101288jyumaefscl = 1;
                Object objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar2, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                specialBannerViewModel2 = specialBannerViewModel3;
                obj = objZoijcleaow;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() > 10) {
                    specialBannerViewModel2.yggfygwlhe(czzsidtyhn.draadjrbmk.f101402iobyxmoadg);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                x01.iobyxmoadg iobyxmoadgVar3 = specialBannerViewModel2.f101275zdlpuopuiu;
                x01.iobyxmoadg.C3046iobyxmoadg c3046iobyxmoadg = new x01.iobyxmoadg.C3046iobyxmoadg(str2);
                this.f101290zdlpuopuiu = null;
                this.f101289yggfygwlhe = null;
                this.f101288jyumaefscl = 2;
                obj = iobyxmoadgVar3.zoijcleaow(c3046iobyxmoadg, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((String) obj);
                specialBannerViewModel = SpecialBannerViewModel.this;
                str = this.f101286cqumvgiudr;
                if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    specialBannerViewModel.k0((String) objWkgbmnqykc, str);
                }
                thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101292zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            /* synthetic */ boolean f101293iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f101294jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ boolean f101295yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f101296zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(4, gxszxtbevoVar);
            }

            @Override // tg.oxmwwwfdhm
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ojitshcjhn(((Boolean) obj).booleanValue(), (pz0.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f101296zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return new metgxyhuhe(this.f101295yggfygwlhe, (pz0.iobyxmoadg) this.f101294jyumaefscl, this.f101293iwizpuwonk);
            }

            public final Object ojitshcjhn(boolean z13, pz0.iobyxmoadg iobyxmoadgVar, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar2.f101295yggfygwlhe = z13;
                iobyxmoadgVar2.f101294jyumaefscl = iobyxmoadgVar;
                iobyxmoadgVar2.f101293iwizpuwonk = z14;
                return iobyxmoadgVar2.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f101297zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f101298zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.specialbanner.impl.presentation.SpecialBannerViewModel$btonecajqb$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2438iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f101300yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f101301zdlpuopuiu;

                    public C2438iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f101301zdlpuopuiu = obj;
                        this.f101300yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f101298zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2438iobyxmoadg c2438iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2438iobyxmoadg) {
                        c2438iobyxmoadg = (C2438iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2438iobyxmoadg.f101300yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2438iobyxmoadg.f101300yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2438iobyxmoadg = new C2438iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2438iobyxmoadg = new C2438iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2438iobyxmoadg.f101301zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2438iobyxmoadg.f101300yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f101298zdlpuopuiu;
                        if (((metgxyhuhe) obj).ppxfxbqfkf()) {
                            c2438iobyxmoadg.f101300yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2438iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f101297zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f101297zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f101302yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f101303zdlpuopuiu;

            zoijcleaow(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, SpecialBannerViewModel specialBannerViewModel) {
                this.f101303zdlpuopuiu = hkdspvbjdzVar;
                this.f101302yggfygwlhe = specialBannerViewModel;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(metgxyhuhe metgxyhuheVar, lg.gxszxtbevo gxszxtbevoVar) {
                boolean zIobyxmoadg = metgxyhuheVar.iobyxmoadg();
                pz0.iobyxmoadg iobyxmoadgVarZoijcleaow = metgxyhuheVar.zoijcleaow();
                boolean z13 = false;
                if (this.f101303zdlpuopuiu.f60015zdlpuopuiu != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zIobyxmoadg), this.f101303zdlpuopuiu.f60015zdlpuopuiu)) {
                    this.f101302yggfygwlhe.f101265vipkmwdibw = false;
                }
                boolean z14 = true;
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zIobyxmoadg), this.f101303zdlpuopuiu.f60015zdlpuopuiu)) {
                    this.f101303zdlpuopuiu.f60015zdlpuopuiu = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zIobyxmoadg);
                    z13 = true;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101302yggfygwlhe.e(), iobyxmoadgVarZoijcleaow)) {
                    z14 = z13;
                } else {
                    this.f101302yggfygwlhe.x0(iobyxmoadgVarZoijcleaow);
                    tg.iobyxmoadg iobyxmoadgVarD = this.f101302yggfygwlhe.d();
                    if (iobyxmoadgVarD != null) {
                        iobyxmoadgVarD.invoke();
                    }
                }
                if (z14) {
                    this.f101302yggfygwlhe.c();
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new btonecajqb(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101292zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
                ow1.ylkuphrtab ylkuphrtabVar = SpecialBannerViewModel.this.f101266wflxmlrfwp;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(sj.dxjokdxxww.draadjrbmk((sj.lqeggnwhkg) ylkuphrtabVar.zoijcleaow(wwaezpbzknVar), SpecialBannerViewModel.this.f101228esjtqupxsv.zoijcleaow(wwaezpbzknVar), SpecialBannerViewModel.this.i(), new iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(hkdspvbjdzVar, SpecialBannerViewModel.this);
                this.f101292zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.collect(zoijcleaowVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ SpecialBannerViewModel f101304iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f101305jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f101306yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101307zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar, SpecialBannerViewModel specialBannerViewModel) {
            super(3, gxszxtbevoVar);
            this.f101304iwizpuwonk = specialBannerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101307zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f101306yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((Boolean) this.f101305jyumaefscl).booleanValue() ? this.f101304iwizpuwonk.f().zoijcleaow() : sj.dxjokdxxww.cqumvgiudr();
                this.f101307zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarZoijcleaow, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar, this.f101304iwizpuwonk);
            cqumvgiudrVar.f101306yggfygwlhe = nufgyqmvbuVar;
            cqumvgiudrVar.f101305jyumaefscl = obj;
            return cqumvgiudrVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ s71.wkgbmnqykc f101308jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101310zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(s71.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101308jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new draadjrbmk(this.f101308jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007b  */
        /* JADX WARN: Code duplicated, block: B:28:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            SpecialBannerViewModel specialBannerViewModel;
            s71.wkgbmnqykc wkgbmnqykcVar;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101310zdlpuopuiu;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((s71.zoijcleaow) obj);
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    wkgbmnqykcVar = this.f101308jyumaefscl;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.E0(wkgbmnqykcVar, new s71.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf(false), (s71.zoijcleaow) objWkgbmnqykc);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        SpecialBannerViewModel.F0(specialBannerViewModel, wkgbmnqykcVar, s71.wkgbmnqykc.iobyxmoadg.C2573iobyxmoadg.f105665iobyxmoadg, null, 4, null);
                        specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.F0(SpecialBannerViewModel.this, this.f101308jyumaefscl, s71.wkgbmnqykc.iobyxmoadg.zoijcleaow.f105667iobyxmoadg, null, 4, null);
                m01.iobyxmoadg iobyxmoadgVar = SpecialBannerViewModel.this.f101260stevsuqkhv;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f101310zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                pz0.iobyxmoadg iobyxmoadgVar2 = (pz0.iobyxmoadg) obj;
                SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                t71.zoijcleaow zoijcleaowVar = specialBannerViewModel2.f101264vdvldrhtss;
                t71.zoijcleaow.iobyxmoadg iobyxmoadgVar4 = new t71.zoijcleaow.iobyxmoadg(iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf());
                this.f101310zdlpuopuiu = 2;
                obj = zoijcleaowVar.invoke(iobyxmoadgVar4, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((s71.zoijcleaow) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            specialBannerViewModel = SpecialBannerViewModel.this;
            wkgbmnqykcVar = this.f101308jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                specialBannerViewModel.E0(wkgbmnqykcVar, new s71.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf(false), (s71.zoijcleaow) objWkgbmnqykc);
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                SpecialBannerViewModel.F0(specialBannerViewModel, wkgbmnqykcVar, s71.wkgbmnqykc.iobyxmoadg.C2573iobyxmoadg.f105665iobyxmoadg, null, 4, null);
                specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f101312yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101313zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            dxjokdxxww dxjokdxxwwVar = SpecialBannerViewModel.this.new dxjokdxxww(gxszxtbevoVar);
            dxjokdxxwwVar.f101312yggfygwlhe = obj;
            return dxjokdxxwwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f101313zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(((Throwable) this.f101312yggfygwlhe) instanceof CancellationException) && SpecialBannerViewModel.this.f101259sopmlzcsov == null) {
                SpecialBannerViewModel.this.c();
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(th2, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ProductUiModel f101314iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f101316yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f101317zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f101318yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f101319zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(SpecialBannerViewModel specialBannerViewModel, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f101318yggfygwlhe = specialBannerViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f101318yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f101319zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    this.f101319zdlpuopuiu = 1;
                    if (pj.crxdokpmqz.zoijcleaow(350L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                this.f101318yggfygwlhe.yggfygwlhe(new czzsidtyhn.yggfygwlhe(vk0.lqeggnwhkg.proloyalty_purchases_list_product_added_to_the_list));
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(ProductUiModel productUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101314iwizpuwonk = productUiModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void kcexrzcfyt(SpecialBannerViewModel specialBannerViewModel, Object obj) {
            if (specialBannerViewModel.f101238jpowsppfya.ppxfxbqfkf(obj)) {
                pj.gtknphoqwx.wkgbmnqykc(specialBannerViewModel.agtfadlqog(), null, null, new iobyxmoadg(specialBannerViewModel, null), 3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new eablkybsjg(this.f101314iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object next;
            ProductUIData productUIData;
            Throwable th2;
            Object objWkgbmnqykc;
            MeasureType currentMeasure;
            double basketDefault;
            MeasureType measureType;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101316yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                List list = SpecialBannerViewModel.this.f101258sflfametgt;
                ProductUiModel productUiModel = this.f101314iwizpuwonk;
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), productUiModel.getId()));
                ProductUIData productUIData2 = (ProductUIData) next;
                SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    ek1.iobyxmoadg iobyxmoadgVar2 = specialBannerViewModel.f101270yadqdtsiqt;
                    this.f101317zdlpuopuiu = productUIData2;
                    this.f101316yggfygwlhe = 1;
                    Object objZoijcleaow = iobyxmoadgVar2.zoijcleaow(this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    productUIData = productUIData2;
                    obj = objZoijcleaow;
                } catch (Throwable th3) {
                    productUIData = productUIData2;
                    th2 = th3;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                productUIData = (ProductUIData) this.f101317zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
            ProductUiModel productUiModel2 = this.f101314iwizpuwonk;
            final SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                List list2 = (List) objWkgbmnqykc;
                if (productUIData == null || (measureType = productUIData.getMeasureType()) == null || (currentMeasure = measureType.mbcevpiqjq(productUiModel2.getMeasureTypeModel())) == null) {
                    currentMeasure = productUiModel2.getMeasureTypeModel().getCurrentMeasure();
                }
                String article = productUiModel2.getArticle();
                if (productUIData != null) {
                    Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(productUIData.getQuantity());
                    Double d13 = dZoijcleaow.doubleValue() > 0.0d ? dZoijcleaow : null;
                    if (d13 != null) {
                        basketDefault = d13.doubleValue();
                    } else {
                        basketDefault = currentMeasure.getBasketDefault();
                    }
                } else {
                    basketDefault = currentMeasure.getBasketDefault();
                }
                specialBannerViewModel2.yggfygwlhe(new czzsidtyhn.dxjokdxxww(new PurchaseListAddProductDialogArgs.SingleProduct(article, basketDefault, currentMeasure.getValue(), list2)));
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(specialBannerViewModel2.f101238jpowsppfya.zoijcleaow(), new l9.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.lrnfpwlwnk
                    @Override // l9.draadjrbmk
                    public final void iobyxmoadg(Object obj2) {
                        SpecialBannerViewModel.eablkybsjg.kcexrzcfyt(specialBannerViewModel2, obj2);
                    }
                });
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                specialBannerViewModel2.zdlpuopuiu(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f101321yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101322zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            esjtqupxsv esjtqupxsvVar = SpecialBannerViewModel.this.new esjtqupxsv(gxszxtbevoVar);
            esjtqupxsvVar.f101321yggfygwlhe = obj;
            return esjtqupxsvVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f101322zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            dz0.eablkybsjg eablkybsjgVar = (dz0.eablkybsjg) this.f101321yggfygwlhe;
            if (eablkybsjgVar instanceof dz0.eablkybsjg.iobyxmoadg) {
                SpecialBannerViewModel.this.zdlpuopuiu(((dz0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof dz0.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                SpecialBannerViewModel.this.s0(((dz0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((esjtqupxsv) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ur1.zoijcleaow f101323jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101325zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(ur1.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101323jyumaefscl = zoijcleaowVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.zoijcleaow kcexrzcfyt(vq1.gxszxtbevo.iobyxmoadg iobyxmoadgVar, ur1.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar) {
            if (iobyxmoadgVar != null) {
                boolean zWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
                ur1.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = ur1.zoijcleaow.ppxfxbqfkf.nufgyqmvbu(ppxfxbqfkfVar, null, iobyxmoadgVar.ppxfxbqfkf(), null, zWkgbmnqykc, false, iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), 5, null);
                if (ppxfxbqfkfVarNufgyqmvbu != null) {
                    return ppxfxbqfkfVarNufgyqmvbu;
                }
            }
            return ur1.zoijcleaow.ppxfxbqfkf.nufgyqmvbu(ppxfxbqfkfVar, null, null, null, false, false, null, null, 111, null);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new gtknphoqwx(this.f101323jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object value;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101325zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                    ur1.zoijcleaow zoijcleaowVar = this.f101323jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    wq1.iobyxmoadg iobyxmoadgVar2 = specialBannerViewModel.f101231hkdspvbjdz;
                    String strWkgbmnqykc = ((rlfsiqarku) specialBannerViewModel.gtknphoqwx()).wkgbmnqykc();
                    String itemId = zoijcleaowVar.getItemId();
                    this.f101325zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.iobyxmoadg(strWkgbmnqykc, itemId, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((vq1.gxszxtbevo.iobyxmoadg) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                specialBannerViewModel2.zdlpuopuiu(thDxjokdxxww);
                objWkgbmnqykc = null;
            }
            final vq1.gxszxtbevo.iobyxmoadg iobyxmoadgVar4 = (vq1.gxszxtbevo.iobyxmoadg) objWkgbmnqykc;
            List listE = SpecialBannerViewModel.E(((rlfsiqarku) SpecialBannerViewModel.this.gtknphoqwx()).eablkybsjg(), this.f101323jyumaefscl, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.zeieaojujs
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj2) {
                    return SpecialBannerViewModel.gtknphoqwx.kcexrzcfyt(iobyxmoadgVar4, (ur1.zoijcleaow.ppxfxbqfkf) obj2);
                }
            });
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = SpecialBannerViewModel.this.ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow((rlfsiqarku) value, null, null, null, null, false, listE, false, 95, null)));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f101326cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f101328jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f101329yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f101330zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f101328jyumaefscl = obj;
            this.f101326cqumvgiudr |= Integer.MIN_VALUE;
            return SpecialBannerViewModel.this.fmlbqenlif(null, this);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101332zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ boolean f101333jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f101334yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f101335zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((List) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f101335zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return gg.cqumvgiudr.iobyxmoadg((List) this.f101334yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f101333jyumaefscl));
            }

            public final Object ojitshcjhn(List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar.f101334yggfygwlhe = list;
                iobyxmoadgVar.f101333jyumaefscl = z13;
                return iobyxmoadgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f101336zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f101337zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.specialbanner.impl.presentation.SpecialBannerViewModel$iwizpuwonk$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2439iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f101339yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f101340zdlpuopuiu;

                    public C2439iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f101340zdlpuopuiu = obj;
                        this.f101339yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f101337zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2439iobyxmoadg c2439iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2439iobyxmoadg) {
                        c2439iobyxmoadg = (C2439iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2439iobyxmoadg.f101339yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2439iobyxmoadg.f101339yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2439iobyxmoadg = new C2439iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2439iobyxmoadg = new C2439iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2439iobyxmoadg.f101340zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2439iobyxmoadg.f101339yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f101337zdlpuopuiu;
                        if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                            c2439iobyxmoadg.f101339yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2439iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f101336zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f101336zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f101341zdlpuopuiu;

            static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                int f101342iwizpuwonk;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                /* synthetic */ Object f101344yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                Object f101345zdlpuopuiu;

                iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f101344yggfygwlhe = obj;
                    this.f101342iwizpuwonk |= Integer.MIN_VALUE;
                    return zoijcleaow.this.emit(null, this);
                }
            }

            zoijcleaow(SpecialBannerViewModel specialBannerViewModel) {
                this.f101341zdlpuopuiu = specialBannerViewModel;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar;
                zoijcleaow zoijcleaowVar;
                Object value;
                if (gxszxtbevoVar instanceof iobyxmoadg) {
                    iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                    int i13 = iobyxmoadgVar.f101342iwizpuwonk;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        iobyxmoadgVar.f101342iwizpuwonk = i13 - Integer.MIN_VALUE;
                    } else {
                        iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
                Object objInvoke = iobyxmoadgVar.f101344yggfygwlhe;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = iobyxmoadgVar.f101342iwizpuwonk;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                    List list = (List) vdvldrhtssVar.iobyxmoadg();
                    this.f101341zdlpuopuiu.f101258sflfametgt = list;
                    ts1.iobyxmoadg iobyxmoadgVar2 = this.f101341zdlpuopuiu.f101222cqumvgiudr;
                    List listEablkybsjg = ((rlfsiqarku) this.f101341zdlpuopuiu.gtknphoqwx()).eablkybsjg();
                    iobyxmoadgVar.f101345zdlpuopuiu = this;
                    iobyxmoadgVar.f101342iwizpuwonk = 1;
                    objInvoke = iobyxmoadgVar2.invoke(listEablkybsjg, list, iobyxmoadgVar);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f101345zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                }
                List list2 = (List) objInvoke;
                sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = zoijcleaowVar.f101341zdlpuopuiu.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow((rlfsiqarku) value, null, null, null, null, false, list2, false, 95, null)));
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new iwizpuwonk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101332zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(sj.dxjokdxxww.wflxmlrfwp(SpecialBannerViewModel.this.f().iobyxmoadg(), SpecialBannerViewModel.this.i(), new iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(SpecialBannerViewModel.this);
                this.f101332zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.collect(zoijcleaowVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iwizpuwonk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f101346yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101347zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f101347zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f101346yggfygwlhe, new CrashlyticsKey[0]);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f101346yggfygwlhe = th2;
            return jyumaefsclVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f101348jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101350zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        kcexrzcfyt(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101348jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new kcexrzcfyt(this.f101348jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101350zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                dz0.btonecajqb btonecajqbVarF = SpecialBannerViewModel.this.f();
                ChangeProductParams changeProductParams = this.f101348jyumaefscl;
                this.f101350zdlpuopuiu = 1;
                if (btonecajqbVarF.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((kcexrzcfyt) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f101351jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101353zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ String f101354yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f101355zdlpuopuiu;

            iobyxmoadg(SpecialBannerViewModel specialBannerViewModel, String str) {
                this.f101355zdlpuopuiu = specialBannerViewModel;
                this.f101354yggfygwlhe = str;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, lg.gxszxtbevo gxszxtbevoVar) {
                this.f101355zdlpuopuiu.P0(this.f101354yggfygwlhe, list);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lereixgezr(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101351jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new lereixgezr(this.f101351jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101353zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = SpecialBannerViewModel.this.f101274ylkuphrtab.zoijcleaow(this.f101351jyumaefscl, SpecialBannerViewModel.this.f101224czzsidtyhn);
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(SpecialBannerViewModel.this, this.f101351jyumaefscl);
                this.f101353zdlpuopuiu = 1;
                if (lqeggnwhkgVarZoijcleaow.collect(iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lereixgezr) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f101357yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        boolean f101358zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0091  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            boolean z13;
            String landingPageKey;
            boolean z14;
            Object objWkgbmnqykc;
            SpecialBannerViewModel specialBannerViewModel;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101357yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.this.B0(true);
                t81.iobyxmoadg iobyxmoadgVar = SpecialBannerViewModel.this.f101268wypolnanlu;
                s81.iobyxmoadg iobyxmoadgVar2 = s81.iobyxmoadg.f105739pkzmftpjix;
                this.f101357yggfygwlhe = 1;
                obj = iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else if (i13 == 1) {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z14 = this.f101358zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((vq1.rgvfuqvkyq) obj);
                    } catch (Throwable th2) {
                        th = th2;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    }
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.f101247metgxyhuhe = false;
                        specialBannerViewModel.j0((vq1.rgvfuqvkyq) objWkgbmnqykc, z14);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null && !(thDxjokdxxww instanceof CancellationException)) {
                        specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                    }
                    SpecialBannerViewModel.this.B0(false);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                z13 = this.f101358zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                pz0.iobyxmoadg iobyxmoadgVar4 = (pz0.iobyxmoadg) obj;
                lq1.iobyxmoadg iobyxmoadgVar5 = new lq1.iobyxmoadg(SpecialBannerViewModel.this.f101239jyumaefscl.getBannerId(), iobyxmoadgVar4.wkgbmnqykc(), iobyxmoadgVar4.ppxfxbqfkf(), null, false);
                landingPageKey = SpecialBannerViewModel.this.f101239jyumaefscl.getLandingPageKey();
                if (!SpecialBannerViewModel.this.f101247metgxyhuhe) {
                    landingPageKey = null;
                }
                SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    wq1.iobyxmoadg iobyxmoadgVar7 = specialBannerViewModel2.f101231hkdspvbjdz;
                    this.f101358zdlpuopuiu = z13;
                    this.f101357yggfygwlhe = 3;
                    obj = iobyxmoadgVar7.eablkybsjg(landingPageKey, iobyxmoadgVar5, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    z14 = z13;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((vq1.rgvfuqvkyq) obj);
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.f101247metgxyhuhe = false;
                        specialBannerViewModel.j0((vq1.rgvfuqvkyq) objWkgbmnqykc, z14);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                    }
                    SpecialBannerViewModel.this.B0(false);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th3) {
                    th = th3;
                    z14 = z13;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            m01.iobyxmoadg iobyxmoadgVar9 = SpecialBannerViewModel.this.f101260stevsuqkhv;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            this.f101358zdlpuopuiu = zBooleanValue;
            this.f101357yggfygwlhe = 2;
            Object objZoijcleaow = iobyxmoadgVar9.zoijcleaow(wwaezpbzknVar, this);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            z13 = zBooleanValue;
            obj = objZoijcleaow;
            pz0.iobyxmoadg iobyxmoadgVar10 = (pz0.iobyxmoadg) obj;
            lq1.iobyxmoadg iobyxmoadgVar11 = new lq1.iobyxmoadg(SpecialBannerViewModel.this.f101239jyumaefscl.getBannerId(), iobyxmoadgVar10.wkgbmnqykc(), iobyxmoadgVar10.ppxfxbqfkf(), null, false);
            landingPageKey = SpecialBannerViewModel.this.f101239jyumaefscl.getLandingPageKey();
            if (!SpecialBannerViewModel.this.f101247metgxyhuhe) {
                landingPageKey = null;
            }
            SpecialBannerViewModel specialBannerViewModel3 = SpecialBannerViewModel.this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar12 = gg.kcexrzcfyt.f37117yggfygwlhe;
            wq1.iobyxmoadg iobyxmoadgVar13 = specialBannerViewModel3.f101231hkdspvbjdz;
            this.f101358zdlpuopuiu = z13;
            this.f101357yggfygwlhe = 3;
            obj = iobyxmoadgVar13.eablkybsjg(landingPageKey, iobyxmoadgVar11, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            z14 = z13;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((vq1.rgvfuqvkyq) obj);
            specialBannerViewModel = SpecialBannerViewModel.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                specialBannerViewModel.f101247metgxyhuhe = false;
                specialBannerViewModel.j0((vq1.rgvfuqvkyq) objWkgbmnqykc, z14);
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
            }
            SpecialBannerViewModel.this.B0(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f101360yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101361zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            nufgyqmvbu nufgyqmvbuVar = SpecialBannerViewModel.this.new nufgyqmvbu(gxszxtbevoVar);
            nufgyqmvbuVar.f101360yggfygwlhe = obj;
            return nufgyqmvbuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f101361zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(((Throwable) this.f101360yggfygwlhe) instanceof CancellationException) && SpecialBannerViewModel.this.f101259sopmlzcsov == null) {
                SpecialBannerViewModel.this.c();
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(th2, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f101362jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101364zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ojitshcjhn(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101362jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new ojitshcjhn(this.f101362jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101364zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                ChangeProductParams changeProductParams = this.f101362jyumaefscl;
                this.f101364zdlpuopuiu = 1;
                if (specialBannerViewModel.fmlbqenlif(changeProductParams, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f101365cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f101366iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f101367jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101369zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        oxmwwwfdhm(String str, String str2, String str3, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101367jyumaefscl = str;
            this.f101366iwizpuwonk = str2;
            this.f101365cqumvgiudr = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new oxmwwwfdhm(this.f101367jyumaefscl, this.f101366iwizpuwonk, this.f101365cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101369zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    SpecialBannerViewModel.this.ixidwrxhsl(this.f101367jyumaefscl, true);
                    SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                    String str = this.f101367jyumaefscl;
                    String str2 = this.f101366iwizpuwonk;
                    String str3 = this.f101365cqumvgiudr;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    dv0.iobyxmoadg iobyxmoadgVar2 = specialBannerViewModel.f101274ylkuphrtab;
                    String strWkgbmnqykc = ((rlfsiqarku) specialBannerViewModel.gtknphoqwx()).wkgbmnqykc();
                    this.f101369zdlpuopuiu = 1;
                    if (iobyxmoadgVar2.wkgbmnqykc(str, strWkgbmnqykc, str2, str3, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
            if (gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                specialBannerViewModel2.yggfygwlhe(czzsidtyhn.btonecajqb.f101401iobyxmoadg);
            }
            SpecialBannerViewModel.this.ixidwrxhsl(this.f101367jyumaefscl, false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f101370iobyxmoadg;

        static {
            int[] iArr = new int[k21.ojitshcjhn.values().length];
            try {
                iArr[k21.ojitshcjhn.QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k21.ojitshcjhn.EVROPOLIS_GIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101370iobyxmoadg = iArr;
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ yr1.iobyxmoadg f101371cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f101373jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f101374yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f101375zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(yr1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101371cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new rgvfuqvkyq(this.f101371cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x009e  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:30:0x00af  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:38:0x00df A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:47:0x0108  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            SpecialBannerViewModel specialBannerViewModel;
            yr1.iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            yr1.iobyxmoadg iobyxmoadgVar2;
            SpecialBannerViewModel specialBannerViewModel2;
            String str;
            Object objZoijcleaow;
            yr1.iobyxmoadg iobyxmoadgVar3;
            SpecialBannerViewModel specialBannerViewModel3;
            String strWflxmlrfwp;
            String str2;
            String strGtknphoqwx;
            vq1.pmvmpeiblj pmvmpeibljVarVdvldrhtss;
            vq1.pmvmpeiblj pmvmpeibljVar;
            String str3;
            String str4;
            xq1.ppxfxbqfkf ppxfxbqfkfVar;
            xq1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar4;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101373jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        specialBannerViewModel3 = (SpecialBannerViewModel) this.f101374yggfygwlhe;
                        yr1.iobyxmoadg iobyxmoadgVar5 = (yr1.iobyxmoadg) this.f101375zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        iobyxmoadgVar3 = iobyxmoadgVar5;
                        objZoijcleaow = obj;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    iobyxmoadgVar = this.f101371cqumvgiudr;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.n0(iobyxmoadgVar.getItemId());
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        specialBannerViewModel.m0(thDxjokdxxww);
                    }
                    SpecialBannerViewModel.this.B0(false);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.this.B0(true);
                iobyxmoadgVar2 = this.f101371cqumvgiudr;
                specialBannerViewModel2 = SpecialBannerViewModel.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                String strBtonecajqb = iobyxmoadgVar2.btonecajqb();
                if (strBtonecajqb != null) {
                    x01.zoijcleaow zoijcleaowVar = specialBannerViewModel2.f101241kcexrzcfyt;
                    x01.zoijcleaow.iobyxmoadg iobyxmoadgVar7 = new x01.zoijcleaow.iobyxmoadg(strBtonecajqb, 10);
                    this.f101375zdlpuopuiu = iobyxmoadgVar2;
                    this.f101374yggfygwlhe = specialBannerViewModel2;
                    this.f101373jyumaefscl = 1;
                    objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar7, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    specialBannerViewModel3 = specialBannerViewModel2;
                } else {
                    str = null;
                }
                String bannerId = specialBannerViewModel2.f101239jyumaefscl.getBannerId();
                int i14 = Integer.parseInt(iobyxmoadgVar2.getItemId());
                String strOxmwwwfdhm = iobyxmoadgVar2.oxmwwwfdhm();
                String strOjitshcjhn = iobyxmoadgVar2.ojitshcjhn();
                String strDxjokdxxww = iobyxmoadgVar2.dxjokdxxww();
                String strEablkybsjg = iobyxmoadgVar2.eablkybsjg();
                String strWkgbmnqykc = iobyxmoadgVar2.vdvldrhtss().wkgbmnqykc();
                strWflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp();
                if (iobyxmoadgVar2.vdvldrhtss() == vq1.pmvmpeiblj.ONLINE) {
                    str2 = strWflxmlrfwp;
                } else {
                    str2 = null;
                }
                strGtknphoqwx = iobyxmoadgVar2.gtknphoqwx();
                pmvmpeibljVarVdvldrhtss = iobyxmoadgVar2.vdvldrhtss();
                pmvmpeibljVar = vq1.pmvmpeiblj.IN_STORE;
                if (pmvmpeibljVarVdvldrhtss == pmvmpeibljVar) {
                    str3 = strGtknphoqwx;
                } else {
                    str3 = null;
                }
                if (iobyxmoadgVar2.vdvldrhtss() == pmvmpeibljVar) {
                    str4 = str;
                } else {
                    str4 = null;
                }
                vq1.esjtqupxsv esjtqupxsvVar = new vq1.esjtqupxsv(bannerId, i14, strOxmwwwfdhm, strOjitshcjhn, strDxjokdxxww, strEablkybsjg, strWkgbmnqykc, str2, str3, iobyxmoadgVar2.rgvfuqvkyq(), str4);
                ppxfxbqfkfVar = specialBannerViewModel2.f101255rgvfuqvkyq;
                iobyxmoadgVar4 = new xq1.ppxfxbqfkf.iobyxmoadg(esjtqupxsvVar);
                this.f101375zdlpuopuiu = null;
                this.f101374yggfygwlhe = null;
                this.f101373jyumaefscl = 2;
                if (ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar4, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
                specialBannerViewModel = SpecialBannerViewModel.this;
                iobyxmoadgVar = this.f101371cqumvgiudr;
                if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    specialBannerViewModel.n0(iobyxmoadgVar.getItemId());
                }
                thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    specialBannerViewModel.m0(thDxjokdxxww);
                }
                SpecialBannerViewModel.this.B0(false);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
                str = (String) objZoijcleaow;
                yr1.iobyxmoadg iobyxmoadgVar8 = iobyxmoadgVar3;
                specialBannerViewModel2 = specialBannerViewModel3;
                iobyxmoadgVar2 = iobyxmoadgVar8;
                String bannerId2 = specialBannerViewModel2.f101239jyumaefscl.getBannerId();
                int i15 = Integer.parseInt(iobyxmoadgVar2.getItemId());
                String strOxmwwwfdhm2 = iobyxmoadgVar2.oxmwwwfdhm();
                String strOjitshcjhn2 = iobyxmoadgVar2.ojitshcjhn();
                String strDxjokdxxww2 = iobyxmoadgVar2.dxjokdxxww();
                String strEablkybsjg2 = iobyxmoadgVar2.eablkybsjg();
                String strWkgbmnqykc2 = iobyxmoadgVar2.vdvldrhtss().wkgbmnqykc();
                strWflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp();
                if (iobyxmoadgVar2.vdvldrhtss() == vq1.pmvmpeiblj.ONLINE) {
                    str2 = strWflxmlrfwp;
                } else {
                    str2 = null;
                }
                strGtknphoqwx = iobyxmoadgVar2.gtknphoqwx();
                pmvmpeibljVarVdvldrhtss = iobyxmoadgVar2.vdvldrhtss();
                pmvmpeibljVar = vq1.pmvmpeiblj.IN_STORE;
                if (pmvmpeibljVarVdvldrhtss == pmvmpeibljVar) {
                    str3 = strGtknphoqwx;
                } else {
                    str3 = null;
                }
                if (iobyxmoadgVar2.vdvldrhtss() == pmvmpeibljVar) {
                    str4 = str;
                } else {
                    str4 = null;
                }
                vq1.esjtqupxsv esjtqupxsvVar2 = new vq1.esjtqupxsv(bannerId2, i15, strOxmwwwfdhm2, strOjitshcjhn2, strDxjokdxxww2, strEablkybsjg2, strWkgbmnqykc2, str2, str3, iobyxmoadgVar2.rgvfuqvkyq(), str4);
                ppxfxbqfkfVar = specialBannerViewModel2.f101255rgvfuqvkyq;
                iobyxmoadgVar4 = new xq1.ppxfxbqfkf.iobyxmoadg(esjtqupxsvVar2);
                this.f101375zdlpuopuiu = null;
                this.f101374yggfygwlhe = null;
                this.f101373jyumaefscl = 2;
                if (ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar4, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            specialBannerViewModel = SpecialBannerViewModel.this;
            iobyxmoadgVar = this.f101371cqumvgiudr;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                specialBannerViewModel.n0(iobyxmoadgVar.getItemId());
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                specialBannerViewModel.m0(thDxjokdxxww);
            }
            SpecialBannerViewModel.this.B0(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ is1.ppxfxbqfkf f101376jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101378zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        vdvldrhtss(is1.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101376jyumaefscl = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new vdvldrhtss(this.f101376jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            String strWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101378zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    SpecialBannerViewModel.this.B0(true);
                    SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                    is1.ppxfxbqfkf ppxfxbqfkfVar = this.f101376jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    t71.iobyxmoadg iobyxmoadgVar2 = specialBannerViewModel.f101252oxmwwwfdhm;
                    is1.zoijcleaow zoijcleaowVarWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
                    if (zoijcleaowVarWkgbmnqykc == null || (strWkgbmnqykc = zoijcleaowVarWkgbmnqykc.wkgbmnqykc()) == null) {
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    int i14 = Integer.parseInt(strWkgbmnqykc);
                    pz0.iobyxmoadg iobyxmoadgVarE = specialBannerViewModel.e();
                    String strWkgbmnqykc2 = iobyxmoadgVarE != null ? iobyxmoadgVarE.wkgbmnqykc() : null;
                    if (strWkgbmnqykc2 == null) {
                        strWkgbmnqykc2 = "";
                    }
                    pz0.iobyxmoadg iobyxmoadgVarE2 = specialBannerViewModel.e();
                    t71.iobyxmoadg.C2700iobyxmoadg c2700iobyxmoadg = new t71.iobyxmoadg.C2700iobyxmoadg(i14, strWkgbmnqykc2, iobyxmoadgVarE2 != null ? iobyxmoadgVarE2.ppxfxbqfkf() : null);
                    this.f101378zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.invoke(c2700iobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((EvropolisGift) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                specialBannerViewModel2.B0(false);
                specialBannerViewModel2.zdlpuopuiu(thDxjokdxxww);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            EvropolisGift evropolisGift = (EvropolisGift) objWkgbmnqykc;
            SpecialBannerViewModel.this.B0(false);
            SpecialBannerViewModel specialBannerViewModel3 = SpecialBannerViewModel.this;
            pz0.iobyxmoadg iobyxmoadgVarE3 = SpecialBannerViewModel.this.e();
            specialBannerViewModel3.yggfygwlhe(new czzsidtyhn.gtknphoqwx(evropolisGift, iobyxmoadgVarE3 != null ? iobyxmoadgVarE3.ppxfxbqfkf() : null));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ProductUiModel f101379iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ AnalyticsLocation.ItemFeed f101380jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101382zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(AnalyticsLocation.ItemFeed itemFeed, ProductUiModel productUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101380jyumaefscl = itemFeed;
            this.f101379iwizpuwonk = productUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new wflxmlrfwp(this.f101380jyumaefscl, this.f101379iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101382zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                xm0.zoijcleaow.C3095zoijcleaow c3095zoijcleaow = new xm0.zoijcleaow.C3095zoijcleaow(new AnalyticsPage.LandingPage(((rlfsiqarku) SpecialBannerViewModel.this.gtknphoqwx()).lqeggnwhkg(), ((rlfsiqarku) SpecialBannerViewModel.this.gtknphoqwx()).wkgbmnqykc()), this.f101380jyumaefscl, new AnalyticElement.ProductItemElement(this.f101379iwizpuwonk.getArticle(), this.f101379iwizpuwonk.getName()));
                lw1.iobyxmoadg iobyxmoadgVar = SpecialBannerViewModel.this.f101226dsvhmnatus;
                String id2 = this.f101379iwizpuwonk.getId();
                boolean isFavorite = this.f101379iwizpuwonk.getIsFavorite();
                this.f101382zdlpuopuiu = 1;
                if (iobyxmoadgVar.lqeggnwhkg(id2, isFavorite, c3095zoijcleaow, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f101383iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f101384jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101386zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101384jyumaefscl = comboSetProduct;
            this.f101383iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new wkgbmnqykc(this.f101384jyumaefscl, this.f101383iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objAgtfadlqog;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101386zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.this.B0(true);
                cz0.iobyxmoadg iobyxmoadgVar = SpecialBannerViewModel.this.f101225draadjrbmk;
                ComboSetProduct comboSetProduct = this.f101384jyumaefscl;
                ComboSetProduct comboSetProduct2 = this.f101383iwizpuwonk;
                this.f101386zdlpuopuiu = 1;
                objAgtfadlqog = iobyxmoadgVar.agtfadlqog(comboSetProduct, comboSetProduct2, this);
                if (objAgtfadlqog == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                objAgtfadlqog = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
            }
            SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
            if (gg.kcexrzcfyt.agtfadlqog(objAgtfadlqog)) {
                specialBannerViewModel.u(((kz0.iobyxmoadg) objAgtfadlqog).zoijcleaow());
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objAgtfadlqog);
            if (thDxjokdxxww != null) {
                specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
            }
            SpecialBannerViewModel.this.ppxfxbqfkf(null);
            SpecialBannerViewModel.this.B0(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f101388yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101389zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            yggfygwlhe yggfygwlheVar = SpecialBannerViewModel.this.new yggfygwlhe(gxszxtbevoVar);
            yggfygwlheVar.f101388yggfygwlhe = obj;
            return yggfygwlheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f101389zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg = (lw1.iobyxmoadg.C1331iobyxmoadg) this.f101388yggfygwlhe;
            SpecialBannerViewModel.this.mhtqkkgtqm(c1331iobyxmoadg.wkgbmnqykc(), c1331iobyxmoadg.eablkybsjg());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((yggfygwlhe) create(c1331iobyxmoadg, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class zdlpuopuiu extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        zdlpuopuiu(Object obj) {
            super(2, obj, q41.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((q41.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vq1.istkbnxepw f101390iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final UserInfo f101391ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f101392wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f101393zoijcleaow;

        public zoijcleaow(vq1.istkbnxepw banner, Map boundedBoxes, UserInfo userInfo, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(boundedBoxes, "boundedBoxes");
            this.f101390iobyxmoadg = banner;
            this.f101393zoijcleaow = boundedBoxes;
            this.f101391ppxfxbqfkf = userInfo;
            this.f101392wkgbmnqykc = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101390iobyxmoadg, zoijcleaowVar.f101390iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101393zoijcleaow, zoijcleaowVar.f101393zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101391ppxfxbqfkf, zoijcleaowVar.f101391ppxfxbqfkf) && this.f101392wkgbmnqykc == zoijcleaowVar.f101392wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((this.f101390iobyxmoadg.hashCode() * 31) + this.f101393zoijcleaow.hashCode()) * 31;
            UserInfo userInfo = this.f101391ppxfxbqfkf;
            return ((iHashCode + (userInfo == null ? 0 : userInfo.hashCode())) * 31) + Boolean.hashCode(this.f101392wkgbmnqykc);
        }

        public final vq1.istkbnxepw iobyxmoadg() {
            return this.f101390iobyxmoadg;
        }

        public final UserInfo ppxfxbqfkf() {
            return this.f101391ppxfxbqfkf;
        }

        public String toString() {
            return "PendingBannerData(banner=" + this.f101390iobyxmoadg + ", boundedBoxes=" + this.f101393zoijcleaow + ", user=" + this.f101391ppxfxbqfkf + ", isRegistrationFormEnabled=" + this.f101392wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f101392wkgbmnqykc;
        }

        public final Map zoijcleaow() {
            return this.f101393zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialBannerViewModel(el1.iobyxmoadg getDefaultFeedbackPhoneUseCase, ow1.zoijcleaow changeAdultCheckedUseCase, ow1.iwizpuwonk isAdultCheckedUseCase, ow1.esjtqupxsv isAuthUseCase, cz0.iobyxmoadg cartInteractor, ow1.ylkuphrtab subscribeuserIsAuthUseCase, p01.ppxfxbqfkf clearCartUseCase, jztzpxfvev specialBannerUiMapper, xq1.ppxfxbqfkf sendSpecialBannerFormUseCase, t71.zoijcleaow evropolisRedeemUseCase, t71.iobyxmoadg evropolisGiftUseCase, x01.zoijcleaow tryEncodeUriToBase64UseCase, x01.iobyxmoadg getFileNameFromUriUseCase, xq1.zoijcleaow getFileSizeFromUriUseCase, SpecialBannerPayload payload, dz0.gtknphoqwx productChangesSourceProvider, ts1.iobyxmoadg updateSpecialBannersByCartDataUseCase, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, q41.iobyxmoadg resourcesManager, pw1.iobyxmoadg videoPlayerFeatureApi, an0.iobyxmoadg authFeatureApi, xo0.iobyxmoadg catalogFeatureApi, li1.iobyxmoadg promoCollectionFeatureApi, ek1.iobyxmoadg purchasesListComponentApi, kc1.zoijcleaow loyaltyProgramFeatureApi, vw1.iobyxmoadg webViewScreenFeatureApi, bl1.iobyxmoadg feedbackFeatureApi, dv0.iobyxmoadg promoCollectionComponentApi, androidx.lifecycle.pkzmftpjix savedStateHandle, vm0.zoijcleaow analyticsTracker, CreatePurchaseListsResultHelper resultHelper, wq1.iobyxmoadg specialBannerRepository, ow1.wflxmlrfwp fetchAndSaveIsAgreementAcceptedUseCase, lw1.iobyxmoadg changeFavoritesInteractor, t81.iobyxmoadg featureManager, m01.iobyxmoadg getCurrentDeliveryDataUseCase, n91.ppxfxbqfkf comboSetUiMapper) {
        super(new rlfsiqarku(null, null, null, null, false, null, false, 127, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeuserIsAuthUseCase, "subscribeuserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerUiMapper, "specialBannerUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sendSpecialBannerFormUseCase, "sendSpecialBannerFormUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(evropolisRedeemUseCase, "evropolisRedeemUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(evropolisGiftUseCase, "evropolisGiftUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tryEncodeUriToBase64UseCase, "tryEncodeUriToBase64UseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getFileNameFromUriUseCase, "getFileNameFromUriUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getFileSizeFromUriUseCase, "getFileSizeFromUriUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateSpecialBannersByCartDataUseCase, "updateSpecialBannersByCartDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(videoPlayerFeatureApi, "videoPlayerFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionFeatureApi, "promoCollectionFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loyaltyProgramFeatureApi, "loyaltyProgramFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feedbackFeatureApi, "feedbackFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionComponentApi, "promoCollectionComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerRepository, "specialBannerRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fetchAndSaveIsAgreementAcceptedUseCase, "fetchAndSaveIsAgreementAcceptedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetUiMapper, "comboSetUiMapper");
        this.f101245lqeggnwhkg = new pw0.ppxfxbqfkf();
        this.f101249nufgyqmvbu = getDefaultFeedbackPhoneUseCase;
        this.f101227dxjokdxxww = changeAdultCheckedUseCase;
        this.f101219btonecajqb = isAdultCheckedUseCase;
        this.f101229gtknphoqwx = isAuthUseCase;
        this.f101225draadjrbmk = cartInteractor;
        this.f101266wflxmlrfwp = subscribeuserIsAuthUseCase;
        this.f101218agtfadlqog = clearCartUseCase;
        this.f101250ojitshcjhn = specialBannerUiMapper;
        this.f101255rgvfuqvkyq = sendSpecialBannerFormUseCase;
        this.f101264vdvldrhtss = evropolisRedeemUseCase;
        this.f101252oxmwwwfdhm = evropolisGiftUseCase;
        this.f101241kcexrzcfyt = tryEncodeUriToBase64UseCase;
        this.f101275zdlpuopuiu = getFileNameFromUriUseCase;
        this.f101273yggfygwlhe = getFileSizeFromUriUseCase;
        this.f101239jyumaefscl = payload;
        this.f101235iwizpuwonk = productChangesSourceProvider;
        this.f101222cqumvgiudr = updateSpecialBannersByCartDataUseCase;
        this.f101228esjtqupxsv = subscribeToCurrentDeliveryDataUseCase;
        this.f101243lereixgezr = resourcesManager;
        this.f101254pmvmpeiblj = videoPlayerFeatureApi;
        this.f101277zynmafqrjb = authFeatureApi;
        this.f101234istkbnxepw = catalogFeatureApi;
        this.f101220cdpycssgdh = promoCollectionFeatureApi;
        this.f101270yadqdtsiqt = purchasesListComponentApi;
        this.f101233iozdgvuglv = loyaltyProgramFeatureApi;
        this.f101244lmojexxdyd = webViewScreenFeatureApi;
        this.f101267wwaezpbzkn = feedbackFeatureApi;
        this.f101274ylkuphrtab = promoCollectionComponentApi;
        this.f101253pkzmftpjix = savedStateHandle;
        this.f101230hcddaimhww = analyticsTracker;
        this.f101238jpowsppfya = resultHelper;
        this.f101231hkdspvbjdz = specialBannerRepository;
        this.f101221cllcsxoeiz = fetchAndSaveIsAgreementAcceptedUseCase;
        this.f101226dsvhmnatus = changeFavoritesInteractor;
        this.f101268wypolnanlu = featureManager;
        this.f101260stevsuqkhv = getCurrentDeliveryDataUseCase;
        this.f101242kegysxyocb = comboSetUiMapper;
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(calendar, "getInstance(...)");
        this.f101223crxdokpmqz = calendar;
        this.f101256ribwqtqdhb = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.bfopjjpdmp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerViewModel.M0();
            }
        });
        this.f101265vipkmwdibw = ((Boolean) isAdultCheckedUseCase.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        this.f101247metgxyhuhe = true;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        this.f101224czzsidtyhn = string;
        this.f101263uwvvkdfqfp = g();
        this.f101258sflfametgt = hg.jyumaefscl.wflxmlrfwp();
        this.f101276zfvoamnweg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.opjhrmiecq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerViewModel.t0(this.f101472zdlpuopuiu);
            }
        });
        v();
        H0();
        I0();
        G0();
    }

    private final void A() {
        this.f101274ylkuphrtab.ppxfxbqfkf(this.f101224czzsidtyhn);
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
    }

    static /* synthetic */ void A0(SpecialBannerViewModel specialBannerViewModel, vq1.istkbnxepw istkbnxepwVar, Map map, UserInfo userInfo, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        specialBannerViewModel.z0(istkbnxepwVar, map, userInfo, z13, (i13 & 16) != 0 ? true : z14, (i13 & 32) != 0 ? true : z15);
    }

    private final void B(String str, sr1.zoijcleaow zoijcleaowVar) {
        NavigationPayload navigationPayloadPpxfxbqfkf = es1.iobyxmoadg.ppxfxbqfkf(zoijcleaowVar);
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadPpxfxbqfkf.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadPpxfxbqfkf.navigationLink : null, (191 & 2) != 0 ? navigationPayloadPpxfxbqfkf.reference : null, (191 & 4) != 0 ? navigationPayloadPpxfxbqfkf.title : null, (191 & 8) != 0 ? navigationPayloadPpxfxbqfkf.message : null, (191 & 16) != 0 ? navigationPayloadPpxfxbqfkf.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadPpxfxbqfkf.deepLink : null, (191 & 64) != 0 ? navigationPayloadPpxfxbqfkf.analyticsPayload : new AnalyticsPayload(ipoelvxyzq(), new AnalyticsLocation.BannerFeed(str, null, 2, null), new AnalyticElement.BannerItemElement(String.valueOf(zoijcleaowVar.gxszxtbevo()), String.valueOf(zoijcleaowVar.wkgbmnqykc()))), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadPpxfxbqfkf.isPushPayload : false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(boolean z13) {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow((rlfsiqarku) value, null, null, null, null, false, null, z13, 63, null)));
    }

    private final void C(ur1.zoijcleaow zoijcleaowVar) {
        Object value;
        if (zoijcleaowVar instanceof ur1.zoijcleaow.iobyxmoadg) {
            NavigationPayload navigationPayloadEablkybsjg = es1.iobyxmoadg.eablkybsjg(((ur1.zoijcleaow.iobyxmoadg) zoijcleaowVar).lqeggnwhkg());
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadEablkybsjg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadEablkybsjg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadEablkybsjg.reference : null, (191 & 4) != 0 ? navigationPayloadEablkybsjg.title : null, (191 & 8) != 0 ? navigationPayloadEablkybsjg.message : null, (191 & 16) != 0 ? navigationPayloadEablkybsjg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadEablkybsjg.deepLink : null, (191 & 64) != 0 ? navigationPayloadEablkybsjg.analyticsPayload : new AnalyticsPayload(ipoelvxyzq(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadEablkybsjg.isPushPayload : false));
        } else if (zoijcleaowVar instanceof ur1.zoijcleaow.C2834zoijcleaow) {
            NavigationPayload navigationPayloadEablkybsjg2 = es1.iobyxmoadg.eablkybsjg(((ur1.zoijcleaow.C2834zoijcleaow) zoijcleaowVar).lqeggnwhkg());
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadEablkybsjg2.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadEablkybsjg2.navigationLink : null, (191 & 2) != 0 ? navigationPayloadEablkybsjg2.reference : null, (191 & 4) != 0 ? navigationPayloadEablkybsjg2.title : null, (191 & 8) != 0 ? navigationPayloadEablkybsjg2.message : null, (191 & 16) != 0 ? navigationPayloadEablkybsjg2.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadEablkybsjg2.deepLink : null, (191 & 64) != 0 ? navigationPayloadEablkybsjg2.analyticsPayload : new AnalyticsPayload(ipoelvxyzq(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadEablkybsjg2.isPushPayload : false));
        } else {
            if (!(zoijcleaowVar instanceof ur1.zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((ur1.zoijcleaow.ppxfxbqfkf) zoijcleaowVar).draadjrbmk()) {
                return;
            }
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow((rlfsiqarku) value, null, null, null, null, false, E(((rlfsiqarku) gtknphoqwx()).eablkybsjg(), zoijcleaowVar, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.uwvvkdfqfp
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return SpecialBannerViewModel.D((ur1.zoijcleaow.ppxfxbqfkf) obj);
                }
            }), false, 95, null)));
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gtknphoqwx(zoijcleaowVar, null), 3, null);
        }
    }

    private final void C0(PromoCollectionItem promoCollectionItem) {
        yggfygwlhe(new czzsidtyhn.oxmwwwfdhm(promoCollectionItem.getCurrentStatus().getName(), promoCollectionItem.getDescription(), promoCollectionItem.getCurrentStatus().getImageUrl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ur1.zoijcleaow D(ur1.zoijcleaow.ppxfxbqfkf button) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(button, "button");
        return ur1.zoijcleaow.ppxfxbqfkf.nufgyqmvbu(button, null, null, null, false, true, null, null, 111, null);
    }

    private final void D0(QrCodeArgs qrCodeArgs) {
        yggfygwlhe(new czzsidtyhn.vdvldrhtss(qrCodeArgs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List E(List list, ur1.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar) {
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gz0.iobyxmoadg iobyxmoadgVar = (gz0.iobyxmoadg) it.next();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.getItemId(), iobyxmoadgVar.getItemId()) && (iobyxmoadgVar instanceof ur1.zoijcleaow.ppxfxbqfkf)) {
                iobyxmoadgVar = (gz0.iobyxmoadg) draadjrbmkVar.invoke(iobyxmoadgVar);
            }
            arrayList.add(iobyxmoadgVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    public final void E0(s71.wkgbmnqykc wkgbmnqykcVar, s71.wkgbmnqykc.iobyxmoadg iobyxmoadgVar, s71.zoijcleaow zoijcleaowVar) {
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        s71.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        gz0.iobyxmoadg iobyxmoadgVar2;
        Object next;
        gz0.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        Object next2;
        if (zoijcleaowVar != null) {
            wkgbmnqykcVarIobyxmoadg = wkgbmnqykcVar.iobyxmoadg((759 & 1) != 0 ? wkgbmnqykcVar.f105663zdlpuopuiu : null, (759 & 2) != 0 ? wkgbmnqykcVar.f105662yggfygwlhe : null, (759 & 4) != 0 ? wkgbmnqykcVar.f105658jyumaefscl : null, (759 & 8) != 0 ? wkgbmnqykcVar.f105657iwizpuwonk : zoijcleaowVar.wkgbmnqykc(), (759 & 16) != 0 ? wkgbmnqykcVar.f105654cqumvgiudr : null, (759 & 32) != 0 ? wkgbmnqykcVar.f105655esjtqupxsv : null, (759 & 64) != 0 ? wkgbmnqykcVar.f105659lereixgezr : null, (759 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? wkgbmnqykcVar.f105660pmvmpeiblj : null, (759 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? wkgbmnqykcVar.f105664zynmafqrjb : zoijcleaowVar.ppxfxbqfkf(), (759 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? wkgbmnqykcVar.f105656istkbnxepw : false, (759 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? wkgbmnqykcVar.f105653cdpycssgdh : iobyxmoadgVar);
            wkgbmnqykcVarIobyxmoadg.oxmwwwfdhm(zoijcleaowVar.iobyxmoadg());
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, s71.wkgbmnqykc.iobyxmoadg.C2573iobyxmoadg.f105665iobyxmoadg)) {
                s71.ppxfxbqfkf ppxfxbqfkfVar = (s71.ppxfxbqfkf) hg.jyumaefscl.weqkydbzbr(wkgbmnqykcVar.wflxmlrfwp());
                vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(ppxfxbqfkfVar != null ? ppxfxbqfkfVar.iobyxmoadg() : null, Boolean.valueOf(!wkgbmnqykcVar.wflxmlrfwp().isEmpty()));
            } else {
                vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(wkgbmnqykcVar.draadjrbmk(), Boolean.valueOf(wkgbmnqykcVar.vdvldrhtss()));
            }
            wkgbmnqykcVarIobyxmoadg = wkgbmnqykcVar.iobyxmoadg((759 & 1) != 0 ? wkgbmnqykcVar.f105663zdlpuopuiu : null, (759 & 2) != 0 ? wkgbmnqykcVar.f105662yggfygwlhe : null, (759 & 4) != 0 ? wkgbmnqykcVar.f105658jyumaefscl : null, (759 & 8) != 0 ? wkgbmnqykcVar.f105657iwizpuwonk : null, (759 & 16) != 0 ? wkgbmnqykcVar.f105654cqumvgiudr : null, (759 & 32) != 0 ? wkgbmnqykcVar.f105655esjtqupxsv : null, (759 & 64) != 0 ? wkgbmnqykcVar.f105659lereixgezr : null, (759 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? wkgbmnqykcVar.f105660pmvmpeiblj : (String) vdvldrhtssVarIobyxmoadg.iobyxmoadg(), (759 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? wkgbmnqykcVar.f105664zynmafqrjb : null, (759 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? wkgbmnqykcVar.f105656istkbnxepw : ((Boolean) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).booleanValue(), (759 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? wkgbmnqykcVar.f105653cdpycssgdh : iobyxmoadgVar);
        }
        if (zoijcleaowVar == null) {
            iobyxmoadgVar2 = null;
        } else {
            List listEablkybsjg = ((rlfsiqarku) gtknphoqwx()).eablkybsjg();
            if (listEablkybsjg == null || !listEablkybsjg.isEmpty()) {
                Iterator it = listEablkybsjg.iterator();
                while (true) {
                    if (it.hasNext()) {
                        gz0.iobyxmoadg iobyxmoadgVar3 = (gz0.iobyxmoadg) it.next();
                        if (((iobyxmoadgVar3 instanceof is1.iobyxmoadg) && (zoijcleaowVar.zoijcleaow() instanceof is1.iobyxmoadg)) || ((iobyxmoadgVar3 instanceof is1.wkgbmnqykc) && (zoijcleaowVar.zoijcleaow() instanceof is1.wkgbmnqykc))) {
                            if (!zoijcleaowVar.ppxfxbqfkf().isEmpty()) {
                                if (zoijcleaowVar.zoijcleaow() instanceof is1.iobyxmoadg) {
                                    Iterator it2 = ((rlfsiqarku) gtknphoqwx()).eablkybsjg().iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it2.next();
                                    } while (!(next2 instanceof is1.iobyxmoadg));
                                    if (next2 != null) {
                                        gz0.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaowVar.zoijcleaow();
                                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarZoijcleaow, "null cannot be cast to non-null type ru.myspar.proloyalty.specialbanner.impl.presentation.models.productspromotion.HorizontalPromoSpecialBannerUiModel");
                                        iobyxmoadgVarWkgbmnqykc = is1.iobyxmoadg.wkgbmnqykc((is1.iobyxmoadg) next2, null, ((is1.iobyxmoadg) iobyxmoadgVarZoijcleaow).eablkybsjg(), 1, null);
                                    } else {
                                        iobyxmoadgVarWkgbmnqykc = null;
                                    }
                                } else {
                                    if (zoijcleaowVar.zoijcleaow() instanceof is1.wkgbmnqykc) {
                                        Iterator it3 = ((rlfsiqarku) gtknphoqwx()).eablkybsjg().iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it3.next();
                                        } while (!(next instanceof is1.wkgbmnqykc));
                                        if (next != null) {
                                            gz0.iobyxmoadg iobyxmoadgVarZoijcleaow2 = zoijcleaowVar.zoijcleaow();
                                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarZoijcleaow2, "null cannot be cast to non-null type ru.myspar.proloyalty.specialbanner.impl.presentation.models.productspromotion.VerticalPromoSpecialBannerUiModel");
                                            iobyxmoadgVarWkgbmnqykc = is1.wkgbmnqykc.wkgbmnqykc((is1.wkgbmnqykc) next, null, ((is1.wkgbmnqykc) iobyxmoadgVarZoijcleaow2).eablkybsjg(), 1, null);
                                        } else {
                                            iobyxmoadgVarWkgbmnqykc = null;
                                        }
                                    }
                                    iobyxmoadgVar2 = null;
                                }
                                iobyxmoadgVar2 = iobyxmoadgVarWkgbmnqykc;
                            }
                        }
                    }
                }
            }
            this.f101269xrmfcynszj = true;
            iobyxmoadgVar2 = null;
        }
        List<gz0.iobyxmoadg> listEablkybsjg2 = ((rlfsiqarku) gtknphoqwx()).eablkybsjg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg2, 10));
        for (gz0.iobyxmoadg iobyxmoadgVar4 : listEablkybsjg2) {
            boolean z13 = false;
            boolean z14 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar4.getItemId(), wkgbmnqykcVarIobyxmoadg.getItemId()) && (iobyxmoadgVar4 instanceof s71.wkgbmnqykc);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar4.getItemId(), iobyxmoadgVar2 != null ? iobyxmoadgVar2.getItemId() : null) && (iobyxmoadgVar4 instanceof is1.iobyxmoadg)) {
                z13 = true;
            }
            if (z14) {
                iobyxmoadgVar4 = wkgbmnqykcVarIobyxmoadg;
            } else if (iobyxmoadgVar2 != null && z13) {
                iobyxmoadgVar4 = iobyxmoadgVar2;
            }
            arrayList.add(iobyxmoadgVar4);
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        while (true) {
            Object value = zynmafqrjbVarOjitshcjhn.getValue();
            ArrayList arrayList2 = arrayList;
            if (zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow((rlfsiqarku) value, null, null, null, null, false, arrayList, false, 95, null))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    private final void F() {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(m21.dxjokdxxww.f64969iobyxmoadg.dxjokdxxww((String) this.f101249nufgyqmvbu.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)));
    }

    static /* synthetic */ void F0(SpecialBannerViewModel specialBannerViewModel, s71.wkgbmnqykc wkgbmnqykcVar, s71.wkgbmnqykc.iobyxmoadg iobyxmoadgVar, s71.zoijcleaow zoijcleaowVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            zoijcleaowVar = null;
        }
        specialBannerViewModel.E0(wkgbmnqykcVar, iobyxmoadgVar, zoijcleaowVar);
    }

    private final void G(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        if (((Boolean) wkgbmnqykc().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            ageimvtcrz(comboSetProduct, comboSetProduct2);
        } else {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101277zynmafqrjb.eablkybsjg());
        }
    }

    private final void G0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f101226dsvhmnatus.dxjokdxxww(), new yggfygwlhe(null)), new jyumaefscl(null)), agtfadlqog());
    }

    private final void H0() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new iwizpuwonk(null), 3, null);
    }

    private final void I(xr1.zoijcleaow zoijcleaowVar) {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(m21.dxjokdxxww.f64969iobyxmoadg.jyumaefscl(zoijcleaowVar.lqeggnwhkg()));
    }

    private final void I0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ikoacuggdj(i(), new cqumvgiudr(null, this)), new esjtqupxsv(null)), agtfadlqog());
    }

    private final void J0(String str) {
        auzgnhcxok auzgnhcxokVar = this.f101232ikoacuggdj;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f101232ikoacuggdj = pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lereixgezr(str, null), 3, null);
    }

    private final void K(s71.wkgbmnqykc wkgbmnqykcVar) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new draadjrbmk(wkgbmnqykcVar, null), 3, null);
    }

    private final void K0(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f101230hcddaimhww.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.LandingPage(((rlfsiqarku) gtknphoqwx()).lqeggnwhkg(), ((rlfsiqarku) gtknphoqwx()).wkgbmnqykc()), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    private final void L(s71.wkgbmnqykc wkgbmnqykcVar) {
        s71.iobyxmoadg iobyxmoadgVarLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
        if (iobyxmoadgVarLqeggnwhkg != null) {
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(iobyxmoadgVarLqeggnwhkg.iobyxmoadg(), iobyxmoadgVarLqeggnwhkg.zoijcleaow(), null, null, false, null, new AnalyticsPayload(ipoelvxyzq(), null, null, 6, null), false, 184, null));
        }
    }

    static /* synthetic */ void L0(SpecialBannerViewModel specialBannerViewModel, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        specialBannerViewModel.K0(analyticsPage, analyticElement, analyticsLocation);
    }

    private final void M(s71.wkgbmnqykc wkgbmnqykcVar) {
        EvropolisGift evropolisGiftDxjokdxxww = wkgbmnqykcVar.dxjokdxxww();
        if (evropolisGiftDxjokdxxww != null) {
            pz0.iobyxmoadg iobyxmoadgVarE = e();
            yggfygwlhe(new czzsidtyhn.gtknphoqwx(evropolisGiftDxjokdxxww, iobyxmoadgVarE != null ? iobyxmoadgVarE.ppxfxbqfkf() : null));
            F0(this, wkgbmnqykcVar, s71.wkgbmnqykc.iobyxmoadg.C2573iobyxmoadg.f105665iobyxmoadg, null, 4, null);
            if (this.f101269xrmfcynszj) {
                c();
                this.f101269xrmfcynszj = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat M0() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault());
    }

    private final void N() {
        c();
    }

    private final void N0(ProductUiModel productUiModel, boolean z13, String str, boolean z14) {
        Object value;
        rlfsiqarku rlfsiqarkuVar;
        ArrayList arrayList;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rlfsiqarkuVar = (rlfsiqarku) value;
            List<b21.ppxfxbqfkf> listEablkybsjg = rlfsiqarkuVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (b21.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg : listEablkybsjg) {
                if (ppxfxbqfkfVarIobyxmoadg instanceof hs1.iobyxmoadg) {
                    hs1.iobyxmoadg iobyxmoadgVar = (hs1.iobyxmoadg) ppxfxbqfkfVarIobyxmoadg;
                    List listDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
                    CounterModel counterModel = productUiModel.getCounterModel();
                    ppxfxbqfkfVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg((191 & 1) != 0 ? iobyxmoadgVar.f41060zdlpuopuiu : null, (191 & 2) != 0 ? iobyxmoadgVar.f41059yggfygwlhe : null, (191 & 4) != 0 ? iobyxmoadgVar.f41056jyumaefscl : null, (191 & 8) != 0 ? iobyxmoadgVar.f41055iwizpuwonk : null, (191 & 16) != 0 ? iobyxmoadgVar.f41053cqumvgiudr : null, (191 & 32) != 0 ? iobyxmoadgVar.f41054esjtqupxsv : null, (191 & 64) != 0 ? iobyxmoadgVar.f41057lereixgezr : jr0.wkgbmnqykc.dxjokdxxww(listDxjokdxxww, productUiModel, productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : z13, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (14714 & 2048) != 0 ? counterModel.message : str, (14714 & 4096) != 0 ? counterModel.autoHideMessage : z14, (14714 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null)), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f41058pmvmpeiblj : null);
                }
                arrayList.add(ppxfxbqfkfVarIobyxmoadg);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow(rlfsiqarkuVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final void O(ProductUiModel productUiModel, AnalyticsLocation.ItemFeed itemFeed) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wflxmlrfwp(itemFeed, productUiModel, null), 3, null);
    }

    static /* synthetic */ void O0(SpecialBannerViewModel specialBannerViewModel, ProductUiModel productUiModel, boolean z13, String str, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        specialBannerViewModel.N0(productUiModel, z13, str, z14);
    }

    private final void P(String str) {
        if (((Boolean) wkgbmnqykc().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101267wwaezpbzkn.iobyxmoadg(new FeedbackArgs(str)));
        } else {
            yggfygwlhe(czzsidtyhn.eablkybsjg.f101404iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(String str, List list) {
        Object value;
        rlfsiqarku rlfsiqarkuVar;
        ArrayList arrayList;
        ss1.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rlfsiqarkuVar = (rlfsiqarku) value;
            List<gz0.iobyxmoadg> listEablkybsjg = rlfsiqarkuVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (gz0.iobyxmoadg iobyxmoadgVar : listEablkybsjg) {
                ss1.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof ss1.iobyxmoadg ? (ss1.iobyxmoadg) iobyxmoadgVar : null;
                if (iobyxmoadgVar2 != null) {
                    ss1.iobyxmoadg iobyxmoadgVar3 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.eablkybsjg(), str) ? iobyxmoadgVar2 : null;
                    if (iobyxmoadgVar3 != null && (iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((247 & 1) != 0 ? iobyxmoadgVar3.f108533zdlpuopuiu : null, (247 & 2) != 0 ? iobyxmoadgVar3.f108532yggfygwlhe : null, (247 & 4) != 0 ? iobyxmoadgVar3.f108529jyumaefscl : null, (247 & 8) != 0 ? iobyxmoadgVar3.f108528iwizpuwonk : list, (247 & 16) != 0 ? iobyxmoadgVar3.f108526cqumvgiudr : null, (247 & 32) != 0 ? iobyxmoadgVar3.f108527esjtqupxsv : false, (247 & 64) != 0 ? iobyxmoadgVar3.f108530lereixgezr : false, (247 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f108531pmvmpeiblj : false)) != null) {
                        iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
                    }
                }
                arrayList.add(iobyxmoadgVar);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow(rlfsiqarkuVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final auzgnhcxok Q(String str) {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new agtfadlqog(str, null), 3, null);
    }

    private final void Q0(String str) {
        eslsurpljm(str, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.zfvoamnweg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerViewModel.R0(this.f101620zdlpuopuiu, (yr1.iobyxmoadg) obj);
            }
        });
    }

    private final void R(String str, final RegistrationFormView.zoijcleaow zoijcleaowVar) {
        eslsurpljm(str, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.oipsdeybqn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerViewModel.S(zoijcleaowVar, (yr1.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr1.iobyxmoadg R0(SpecialBannerViewModel specialBannerViewModel, yr1.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        yr1.iobyxmoadg iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : null, (4095 & 8) != 0 ? form.f126306iwizpuwonk : null, (4095 & 16) != 0 ? form.f126302cqumvgiudr : null, (4095 & 32) != 0 ? form.f126303esjtqupxsv : null, (4095 & 64) != 0 ? form.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f126304iozdgvuglv : specialBannerViewModel.f101237jlmebxxoox);
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f126311yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f126307jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f126306iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f126302cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f126303esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f126305istkbnxepw : iobyxmoadgVarIobyxmoadg.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f126304iozdgvuglv : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr1.iobyxmoadg S(RegistrationFormView.zoijcleaow zoijcleaowVar, yr1.iobyxmoadg form) {
        yr1.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.ppxfxbqfkf) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : ((RegistrationFormView.zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg(), (4095 & 8) != 0 ? form.f126306iwizpuwonk : null, (4095 & 16) != 0 ? form.f126302cqumvgiudr : null, (4095 & 32) != 0 ? form.f126303esjtqupxsv : null, (4095 & 64) != 0 ? form.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f126304iozdgvuglv : null);
        } else if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.gxszxtbevo) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : null, (4095 & 8) != 0 ? form.f126306iwizpuwonk : ((RegistrationFormView.zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg(), (4095 & 16) != 0 ? form.f126302cqumvgiudr : null, (4095 & 32) != 0 ? form.f126303esjtqupxsv : null, (4095 & 64) != 0 ? form.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f126304iozdgvuglv : null);
        } else if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.C2440zoijcleaow) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : null, (4095 & 8) != 0 ? form.f126306iwizpuwonk : null, (4095 & 16) != 0 ? form.f126302cqumvgiudr : ((RegistrationFormView.zoijcleaow.C2440zoijcleaow) zoijcleaowVar).iobyxmoadg(), (4095 & 32) != 0 ? form.f126303esjtqupxsv : null, (4095 & 64) != 0 ? form.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f126304iozdgvuglv : null);
        } else if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.iobyxmoadg) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : null, (4095 & 8) != 0 ? form.f126306iwizpuwonk : null, (4095 & 16) != 0 ? form.f126302cqumvgiudr : null, (4095 & 32) != 0 ? form.f126303esjtqupxsv : ((RegistrationFormView.zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg(), (4095 & 64) != 0 ? form.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f126304iozdgvuglv : null);
        } else if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.eablkybsjg) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : null, (4095 & 8) != 0 ? form.f126306iwizpuwonk : null, (4095 & 16) != 0 ? form.f126302cqumvgiudr : null, (4095 & 32) != 0 ? form.f126303esjtqupxsv : null, (4095 & 64) != 0 ? form.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : ((RegistrationFormView.zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg(), (4095 & 4096) != 0 ? form.f126304iozdgvuglv : null);
        } else {
            if (!(zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : null, (4095 & 8) != 0 ? form.f126306iwizpuwonk : null, (4095 & 16) != 0 ? form.f126302cqumvgiudr : null, (4095 & 32) != 0 ? form.f126303esjtqupxsv : null, (4095 & 64) != 0 ? form.f126308lereixgezr : ((RegistrationFormView.zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg(), (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f126304iozdgvuglv : null);
        }
        yr1.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
        return iobyxmoadgVar.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVar.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVar.f126311yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVar.f126307jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVar.f126306iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVar.f126302cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVar.f126303esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVar.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar.f126305istkbnxepw : iobyxmoadgVar.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVar.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVar.f126304iozdgvuglv : null);
    }

    private final void T(HintUiModel hintUiModel, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        yggfygwlhe(new czzsidtyhn.ojitshcjhn(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.LandingPage(((rlfsiqarku) gtknphoqwx()).lqeggnwhkg(), ((rlfsiqarku) gtknphoqwx()).wkgbmnqykc()), analyticsLocation)));
    }

    private final void U(sr1.draadjrbmk draadjrbmkVar) {
        NavigationPayload navigationPayloadWkgbmnqykc = es1.iobyxmoadg.wkgbmnqykc(draadjrbmkVar);
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadWkgbmnqykc.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : null, (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : new AnalyticsPayload(ipoelvxyzq(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false));
    }

    private final void V(ProductUiModel productUiModel, ProductCardEvent productCardEvent, AnalyticsLocation.ItemFeed itemFeed) {
        Object next;
        List limits;
        List limits2;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                ProductCardEvent.CounterInternal.ShowMessage showMessage = (ProductCardEvent.CounterInternal.ShowMessage) productCardEvent;
                N0(productUiModel, true, showMessage.getMessage(), showMessage.getAutoHide());
                return;
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                O0(this, productUiModel, false, null, false, 12, null);
                return;
            }
        }
        ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(new AnalyticsPage.LandingPage(((rlfsiqarku) gtknphoqwx()).lqeggnwhkg(), ((rlfsiqarku) gtknphoqwx()).wkgbmnqykc()), itemFeed, productUiModel.getName());
        Iterator it = this.f101258sflfametgt.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), productUiModel.getId()));
        ProductUIData productUIData = (ProductUIData) next;
        String id2 = productUiModel.getId();
        String article = productUiModel.getArticle();
        boolean isAvailableToBuy = productUiModel.getAvailabilityModel().getIsAvailableToBuy();
        boolean isPmProduct = productUiModel.getIsPmProduct();
        MeasureTypeModel measureTypeModel = productUiModel.getMeasureTypeModel();
        Double avgWeight = productUiModel.getAvgWeight();
        if (productUIData == null || (limits2 = productUIData.getLimits()) == null || (limits = q11.zoijcleaow.iobyxmoadg(limits2)) == null) {
            limits = productUiModel.getLimits();
        }
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ojitshcjhn(new ChangeProductParams(id2, article, zoijcleaowVarIobyxmoadg, isAvailableToBuy, isPmProduct, measureTypeModel, avgWeight, limits, changeProductAnalyticParams), null), 3, null);
    }

    private final void W(ProductUiModel productUiModel, AnalyticsLocation.ItemFeed itemFeed) {
        K0(new AnalyticsPage.ItemDetail(productUiModel.getArticle(), productUiModel.getName()), new AnalyticElement.ProductItemElement(productUiModel.getArticle(), productUiModel.getName()), itemFeed);
        i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f101234istkbnxepw.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(productUiModel.getId()), null, 2, null)));
    }

    private final void X(hs1.iobyxmoadg iobyxmoadgVar) {
        NavigationPayload navigationPayloadIobyxmoadg = es1.iobyxmoadg.iobyxmoadg(iobyxmoadgVar);
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadIobyxmoadg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadIobyxmoadg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadIobyxmoadg.reference : null, (191 & 4) != 0 ? navigationPayloadIobyxmoadg.title : null, (191 & 8) != 0 ? navigationPayloadIobyxmoadg.message : null, (191 & 16) != 0 ? navigationPayloadIobyxmoadg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadIobyxmoadg.deepLink : null, (191 & 64) != 0 ? navigationPayloadIobyxmoadg.analyticsPayload : new AnalyticsPayload(ipoelvxyzq(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadIobyxmoadg.isPushPayload : false));
    }

    private final void Y(String str, js1.iobyxmoadg iobyxmoadgVar) {
        Object value;
        List<b21.ppxfxbqfkf> listEablkybsjg = ((rlfsiqarku) gtknphoqwx()).eablkybsjg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
        for (b21.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc : listEablkybsjg) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarWkgbmnqykc.getItemId(), str) && (ppxfxbqfkfVarWkgbmnqykc instanceof js1.ppxfxbqfkf)) {
                js1.ppxfxbqfkf ppxfxbqfkfVar = (js1.ppxfxbqfkf) ppxfxbqfkfVarWkgbmnqykc;
                List listWkgbmnqykc = ppxfxbqfkfVar.eablkybsjg().wkgbmnqykc();
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
                Iterator it = listWkgbmnqykc.iterator();
                while (it.hasNext()) {
                    arrayList2.add(jrbgnlbqoe((js1.iobyxmoadg) it.next(), iobyxmoadgVar.getItemId()));
                }
                ppxfxbqfkfVarWkgbmnqykc = js1.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, null, js1.zoijcleaow.zoijcleaow(ppxfxbqfkfVar.eablkybsjg(), arrayList2, null, false, 6, null), 1, null);
            }
            arrayList.add(ppxfxbqfkfVarWkgbmnqykc);
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow((rlfsiqarku) value, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final void Z(Point point) {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(m21.dxjokdxxww.f64969iobyxmoadg.gtknphoqwx(point.getLatitude(), point.getLongitude()));
    }

    private final void a0(yr1.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new rgvfuqvkyq(iobyxmoadgVar, null), 3, null);
    }

    private final void ageimvtcrz(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wkgbmnqykc(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    private final void b0(ds1.ppxfxbqfkf ppxfxbqfkfVar) {
        yggfygwlhe(new czzsidtyhn.zdlpuopuiu(ppxfxbqfkfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        auzgnhcxok auzgnhcxokVar = this.f101236jhduphickx;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f101236jhduphickx = pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(null), 3, null);
    }

    private final void c0(String str) {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.shops.zoijcleaow.zoijcleaow(new ShopsArgs(ShopsArgs.zoijcleaow.SPECIAL_BANNER, ((rlfsiqarku) gtknphoqwx()).wkgbmnqykc(), str)));
    }

    private final void d0(ks1.iobyxmoadg iobyxmoadgVar) {
        NavigationPayload navigationPayloadZoijcleaow = es1.iobyxmoadg.zoijcleaow(iobyxmoadgVar);
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadZoijcleaow.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadZoijcleaow.navigationLink : null, (191 & 2) != 0 ? navigationPayloadZoijcleaow.reference : null, (191 & 4) != 0 ? navigationPayloadZoijcleaow.title : null, (191 & 8) != 0 ? navigationPayloadZoijcleaow.message : null, (191 & 16) != 0 ? navigationPayloadZoijcleaow.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadZoijcleaow.deepLink : null, (191 & 64) != 0 ? navigationPayloadZoijcleaow.analyticsPayload : new AnalyticsPayload(ipoelvxyzq(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadZoijcleaow.isPushPayload : false));
    }

    private final void eslsurpljm(String str, tg.draadjrbmk draadjrbmkVar) {
        Object value;
        List<gz0.iobyxmoadg> listEablkybsjg = ((rlfsiqarku) gtknphoqwx()).eablkybsjg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
        for (gz0.iobyxmoadg iobyxmoadgVar : listEablkybsjg) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.getItemId(), str) && (iobyxmoadgVar instanceof yr1.iobyxmoadg)) {
                iobyxmoadgVar = (gz0.iobyxmoadg) draadjrbmkVar.invoke(iobyxmoadgVar);
            }
            arrayList.add(iobyxmoadgVar);
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow((rlfsiqarku) value, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final void ezmngbhpjk(String str) {
        this.f101237jlmebxxoox = null;
        this.f101223crxdokpmqz.setTime(new Date());
        Q0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb f() {
        return (dz0.btonecajqb) this.f101276zfvoamnweg.getValue();
    }

    private final void f0(ms1.iobyxmoadg iobyxmoadgVar) {
        L0(this, AnalyticsPage.Video.f92392iwizpuwonk, null, null, 6, null);
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101254pmvmpeiblj.iobyxmoadg(new VideoPlayerArgs(iobyxmoadgVar.wkgbmnqykc())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fmlbqenlif(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        SpecialBannerViewModel specialBannerViewModel;
        Object objWkgbmnqykc;
        Object next;
        ProductUIData productUIData;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f101326cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f101326cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f101328jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f101326cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                ow1.wflxmlrfwp wflxmlrfwpVar = this.f101221cllcsxoeiz;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                gxszxtbevoVar2.f101330zdlpuopuiu = this;
                gxszxtbevoVar2.f101329yggfygwlhe = changeProductParams;
                gxszxtbevoVar2.f101326cqumvgiudr = 1;
                objZoijcleaow = wflxmlrfwpVar.zoijcleaow(wwaezpbzknVar, gxszxtbevoVar2);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                specialBannerViewModel = this;
            } catch (Throwable th2) {
                th = th2;
                specialBannerViewModel = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            changeProductParams = (ChangeProductParams) gxszxtbevoVar2.f101329yggfygwlhe;
            specialBannerViewModel = (SpecialBannerViewModel) gxszxtbevoVar2.f101330zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objZoijcleaow).booleanValue()));
        Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = boolIobyxmoadg;
        }
        boolean zBooleanValue = ((Boolean) objWkgbmnqykc).booleanValue();
        Iterator it = specialBannerViewModel.f101258sflfametgt.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            productUIData = (ProductUIData) next;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productUIData.getArticle(), changeProductParams.getProductId())) {
                break;
            }
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productUIData.getId(), changeProductParams.getProductId()));
        boolean z13 = next != null;
        if (zBooleanValue || !changeProductParams.getIsPmProduct() || z13) {
            specialBannerViewModel.istkbnxepw(changeProductParams, false);
        } else {
            specialBannerViewModel.yggfygwlhe(new czzsidtyhn.wflxmlrfwp(changeProductParams));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void fyldjkxazc(ProductUiModel productUiModel) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new eablkybsjg(productUiModel, null), 3, null);
    }

    private final Set g() {
        Set setQ;
        List list = (List) this.f101253pkzmftpjix.zoijcleaow("promo_collection_scrolled_state");
        return (list == null || (setQ = hg.jyumaefscl.q(list)) == null) ? new LinkedHashSet() : setQ;
    }

    private final void g0() {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101244lmojexxdyd.zoijcleaow());
    }

    private final void grlcpdaxtj(String str) {
        yggfygwlhe(czzsidtyhn.iobyxmoadg.f101408iobyxmoadg);
        this.f101261tzroggbefp = str;
    }

    private final void h0(is1.ppxfxbqfkf ppxfxbqfkfVar) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new vdvldrhtss(ppxfxbqfkfVar, null), 3, null);
    }

    private final void i0(String str, String str2, String str3) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new oxmwwwfdhm(str2, str, str3, null), 3, null);
    }

    private final AnalyticsPage.LandingPage ipoelvxyzq() {
        return new AnalyticsPage.LandingPage(((rlfsiqarku) gtknphoqwx()).lqeggnwhkg(), ((rlfsiqarku) gtknphoqwx()).wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ixidwrxhsl(String str, boolean z13) {
        Object value;
        rlfsiqarku rlfsiqarkuVar;
        ArrayList arrayList;
        ss1.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rlfsiqarkuVar = (rlfsiqarku) value;
            List<gz0.iobyxmoadg> listEablkybsjg = rlfsiqarkuVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (gz0.iobyxmoadg iobyxmoadgVar : listEablkybsjg) {
                ss1.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof ss1.iobyxmoadg ? (ss1.iobyxmoadg) iobyxmoadgVar : null;
                if (iobyxmoadgVar2 != null) {
                    ss1.iobyxmoadg iobyxmoadgVar3 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.eablkybsjg(), str) ? iobyxmoadgVar2 : null;
                    if (iobyxmoadgVar3 != null && (iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((247 & 1) != 0 ? iobyxmoadgVar3.f108533zdlpuopuiu : null, (247 & 2) != 0 ? iobyxmoadgVar3.f108532yggfygwlhe : null, (247 & 4) != 0 ? iobyxmoadgVar3.f108529jyumaefscl : null, (247 & 8) != 0 ? iobyxmoadgVar3.f108528iwizpuwonk : null, (247 & 16) != 0 ? iobyxmoadgVar3.f108526cqumvgiudr : null, (247 & 32) != 0 ? iobyxmoadgVar3.f108527esjtqupxsv : false, (247 & 64) != 0 ? iobyxmoadgVar3.f108530lereixgezr : z13, (247 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f108531pmvmpeiblj : false)) != null) {
                        iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
                    }
                }
                arrayList.add(iobyxmoadgVar);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow(rlfsiqarkuVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(vq1.rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        vq1.istkbnxepw istkbnxepwVarIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg();
        Map mapZoijcleaow = rgvfuqvkyqVar.zoijcleaow();
        UserInfo userInfoPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
        if (istkbnxepwVarIobyxmoadg.gxszxtbevo().iobyxmoadg() != null) {
            yggfygwlhe(czzsidtyhn.ppxfxbqfkf.f101420iobyxmoadg);
        }
        p(istkbnxepwVarIobyxmoadg.gxszxtbevo().iobyxmoadg());
        if (!istkbnxepwVarIobyxmoadg.nufgyqmvbu() || this.f101239jyumaefscl.getIsAdultConfirmed() || ((Boolean) this.f101219btonecajqb.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue() || this.f101265vipkmwdibw) {
            A0(this, istkbnxepwVarIobyxmoadg, mapZoijcleaow, userInfoPpxfxbqfkf, z13, false, false, 48, null);
        } else {
            this.f101259sopmlzcsov = new zoijcleaow(istkbnxepwVarIobyxmoadg, mapZoijcleaow, userInfoPpxfxbqfkf, z13);
            yggfygwlhe(czzsidtyhn.wkgbmnqykc.f101425iobyxmoadg);
        }
        if (this.f101246mbcevpiqjq != null) {
            u0();
        }
    }

    private final js1.iobyxmoadg jrbgnlbqoe(js1.iobyxmoadg iobyxmoadgVar, String str) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.getItemId(), str) ? js1.iobyxmoadg.wkgbmnqykc(iobyxmoadgVar, null, null, null, null, false, !iobyxmoadgVar.dxjokdxxww(), 31, null) : iobyxmoadgVar;
    }

    private final SimpleDateFormat k() {
        return (SimpleDateFormat) this.f101256ribwqtqdhb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(final String str, final String str2) {
        if (this.f101246mbcevpiqjq != null) {
            this.f101248ntlheqmsrt = gg.cqumvgiudr.iobyxmoadg(str, str2);
        } else {
            eslsurpljm(this.f101261tzroggbefp, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.iyctptxqzt
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return SpecialBannerViewModel.l0(str, str2, (yr1.iobyxmoadg) obj);
                }
            });
        }
    }

    private final ss1.iobyxmoadg krqnebusok(String str) {
        ss1.iobyxmoadg iobyxmoadgVar;
        Iterator it = ((rlfsiqarku) getState().getValue()).eablkybsjg().iterator();
        while (true) {
            iobyxmoadgVar = null;
            if (!it.hasNext()) {
                break;
            }
            gz0.iobyxmoadg iobyxmoadgVar2 = (gz0.iobyxmoadg) it.next();
            ss1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar2 instanceof ss1.iobyxmoadg ? (ss1.iobyxmoadg) iobyxmoadgVar2 : null;
            if (iobyxmoadgVar3 != null) {
                iobyxmoadgVar = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar3.eablkybsjg(), str) ? iobyxmoadgVar3 : null;
                if (iobyxmoadgVar != null) {
                    break;
                }
            }
        }
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr1.iobyxmoadg l0(String str, String str2, yr1.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        yr1.iobyxmoadg iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : null, (4095 & 8) != 0 ? form.f126306iwizpuwonk : null, (4095 & 16) != 0 ? form.f126302cqumvgiudr : null, (4095 & 32) != 0 ? form.f126303esjtqupxsv : null, (4095 & 64) != 0 ? form.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : str, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : str2, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f126304iozdgvuglv : null);
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f126311yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f126307jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f126306iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f126302cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f126303esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f126305istkbnxepw : iobyxmoadgVarIobyxmoadg.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f126304iozdgvuglv : null);
    }

    private final void m() {
        yggfygwlhe(czzsidtyhn.gxszxtbevo.f101407iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(Throwable th2) {
        if (th2 instanceof FileSizeException) {
            yggfygwlhe(czzsidtyhn.draadjrbmk.f101402iobyxmoadg);
        } else {
            zdlpuopuiu(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mhtqkkgtqm(String str, boolean z13) {
        Object value;
        rlfsiqarku rlfsiqarkuVar;
        ArrayList arrayList;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rlfsiqarkuVar = (rlfsiqarku) value;
            List<b21.ppxfxbqfkf> listEablkybsjg = rlfsiqarkuVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (b21.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg : listEablkybsjg) {
                if (ppxfxbqfkfVarIobyxmoadg instanceof hs1.iobyxmoadg) {
                    hs1.iobyxmoadg iobyxmoadgVar = (hs1.iobyxmoadg) ppxfxbqfkfVarIobyxmoadg;
                    List<ProductUiModel> listDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
                    ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listDxjokdxxww, 10));
                    for (ProductUiModel productUiModelLqeggnwhkg : listDxjokdxxww) {
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productUiModelLqeggnwhkg.getId(), str)) {
                            productUiModelLqeggnwhkg = productUiModelLqeggnwhkg.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelLqeggnwhkg.id : null, ((-1025) & 2) != 0 ? productUiModelLqeggnwhkg.name : null, ((-1025) & 4) != 0 ? productUiModelLqeggnwhkg.article : null, ((-1025) & 8) != 0 ? productUiModelLqeggnwhkg.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelLqeggnwhkg.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelLqeggnwhkg.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelLqeggnwhkg.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelLqeggnwhkg.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelLqeggnwhkg.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelLqeggnwhkg.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelLqeggnwhkg.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModelLqeggnwhkg.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelLqeggnwhkg.isFavorite : z13, ((-1025) & 8192) != 0 ? productUiModelLqeggnwhkg.favoriteEnabledState : true, ((-1025) & 16384) != 0 ? productUiModelLqeggnwhkg.inCart : false, ((-1025) & 32768) != 0 ? productUiModelLqeggnwhkg.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelLqeggnwhkg.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelLqeggnwhkg.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelLqeggnwhkg.fats : null, ((-1025) & 524288) != 0 ? productUiModelLqeggnwhkg.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelLqeggnwhkg.protein : null, ((-1025) & 2097152) != 0 ? productUiModelLqeggnwhkg.energy : null, ((-1025) & 4194304) != 0 ? productUiModelLqeggnwhkg.params : null, ((-1025) & 8388608) != 0 ? productUiModelLqeggnwhkg.description : null, ((-1025) & 16777216) != 0 ? productUiModelLqeggnwhkg.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelLqeggnwhkg.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelLqeggnwhkg.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelLqeggnwhkg.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelLqeggnwhkg.rating : null, ((-1025) & 536870912) != 0 ? productUiModelLqeggnwhkg.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelLqeggnwhkg.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelLqeggnwhkg.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelLqeggnwhkg.video : null, (16777215 & 2) != 0 ? productUiModelLqeggnwhkg.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelLqeggnwhkg.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelLqeggnwhkg.country : null, (16777215 & 16) != 0 ? productUiModelLqeggnwhkg.region : null, (16777215 & 32) != 0 ? productUiModelLqeggnwhkg.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelLqeggnwhkg.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelLqeggnwhkg.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelLqeggnwhkg.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelLqeggnwhkg.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelLqeggnwhkg.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelLqeggnwhkg.tasting : null, (16777215 & 4096) != 0 ? productUiModelLqeggnwhkg.styling : null, (16777215 & 8192) != 0 ? productUiModelLqeggnwhkg.button : null, (16777215 & 16384) != 0 ? productUiModelLqeggnwhkg.hints : null, (16777215 & 32768) != 0 ? productUiModelLqeggnwhkg.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModelLqeggnwhkg.counterModel : null, (16777215 & 131072) != 0 ? productUiModelLqeggnwhkg.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelLqeggnwhkg.vivino : null, (16777215 & 524288) != 0 ? productUiModelLqeggnwhkg.limits : null, (16777215 & 1048576) != 0 ? productUiModelLqeggnwhkg.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelLqeggnwhkg.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelLqeggnwhkg.isSelected : null, (16777215 & 8388608) != 0 ? productUiModelLqeggnwhkg.adv : null);
                        }
                        arrayList2.add(productUiModelLqeggnwhkg);
                    }
                    ppxfxbqfkfVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg((191 & 1) != 0 ? iobyxmoadgVar.f41060zdlpuopuiu : null, (191 & 2) != 0 ? iobyxmoadgVar.f41059yggfygwlhe : null, (191 & 4) != 0 ? iobyxmoadgVar.f41056jyumaefscl : null, (191 & 8) != 0 ? iobyxmoadgVar.f41055iwizpuwonk : null, (191 & 16) != 0 ? iobyxmoadgVar.f41053cqumvgiudr : null, (191 & 32) != 0 ? iobyxmoadgVar.f41054esjtqupxsv : null, (191 & 64) != 0 ? iobyxmoadgVar.f41057lereixgezr : arrayList2, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f41058pmvmpeiblj : null);
                }
                arrayList.add(ppxfxbqfkfVarIobyxmoadg);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow(rlfsiqarkuVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final void n(ComboSetProduct comboSetProduct, wm0.zoijcleaow zoijcleaowVar) {
        K0(new AnalyticsPage.ItemDetail(comboSetProduct.getArticle(), comboSetProduct.getName()), new AnalyticElement.ProductItemElement(comboSetProduct.getArticle(), comboSetProduct.getName()), new AnalyticsLocation.Combo(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
        i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f101234istkbnxepw.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Article(comboSetProduct.getArticle()), null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(String str) {
        yggfygwlhe(czzsidtyhn.kcexrzcfyt.f101410iobyxmoadg);
        eslsurpljm(str, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.sflfametgt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerViewModel.o0(this.f101487zdlpuopuiu, (yr1.iobyxmoadg) obj);
            }
        });
    }

    private final void o(kt0.iobyxmoadg iobyxmoadgVar) {
        yggfygwlhe(new czzsidtyhn.nufgyqmvbu(new BuildYourComboDialogArgs(this.f101242kegysxyocb.ppxfxbqfkf(iobyxmoadgVar), iobyxmoadgVar.wflxmlrfwp().iobyxmoadg().getId(), iobyxmoadgVar.wflxmlrfwp().zoijcleaow().getId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr1.iobyxmoadg o0(SpecialBannerViewModel specialBannerViewModel, yr1.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        yr1.iobyxmoadg iobyxmoadgVar = specialBannerViewModel.f101262ulzqkzuiru;
        return iobyxmoadgVar == null ? form : iobyxmoadgVar;
    }

    private final void p(vq1.yadqdtsiqt yadqdtsiqtVar) {
        auzgnhcxok auzgnhcxokVar = this.f101251okpsazkaxt;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        auzgnhcxok auzgnhcxokVar2 = this.f101240jztzpxfvev;
        if (auzgnhcxokVar2 != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar2, null, 1, null);
        }
        if (yadqdtsiqtVar == null) {
            return;
        }
        if (yadqdtsiqtVar.iobyxmoadg() > 0) {
            this.f101251okpsazkaxt = q11.btonecajqb.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), (104 & 2) != 0 ? 0L : 0L, (104 & 4) != 0 ? 1000L : 0L, (104 & 8) != 0 ? null : null, ((int) yadqdtsiqtVar.iobyxmoadg()) + 1, (104 & 32) != 0 ? new q11.btonecajqb.iobyxmoadg(null) : null, (104 & 64) != 0 ? new q11.btonecajqb.zoijcleaow(null) : null, (104 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new q11.btonecajqb.ppxfxbqfkf(null) : new nufgyqmvbu(null), (104 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new q11.btonecajqb.wkgbmnqykc(null) : null);
        }
        if (yadqdtsiqtVar.zoijcleaow() > 0) {
            this.f101240jztzpxfvev = q11.btonecajqb.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), (104 & 2) != 0 ? 0L : 0L, (104 & 4) != 0 ? 1000L : 0L, (104 & 8) != 0 ? null : null, ((int) yadqdtsiqtVar.zoijcleaow()) + 1, (104 & 32) != 0 ? new q11.btonecajqb.iobyxmoadg(null) : null, (104 & 64) != 0 ? new q11.btonecajqb.zoijcleaow(null) : null, (104 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new q11.btonecajqb.ppxfxbqfkf(null) : new dxjokdxxww(null), (104 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new q11.btonecajqb.wkgbmnqykc(null) : null);
        }
    }

    private final void p0(is1.ppxfxbqfkf ppxfxbqfkfVar) {
        if (((Boolean) wkgbmnqykc().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            q0(ppxfxbqfkfVar);
        } else {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101277zynmafqrjb.eablkybsjg());
        }
    }

    private final void q(k21.ojitshcjhn ojitshcjhnVar, String str) {
        i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
        iobyxmoadgVar.kcexrzcfyt().wkgbmnqykc(this.f101233iozdgvuglv.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.weqkydbzbr
            @Override // l9.draadjrbmk
            public final void iobyxmoadg(Object obj) {
                SpecialBannerViewModel.r(this.f101549iobyxmoadg, obj);
            }
        });
        iobyxmoadgVar.pkzmftpjix(new NavigationPayload(ojitshcjhnVar, str, null, null, false, null, new AnalyticsPayload(ipoelvxyzq(), null, null, 6, null), false, 188, null));
    }

    private final void q0(is1.ppxfxbqfkf ppxfxbqfkfVar) {
        is1.zoijcleaow zoijcleaowVarWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
        k21.ojitshcjhn ojitshcjhnVarPpxfxbqfkf = zoijcleaowVarWkgbmnqykc != null ? zoijcleaowVarWkgbmnqykc.ppxfxbqfkf() : null;
        is1.zoijcleaow zoijcleaowVarWkgbmnqykc2 = ppxfxbqfkfVar.wkgbmnqykc();
        String strWkgbmnqykc = zoijcleaowVarWkgbmnqykc2 != null ? zoijcleaowVarWkgbmnqykc2.wkgbmnqykc() : null;
        if (strWkgbmnqykc == null) {
            strWkgbmnqykc = "";
        }
        int i13 = ojitshcjhnVarPpxfxbqfkf == null ? -1 : ppxfxbqfkf.f101370iobyxmoadg[ojitshcjhnVarPpxfxbqfkf.ordinal()];
        if (i13 == 1) {
            fs1.zoijcleaow zoijcleaowVarGxszxtbevo = ((rlfsiqarku) getState().getValue()).gxszxtbevo();
            fs1.iobyxmoadg iobyxmoadgVarIobyxmoadg = zoijcleaowVarGxszxtbevo.iobyxmoadg();
            D0(new QrCodeArgs(zoijcleaowVarGxszxtbevo.ppxfxbqfkf(), zoijcleaowVarGxszxtbevo.zoijcleaow(), iobyxmoadgVarIobyxmoadg != null ? new QrCodeButton(iobyxmoadgVarIobyxmoadg.eablkybsjg(), iobyxmoadgVarIobyxmoadg.iobyxmoadg(), iobyxmoadgVarIobyxmoadg.zoijcleaow(), iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(), iobyxmoadgVarIobyxmoadg.wkgbmnqykc()) : null, ppxfxbqfkfVar.draadjrbmk(), ppxfxbqfkfVar.dxjokdxxww(), ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar.gtknphoqwx(), ppxfxbqfkfVar.btonecajqb(), null, ppxfxbqfkfVar.wflxmlrfwp(), true));
            return;
        }
        if (i13 == 2) {
            h0(ppxfxbqfkfVar);
        } else if (ojitshcjhnVarPpxfxbqfkf != null) {
            r0(ojitshcjhnVarPpxfxbqfkf, strWkgbmnqykc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void r(SpecialBannerViewModel specialBannerViewModel, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        kc1.zoijcleaow zoijcleaowVar = specialBannerViewModel.f101233iozdgvuglv;
        if (zoijcleaowVar.zoijcleaow(zoijcleaowVar)) {
            specialBannerViewModel.c();
        }
    }

    private final void r0(k21.ojitshcjhn ojitshcjhnVar, String str) {
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(ojitshcjhnVar, str, null, null, false, null, new AnalyticsPayload(ipoelvxyzq(), null, null, 6, null), false, 184, null));
    }

    private final void rhgxfdycjh(String str) {
        eslsurpljm(str, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.ydmasvzmpa
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerViewModel.yzdjzghtvl((yr1.iobyxmoadg) obj);
            }
        });
    }

    private final void s(String str, String str2) {
        Object next;
        ss1.iobyxmoadg iobyxmoadgVarKrqnebusok = krqnebusok(str);
        if (iobyxmoadgVarKrqnebusok == null) {
            return;
        }
        Iterator it = iobyxmoadgVarKrqnebusok.nufgyqmvbu().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PromoCollectionItem) next).getId(), str2));
        PromoCollectionItem promoCollectionItem = (PromoCollectionItem) next;
        if (promoCollectionItem == null) {
            return;
        }
        PromoCollectionItem.Status currentStatus = promoCollectionItem.getCurrentStatus();
        if (currentStatus instanceof PromoCollectionItem.Status.Blocked) {
            return;
        }
        if (currentStatus instanceof PromoCollectionItem.Status.Opened) {
            C0(promoCollectionItem);
        } else {
            if (!(currentStatus instanceof PromoCollectionItem.Status.ReadyToOpen)) {
                throw new NoWhenBranchMatchedException();
            }
            i0(iobyxmoadgVarKrqnebusok.getItemId(), str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        yggfygwlhe(new czzsidtyhn.jyumaefscl(warning.getMessage()));
    }

    private final void t(String str) {
        Object value;
        rlfsiqarku rlfsiqarkuVar;
        ArrayList arrayList;
        ss1.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rlfsiqarkuVar = (rlfsiqarku) value;
            this.f101263uwvvkdfqfp.add(str);
            w0(this.f101263uwvvkdfqfp);
            List<gz0.iobyxmoadg> listEablkybsjg = rlfsiqarkuVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (gz0.iobyxmoadg iobyxmoadgVar : listEablkybsjg) {
                ss1.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof ss1.iobyxmoadg ? (ss1.iobyxmoadg) iobyxmoadgVar : null;
                if (iobyxmoadgVar2 != null) {
                    ss1.iobyxmoadg iobyxmoadgVar3 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.eablkybsjg(), str) ? iobyxmoadgVar2 : null;
                    if (iobyxmoadgVar3 != null && (iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((247 & 1) != 0 ? iobyxmoadgVar3.f108533zdlpuopuiu : null, (247 & 2) != 0 ? iobyxmoadgVar3.f108532yggfygwlhe : null, (247 & 4) != 0 ? iobyxmoadgVar3.f108529jyumaefscl : null, (247 & 8) != 0 ? iobyxmoadgVar3.f108528iwizpuwonk : null, (247 & 16) != 0 ? iobyxmoadgVar3.f108526cqumvgiudr : null, (247 & 32) != 0 ? iobyxmoadgVar3.f108527esjtqupxsv : false, (247 & 64) != 0 ? iobyxmoadgVar3.f108530lereixgezr : false, (247 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f108531pmvmpeiblj : true)) != null) {
                        iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
                    }
                }
                arrayList.add(iobyxmoadgVar);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarku.zoijcleaow(rlfsiqarkuVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb t0(SpecialBannerViewModel specialBannerViewModel) {
        return dz0.gtknphoqwx.zoijcleaow(specialBannerViewModel.f101235iwizpuwonk, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Warning warning) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warning, Warning.Empty.f95255jyumaefscl)) {
            yggfygwlhe(czzsidtyhn.lqeggnwhkg.f101411iobyxmoadg);
            return;
        }
        if ((warning instanceof Warning.WithCodeAndMessage) || (warning instanceof Warning.DailyLimit)) {
            yggfygwlhe(new czzsidtyhn.agtfadlqog(warning.getMessage()));
        } else if (!(warning instanceof Warning.AvailableOnlyForPickup) && !(warning instanceof Warning.Interval)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void u0() {
        final RegistrationFormState registrationFormState = this.f101246mbcevpiqjq;
        if (registrationFormState != null) {
            eslsurpljm(registrationFormState.getItemId(), new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.yfnezrywwk
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return SpecialBannerViewModel.v0(registrationFormState, this, (yr1.iobyxmoadg) obj);
                }
            });
            this.f101246mbcevpiqjq = null;
            this.f101248ntlheqmsrt = null;
        }
    }

    private final void v() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new btonecajqb(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr1.iobyxmoadg v0(RegistrationFormState registrationFormState, SpecialBannerViewModel specialBannerViewModel, yr1.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        yr1.iobyxmoadg iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : registrationFormState.getUserName(), (4095 & 8) != 0 ? form.f126306iwizpuwonk : registrationFormState.getPhone(), (4095 & 16) != 0 ? form.f126302cqumvgiudr : registrationFormState.getEmail(), (4095 & 32) != 0 ? form.f126303esjtqupxsv : registrationFormState.getAdditionalField(), (4095 & 64) != 0 ? form.f126308lereixgezr : registrationFormState.getOrderNumber(), (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : registrationFormState.getSelectedOrderType(), (4095 & 4096) != 0 ? form.f126304iozdgvuglv : registrationFormState.getReceiptDate());
        gg.vdvldrhtss vdvldrhtssVar = specialBannerViewModel.f101248ntlheqmsrt;
        if (vdvldrhtssVar != null) {
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f126311yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f126307jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f126306iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f126302cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f126303esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f126309pmvmpeiblj : (String) vdvldrhtssVar.lqeggnwhkg(), (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f126313zynmafqrjb : (String) vdvldrhtssVar.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f126304iozdgvuglv : null);
            yr1.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f126311yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f126307jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f126306iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f126302cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f126303esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f126305istkbnxepw : iobyxmoadgVarIobyxmoadg.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f126304iozdgvuglv : null);
            if (iobyxmoadgVarIobyxmoadg2 != null) {
                return iobyxmoadgVarIobyxmoadg2;
            }
        }
        return iobyxmoadgVarIobyxmoadg;
    }

    private final void w(String str, String str2) {
        i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f101220cdpycssgdh.zoijcleaow(new PromoCollectionPayload(((rlfsiqarku) gtknphoqwx()).wkgbmnqykc(), str2, str, this.f101257rlfsiqarku)));
    }

    private final void w0(Set set) {
        this.f101253pkzmftpjix.wkgbmnqykc("promo_collection_scrolled_state", hg.jyumaefscl.m(set));
    }

    private final void x(ProductUiModel productUiModel) {
        if (((Boolean) wkgbmnqykc().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            fyldjkxazc(productUiModel);
        } else {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101277zynmafqrjb.eablkybsjg());
        }
    }

    private final void y() {
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr1.iobyxmoadg yzdjzghtvl(yr1.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        yr1.iobyxmoadg iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? form.f126311yggfygwlhe : null, (4095 & 4) != 0 ? form.f126307jyumaefscl : null, (4095 & 8) != 0 ? form.f126306iwizpuwonk : null, (4095 & 16) != 0 ? form.f126302cqumvgiudr : null, (4095 & 32) != 0 ? form.f126303esjtqupxsv : null, (4095 & 64) != 0 ? form.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f126305istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? form.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f126304iozdgvuglv : null);
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f126312zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f126311yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f126307jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f126306iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f126302cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f126303esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f126308lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f126309pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f126313zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f126305istkbnxepw : iobyxmoadgVarIobyxmoadg.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f126301cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f126310yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f126304iozdgvuglv : null);
    }

    private final void z() {
        this.f101227dxjokdxxww.zoijcleaow(Boolean.TRUE);
        this.f101265vipkmwdibw = true;
        zoijcleaow zoijcleaowVar = this.f101259sopmlzcsov;
        if (zoijcleaowVar == null) {
            c();
        } else {
            A0(this, zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.wkgbmnqykc(), false, false, 48, null);
            this.f101259sopmlzcsov = null;
        }
    }

    private final void z0(vq1.istkbnxepw istkbnxepwVar, Map map, UserInfo userInfo, boolean z13, boolean z14, boolean z15) {
        Object next;
        Object next2;
        Object value;
        this.f101257rlfsiqarku = istkbnxepwVar.iobyxmoadg();
        jztzpxfvev jztzpxfvevVar = this.f101250ojitshcjhn;
        List list = this.f101258sflfametgt;
        pz0.iobyxmoadg iobyxmoadgVarE = e();
        rlfsiqarku rlfsiqarkuVarWkgbmnqykc = jztzpxfvevVar.wkgbmnqykc(istkbnxepwVar, map, userInfo, z13, z14, z15, list, iobyxmoadgVarE != null ? iobyxmoadgVarE.ppxfxbqfkf() : null, this.f101263uwvvkdfqfp, new zdlpuopuiu(this.f101243lereixgezr));
        if (!this.f101239jyumaefscl.getLoadTitle()) {
            String bannerTitle = this.f101239jyumaefscl.getBannerTitle();
            if (bannerTitle == null) {
                bannerTitle = "";
            }
            rlfsiqarkuVarWkgbmnqykc = rlfsiqarku.zoijcleaow(rlfsiqarkuVarWkgbmnqykc, null, bannerTitle, null, null, false, null, false, 125, null);
        }
        Iterator it = rlfsiqarkuVarWkgbmnqykc.eablkybsjg().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((gz0.iobyxmoadg) next) instanceof yr1.iobyxmoadg));
        this.f101262ulzqkzuiru = next instanceof yr1.iobyxmoadg ? (yr1.iobyxmoadg) next : null;
        Iterator it2 = rlfsiqarkuVarWkgbmnqykc.eablkybsjg().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!(((gz0.iobyxmoadg) next2) instanceof ss1.iobyxmoadg));
        gz0.iobyxmoadg iobyxmoadgVar = (gz0.iobyxmoadg) next2;
        if (iobyxmoadgVar != null) {
            ss1.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof ss1.iobyxmoadg ? (ss1.iobyxmoadg) iobyxmoadgVar : null;
            if (iobyxmoadgVar2 != null) {
                J0(iobyxmoadgVar2.eablkybsjg());
            }
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rlfsiqarkuVarWkgbmnqykc));
        if (rlfsiqarkuVarWkgbmnqykc.eablkybsjg().isEmpty()) {
            return;
        }
        this.f101230hcddaimhww.zoijcleaow(new ym0.dxjokdxxww.iobyxmoadg(null, 1, null));
    }

    public final void H(String itemId, Date date) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(date, "date");
        this.f101223crxdokpmqz.setTime(date);
        Date time = this.f101223crxdokpmqz.getTime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        yggfygwlhe(new czzsidtyhn.zoijcleaow(itemId, time));
    }

    public final void J(xrmfcynszj event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof xrmfcynszj.gxszxtbevo) {
            A();
            return;
        }
        if (event instanceof xrmfcynszj.dxjokdxxww) {
            C(((xrmfcynszj.dxjokdxxww) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.vdvldrhtss) {
            I(((xrmfcynszj.vdvldrhtss) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.hkdspvbjdz) {
            c0(((xrmfcynszj.hkdspvbjdz) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.yadqdtsiqt) {
            b0(((xrmfcynszj.yadqdtsiqt) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.dsvhmnatus) {
            f0(((xrmfcynszj.dsvhmnatus) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.pkzmftpjix) {
            xrmfcynszj.pkzmftpjix pkzmftpjixVar = (xrmfcynszj.pkzmftpjix) event;
            Y(pkzmftpjixVar.iobyxmoadg(), pkzmftpjixVar.zoijcleaow());
            return;
        }
        if (event instanceof xrmfcynszj.ylkuphrtab) {
            X(((xrmfcynszj.ylkuphrtab) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.zynmafqrjb) {
            return;
        }
        if (event instanceof xrmfcynszj.lmojexxdyd) {
            xrmfcynszj.lmojexxdyd lmojexxdydVar = (xrmfcynszj.lmojexxdyd) event;
            W(lmojexxdydVar.zoijcleaow(), lmojexxdydVar.iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.iwizpuwonk) {
            P(((xrmfcynszj.iwizpuwonk) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.jpowsppfya) {
            Z(((xrmfcynszj.jpowsppfya) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.gtknphoqwx) {
            F();
            return;
        }
        if (event instanceof xrmfcynszj.iozdgvuglv) {
            xrmfcynszj.iozdgvuglv iozdgvuglvVar = (xrmfcynszj.iozdgvuglv) event;
            V(iozdgvuglvVar.zoijcleaow(), iozdgvuglvVar.ppxfxbqfkf(), iozdgvuglvVar.iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.jyumaefscl) {
            xrmfcynszj.jyumaefscl jyumaefsclVar = (xrmfcynszj.jyumaefscl) event;
            O(jyumaefsclVar.zoijcleaow(), jyumaefsclVar.iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.btonecajqb) {
            istkbnxepw(((xrmfcynszj.btonecajqb) event).iobyxmoadg(), false);
            return;
        }
        if (event instanceof xrmfcynszj.esjtqupxsv) {
            xrmfcynszj.esjtqupxsv esjtqupxsvVar = (xrmfcynszj.esjtqupxsv) event;
            R(esjtqupxsvVar.zoijcleaow(), esjtqupxsvVar.iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.eablkybsjg) {
            grlcpdaxtj(((xrmfcynszj.eablkybsjg) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.rgvfuqvkyq) {
            rhgxfdycjh(((xrmfcynszj.rgvfuqvkyq) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.cqumvgiudr) {
            Q(((xrmfcynszj.cqumvgiudr) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.lereixgezr) {
            a0(((xrmfcynszj.lereixgezr) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.pmvmpeiblj) {
            g0();
            return;
        }
        if (event instanceof xrmfcynszj.draadjrbmk) {
            xrmfcynszj.draadjrbmk draadjrbmkVar = (xrmfcynszj.draadjrbmk) event;
            n(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.agtfadlqog) {
            o(((xrmfcynszj.agtfadlqog) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.wflxmlrfwp) {
            xrmfcynszj.wflxmlrfwp wflxmlrfwpVar = (xrmfcynszj.wflxmlrfwp) event;
            G(wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.zoijcleaow());
            return;
        }
        if (event instanceof xrmfcynszj.ojitshcjhn) {
            p0(((xrmfcynszj.ojitshcjhn) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, xrmfcynszj.cdpycssgdh.f101557iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.yadqdtsiqt(MainTab.CART, true);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, xrmfcynszj.ppxfxbqfkf.f101594iobyxmoadg)) {
            y();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, xrmfcynszj.wkgbmnqykc.f101601iobyxmoadg)) {
            z();
            return;
        }
        if (event instanceof xrmfcynszj.lqeggnwhkg) {
            xrmfcynszj.lqeggnwhkg lqeggnwhkgVar = (xrmfcynszj.lqeggnwhkg) event;
            B(lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.istkbnxepw) {
            U(((xrmfcynszj.istkbnxepw) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.hcddaimhww) {
            ezmngbhpjk(((xrmfcynszj.hcddaimhww) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.oxmwwwfdhm) {
            K(((xrmfcynszj.oxmwwwfdhm) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.zdlpuopuiu) {
            M(((xrmfcynszj.zdlpuopuiu) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.kcexrzcfyt) {
            L(((xrmfcynszj.kcexrzcfyt) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, xrmfcynszj.yggfygwlhe.f101608iobyxmoadg)) {
            N();
            return;
        }
        if (event instanceof xrmfcynszj.cllcsxoeiz) {
            d0(((xrmfcynszj.cllcsxoeiz) event).iobyxmoadg());
            return;
        }
        if (event instanceof xrmfcynszj.zoijcleaow) {
            x(((xrmfcynszj.zoijcleaow) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, xrmfcynszj.nufgyqmvbu.f101588iobyxmoadg)) {
            m();
            return;
        }
        if (event instanceof xrmfcynszj.iobyxmoadg) {
            xrmfcynszj.iobyxmoadg iobyxmoadgVar = (xrmfcynszj.iobyxmoadg) event;
            q(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
            return;
        }
        if (event instanceof xrmfcynszj.wypolnanlu) {
            xrmfcynszj.wypolnanlu wypolnanluVar = (xrmfcynszj.wypolnanlu) event;
            w(wypolnanluVar.iobyxmoadg(), wypolnanluVar.zoijcleaow());
            return;
        }
        if (event instanceof xrmfcynszj.stevsuqkhv) {
            xrmfcynszj.stevsuqkhv stevsuqkhvVar = (xrmfcynszj.stevsuqkhv) event;
            s(stevsuqkhvVar.iobyxmoadg(), stevsuqkhvVar.zoijcleaow());
        } else if (event instanceof xrmfcynszj.kegysxyocb) {
            t(((xrmfcynszj.kegysxyocb) event).iobyxmoadg());
        } else {
            if (!(event instanceof xrmfcynszj.wwaezpbzkn)) {
                throw new NoWhenBranchMatchedException();
            }
            xrmfcynszj.wwaezpbzkn wwaezpbzknVar = (xrmfcynszj.wwaezpbzkn) event;
            T(wwaezpbzknVar.ppxfxbqfkf(), wwaezpbzknVar.iobyxmoadg(), wwaezpbzknVar.zoijcleaow());
        }
    }

    public tg.iobyxmoadg d() {
        return this.f101271ydmasvzmpa;
    }

    public pz0.iobyxmoadg e() {
        return this.f101272yfnezrywwk;
    }

    public final void e0(String itemId, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        Calendar.getInstance().set(13, 1);
        this.f101223crxdokpmqz.set(11, i13);
        this.f101223crxdokpmqz.set(12, i14);
        this.f101223crxdokpmqz.set(13, 0);
        this.f101237jlmebxxoox = k().format(this.f101223crxdokpmqz.getTime());
        Q0(itemId);
    }

    public final RegistrationFormState h() {
        Object next;
        Iterator it = ((rlfsiqarku) gtknphoqwx()).eablkybsjg().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((gz0.iobyxmoadg) next) instanceof yr1.iobyxmoadg));
        yr1.iobyxmoadg iobyxmoadgVar = next instanceof yr1.iobyxmoadg ? (yr1.iobyxmoadg) next : null;
        if (iobyxmoadgVar != null) {
            return new RegistrationFormState(iobyxmoadgVar.getItemId(), iobyxmoadgVar.oxmwwwfdhm(), iobyxmoadgVar.ojitshcjhn(), iobyxmoadgVar.dxjokdxxww(), iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.wflxmlrfwp(), iobyxmoadgVar.vdvldrhtss(), this.f101237jlmebxxoox);
        }
        return null;
    }

    @Override // r01.iobyxmoadg
    public void hcddaimhww(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new kcexrzcfyt(params, null), 3, null);
    }

    public sj.lqeggnwhkg i() {
        return this.f101245lqeggnwhkg.ppxfxbqfkf();
    }

    public final Date j() {
        Date date;
        String str = this.f101237jlmebxxoox;
        if (str != null && (date = k().parse(str)) != null) {
            return date;
        }
        Date time = this.f101223crxdokpmqz.getTime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        return time;
    }

    public void l(pw0.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f101245lqeggnwhkg.wkgbmnqykc(event);
    }

    @Override // sw0.eablkybsjg, androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        String landingPageKey = this.f101239jyumaefscl.getLandingPageKey();
        if (landingPageKey != null) {
            this.f101231hkdspvbjdz.zoijcleaow(landingPageKey);
        }
        super.onCleared();
    }

    @Override // r01.iobyxmoadg
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f101271ydmasvzmpa = iobyxmoadgVar;
    }

    @Override // sw0.eablkybsjg
    protected Object vdvldrhtss(pw0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        l(iobyxmoadgVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // r01.iobyxmoadg
    public ow1.esjtqupxsv wkgbmnqykc() {
        return this.f101229gtknphoqwx;
    }

    public void x0(pz0.iobyxmoadg iobyxmoadgVar) {
        this.f101272yfnezrywwk = iobyxmoadgVar;
    }

    public final void y0(RegistrationFormState savedState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedState, "savedState");
        this.f101246mbcevpiqjq = savedState;
    }

    @Override // r01.iobyxmoadg
    public void yadqdtsiqt(ChangeProductParams changeProductParams) {
        yggfygwlhe(czzsidtyhn.rgvfuqvkyq.f101421iobyxmoadg);
    }

    @Override // r01.iobyxmoadg
    public void zoijcleaow() {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101277zynmafqrjb.eablkybsjg());
    }
}
