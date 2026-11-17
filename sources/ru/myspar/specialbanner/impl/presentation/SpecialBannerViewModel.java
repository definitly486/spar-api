package ru.myspar.specialbanner.impl.presentation;

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
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.components.promo_collection.api.models.PromoCollectionItem;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.error_handler.exceptions.FileSizeException;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.domain.feature.qrcode.store.QrCodeButton;
import ru.myspar.domain.feature.shops.store.ShopsArgs;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.promo_collection.api.models.PromoCollectionPayload;
import ru.myspar.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.rate.feedback.api.models.FeedbackArgs;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.specialbanner.impl.presentation.views.RegistrationFormView;
import ru.myspar.user.models.User;
import ru.myspar.videoplayer.api.model.VideoPlayerArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class SpecialBannerViewModel extends vx.eablkybsjg implements h20.ppxfxbqfkf {

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    public static final iobyxmoadg f103877bfopjjpdmp = new iobyxmoadg(null);

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    public static final int f103878opjhrmiecq = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final c20.dxjokdxxww f103879agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final a20.iobyxmoadg f103880btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final sa2.iobyxmoadg f103881cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final androidx.lifecycle.pkzmftpjix f103882cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final SpecialBannerPayload f103883cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private zoijcleaow f103884crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private ColorsModel f103885czzsidtyhn;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final c20.eablkybsjg f103886draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final lo.zoijcleaow f103887dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final t20.zoijcleaow f103888dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final l00.gtknphoqwx f103889esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final a20.zoijcleaow f103890gtknphoqwx;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final ya2.iobyxmoadg f103891hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final jw.iobyxmoadg f103892hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private auzgnhcxok f103893ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final sm.iobyxmoadg f103894iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final qm.iobyxmoadg f103895istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final e52.zoijcleaow f103896iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private boolean f103897jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private final Calendar f103898jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final kz1.iobyxmoadg f103899jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final q20.iobyxmoadg f103900jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private auzgnhcxok f103901jztzpxfvev;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final p90.zoijcleaow f103902kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final j00.zoijcleaow f103903kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final a72.iobyxmoadg f103904lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final lq.iobyxmoadg f103905lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f103906lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private String f103907mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private boolean f103908metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private RegistrationFormState f103909ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final nz1.iobyxmoadg f103910nufgyqmvbu;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private final gg.gtknphoqwx f103911oipsdeybqn;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final f20.ppxfxbqfkf f103912ojitshcjhn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private auzgnhcxok f103913okpsazkaxt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final oa0.agtfadlqog f103914oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final pe0.iobyxmoadg f103915pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final z10.nufgyqmvbu f103916pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final xrmfcynszj f103917rgvfuqvkyq;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private String f103918ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private boolean f103919rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private tg.iobyxmoadg f103920sflfametgt;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private f62.iobyxmoadg f103921sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final d52.iobyxmoadg f103922stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final z10.iobyxmoadg f103923tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private gg.vdvldrhtss f103924ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private String f103925uwvvkdfqfp;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final e52.ppxfxbqfkf f103926vdvldrhtss;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private final gg.gtknphoqwx f103927vipkmwdibw;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final k00.iobyxmoadg f103928wflxmlrfwp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final fx1.iobyxmoadg f103929wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f103930wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private auzgnhcxok f103931xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final ro.iobyxmoadg f103932yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private y00.iobyxmoadg f103933ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private final Set f103934yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final q20.zoijcleaow f103935yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final yy1.iobyxmoadg f103936ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final p90.iobyxmoadg f103937zdlpuopuiu;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private List f103938zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final d60.iobyxmoadg f103939zynmafqrjb;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lru/myspar/specialbanner/impl/presentation/SpecialBannerViewModel$RegistrationFormState;", "Landroid/os/Parcelable;", "", "itemId", "userName", "phone", Scopes.EMAIL, "additionalField", "orderNumber", "Lc52/pmvmpeiblj;", "selectedOrderType", "receiptDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc52/pmvmpeiblj;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "btonecajqb", "jyumaefscl", "lqeggnwhkg", "iwizpuwonk", "ppxfxbqfkf", "cqumvgiudr", "zoijcleaow", "esjtqupxsv", "gxszxtbevo", "lereixgezr", "Lc52/pmvmpeiblj;", "dxjokdxxww", "()Lc52/pmvmpeiblj;", "pmvmpeiblj", "nufgyqmvbu", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        private final c52.pmvmpeiblj selectedOrderType;

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
                return new RegistrationFormState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), c52.pmvmpeiblj.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final RegistrationFormState[] newArray(int i13) {
                return new RegistrationFormState[i13];
            }
        }

        public RegistrationFormState(String itemId, String userName, String phone, String email, String additionalField, String orderNumber, c52.pmvmpeiblj selectedOrderType, String str) {
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
        public final c52.pmvmpeiblj getSelectedOrderType() {
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

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ProductUiModel f103948iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ AnalyticsLocation.ItemFeed f103949jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103951zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(AnalyticsLocation.ItemFeed itemFeed, ProductUiModel productUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f103949jyumaefscl = itemFeed;
            this.f103948iwizpuwonk = productUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new agtfadlqog(this.f103949jyumaefscl, this.f103948iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103951zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow = new no.zoijcleaow.C1522zoijcleaow(new AnalyticsPage.LandingPage(((czzsidtyhn) SpecialBannerViewModel.this.gtknphoqwx()).lqeggnwhkg(), ((czzsidtyhn) SpecialBannerViewModel.this.gtknphoqwx()).wkgbmnqykc()), this.f103949jyumaefscl, new AnalyticElement.ProductItemElement(this.f103948iwizpuwonk.getArticle(), this.f103948iwizpuwonk.getName()));
                j00.zoijcleaow zoijcleaowVar = SpecialBannerViewModel.this.f103903kegysxyocb;
                String id2 = this.f103948iwizpuwonk.getId();
                boolean isFavorite = this.f103948iwizpuwonk.getIsFavorite();
                this.f103951zdlpuopuiu = 1;
                if (zoijcleaowVar.lqeggnwhkg(id2, isFavorite, c1522zoijcleaow, this) == objGxszxtbevo) {
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
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103953zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            /* synthetic */ boolean f103954iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f103955jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f103956yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f103957zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(4, gxszxtbevoVar);
            }

            @Override // tg.oxmwwwfdhm
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ojitshcjhn((gg.vdvldrhtss) obj, (y00.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f103957zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return new rlfsiqarku((gg.vdvldrhtss) this.f103956yggfygwlhe, (y00.iobyxmoadg) this.f103955jyumaefscl, this.f103954iwizpuwonk);
            }

            public final Object ojitshcjhn(gg.vdvldrhtss vdvldrhtssVar, y00.iobyxmoadg iobyxmoadgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar2.f103956yggfygwlhe = vdvldrhtssVar;
                iobyxmoadgVar2.f103955jyumaefscl = iobyxmoadgVar;
                iobyxmoadgVar2.f103954iwizpuwonk = z13;
                return iobyxmoadgVar2.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f103958zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f103959zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.specialbanner.impl.presentation.SpecialBannerViewModel$btonecajqb$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2517iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f103961yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f103962zdlpuopuiu;

                    public C2517iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f103962zdlpuopuiu = obj;
                        this.f103961yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f103959zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2517iobyxmoadg c2517iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2517iobyxmoadg) {
                        c2517iobyxmoadg = (C2517iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2517iobyxmoadg.f103961yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2517iobyxmoadg.f103961yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2517iobyxmoadg = new C2517iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2517iobyxmoadg = new C2517iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2517iobyxmoadg.f103962zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2517iobyxmoadg.f103961yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f103959zdlpuopuiu;
                        if (((rlfsiqarku) obj).ppxfxbqfkf()) {
                            c2517iobyxmoadg.f103961yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2517iobyxmoadg) == objGxszxtbevo) {
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
                this.f103958zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f103958zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f103963yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f103964zdlpuopuiu;

            zoijcleaow(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, SpecialBannerViewModel specialBannerViewModel) {
                this.f103964zdlpuopuiu = hkdspvbjdzVar;
                this.f103963yggfygwlhe = specialBannerViewModel;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(rlfsiqarku rlfsiqarkuVar, lg.gxszxtbevo gxszxtbevoVar) {
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = rlfsiqarkuVar.iobyxmoadg();
                y00.iobyxmoadg iobyxmoadgVarZoijcleaow = rlfsiqarkuVar.zoijcleaow();
                Object obj = this.f103964zdlpuopuiu.f60015zdlpuopuiu;
                boolean z13 = false;
                if (obj != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVarIobyxmoadg, obj)) {
                    this.f103963yggfygwlhe.f103897jhduphickx = false;
                }
                boolean z14 = true;
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVarIobyxmoadg, this.f103964zdlpuopuiu.f60015zdlpuopuiu)) {
                    this.f103964zdlpuopuiu.f60015zdlpuopuiu = vdvldrhtssVarIobyxmoadg;
                    z13 = true;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f103963yggfygwlhe.kcexrzcfyt(), iobyxmoadgVarZoijcleaow)) {
                    z14 = z13;
                } else {
                    this.f103963yggfygwlhe.w0(iobyxmoadgVarZoijcleaow);
                    tg.iobyxmoadg iobyxmoadgVarD = this.f103963yggfygwlhe.d();
                    if (iobyxmoadgVarD != null) {
                        iobyxmoadgVarD.invoke();
                    }
                }
                if (z14) {
                    this.f103963yggfygwlhe.c();
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
            int i13 = this.f103953zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(sj.dxjokdxxww.draadjrbmk(sj.dxjokdxxww.vdvldrhtss(SpecialBannerViewModel.this.f103879agtfadlqog.wkgbmnqykc()), SpecialBannerViewModel.this.f103916pmvmpeiblj.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg), SpecialBannerViewModel.this.h(), new iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(hkdspvbjdzVar, SpecialBannerViewModel.this);
                this.f103953zdlpuopuiu = 1;
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

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103966zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f103967zdlpuopuiu;

            iobyxmoadg(SpecialBannerViewModel specialBannerViewModel) {
                this.f103967zdlpuopuiu = specialBannerViewModel;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(l00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (eablkybsjgVar instanceof l00.eablkybsjg.iobyxmoadg) {
                    this.f103967zdlpuopuiu.zdlpuopuiu(((l00.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof l00.eablkybsjg.ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f103967zdlpuopuiu.r0(((l00.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new cqumvgiudr(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103966zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = SpecialBannerViewModel.this.e().zoijcleaow();
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(SpecialBannerViewModel.this);
                this.f103966zdlpuopuiu = 1;
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
            return ((cqumvgiudr) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ b62.zoijcleaow f103968jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103970zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(b62.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f103968jyumaefscl = zoijcleaowVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b62.zoijcleaow kcexrzcfyt(c52.gxszxtbevo.iobyxmoadg iobyxmoadgVar, b62.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar) {
            if (iobyxmoadgVar != null) {
                boolean zWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
                b62.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = b62.zoijcleaow.ppxfxbqfkf.nufgyqmvbu(ppxfxbqfkfVar, null, iobyxmoadgVar.ppxfxbqfkf(), null, zWkgbmnqykc, false, iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), 5, null);
                if (ppxfxbqfkfVarNufgyqmvbu != null) {
                    return ppxfxbqfkfVarNufgyqmvbu;
                }
            }
            return b62.zoijcleaow.ppxfxbqfkf.nufgyqmvbu(ppxfxbqfkfVar, null, null, null, false, false, null, null, 111, null);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new draadjrbmk(this.f103968jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object value;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103970zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                    b62.zoijcleaow zoijcleaowVar = this.f103968jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    d52.iobyxmoadg iobyxmoadgVar2 = specialBannerViewModel.f103922stevsuqkhv;
                    String strWkgbmnqykc = ((czzsidtyhn) specialBannerViewModel.gtknphoqwx()).wkgbmnqykc();
                    String itemId = zoijcleaowVar.getItemId();
                    this.f103970zdlpuopuiu = 1;
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
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((c52.gxszxtbevo.iobyxmoadg) obj);
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
            final c52.gxszxtbevo.iobyxmoadg iobyxmoadgVar4 = (c52.gxszxtbevo.iobyxmoadg) objWkgbmnqykc;
            List listD = SpecialBannerViewModel.D(((czzsidtyhn) SpecialBannerViewModel.this.gtknphoqwx()).eablkybsjg(), this.f103968jyumaefscl, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.nuxfzjnpeb
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj2) {
                    return SpecialBannerViewModel.draadjrbmk.kcexrzcfyt(iobyxmoadgVar4, (b62.zoijcleaow.ppxfxbqfkf) obj2);
                }
            });
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = SpecialBannerViewModel.this.ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow((czzsidtyhn) value, null, null, null, null, false, listD, false, 95, null)));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f103972yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103973zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            dxjokdxxww dxjokdxxwwVar = SpecialBannerViewModel.this.new dxjokdxxww(gxszxtbevoVar);
            dxjokdxxwwVar.f103972yggfygwlhe = obj;
            return dxjokdxxwwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f103973zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(((Throwable) this.f103972yggfygwlhe) instanceof CancellationException) && SpecialBannerViewModel.this.f103884crxdokpmqz == null) {
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
        final /* synthetic */ ProductUiModel f103974iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f103976yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f103977zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f103978yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f103979zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(SpecialBannerViewModel specialBannerViewModel, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f103978yggfygwlhe = specialBannerViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f103978yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f103979zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    this.f103979zdlpuopuiu = 1;
                    if (pj.crxdokpmqz.zoijcleaow(350L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                this.f103978yggfygwlhe.yggfygwlhe(new uwvvkdfqfp.jyumaefscl(pm.dxjokdxxww.purchases_list_product_added_to_the_list));
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
            this.f103974iwizpuwonk = productUiModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void kcexrzcfyt(SpecialBannerViewModel specialBannerViewModel, Object obj) {
            if (specialBannerViewModel.f103930wypolnanlu.ppxfxbqfkf(obj)) {
                pj.gtknphoqwx.wkgbmnqykc(specialBannerViewModel.agtfadlqog(), null, null, new iobyxmoadg(specialBannerViewModel, null), 3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new eablkybsjg(this.f103974iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
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
            int i13 = this.f103976yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.this.A0(true);
                List list = SpecialBannerViewModel.this.f103938zfvoamnweg;
                ProductUiModel productUiModel = this.f103974iwizpuwonk;
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
                    yy1.iobyxmoadg iobyxmoadgVar2 = specialBannerViewModel.f103936ylkuphrtab;
                    this.f103977zdlpuopuiu = productUIData2;
                    this.f103976yggfygwlhe = 1;
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
                productUIData = (ProductUIData) this.f103977zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
            ProductUiModel productUiModel2 = this.f103974iwizpuwonk;
            final SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                List list2 = (List) objWkgbmnqykc;
                if (productUIData == null || (measureType = productUIData.getMeasureType()) == null || (currentMeasure = measureType.L(productUiModel2.getMeasureTypeModel())) == null) {
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
                specialBannerViewModel2.yggfygwlhe(new uwvvkdfqfp.btonecajqb(new PurchaseListAddProductDialogArgs.SingleProduct(article, basketDefault, currentMeasure.getValue(), list2)));
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(specialBannerViewModel2.f103930wypolnanlu.zoijcleaow(), new l9.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.zeieaojujs
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
            SpecialBannerViewModel.this.A0(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f103980jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103982zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ String f103983yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f103984zdlpuopuiu;

            iobyxmoadg(SpecialBannerViewModel specialBannerViewModel, String str) {
                this.f103984zdlpuopuiu = specialBannerViewModel;
                this.f103983yggfygwlhe = str;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, lg.gxszxtbevo gxszxtbevoVar) {
                this.f103984zdlpuopuiu.O0(this.f103983yggfygwlhe, list);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        esjtqupxsv(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f103980jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new esjtqupxsv(this.f103980jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103982zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = SpecialBannerViewModel.this.f103892hkdspvbjdz.zoijcleaow(this.f103980jyumaefscl, SpecialBannerViewModel.this.f103925uwvvkdfqfp);
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(SpecialBannerViewModel.this, this.f103980jyumaefscl);
                this.f103982zdlpuopuiu = 1;
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
            return ((esjtqupxsv) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103986zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new gtknphoqwx(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103986zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = SpecialBannerViewModel.this.f103894iozdgvuglv;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f103986zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(SpecialBannerViewModel.this.f103895istkbnxepw.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow())));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103988zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103988zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    t20.zoijcleaow zoijcleaowVar = specialBannerViewModel.f103888dxjokdxxww;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    this.f103988zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) obj).booleanValue()));
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            return gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false) : objWkgbmnqykc;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
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
        int f103990zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ boolean f103991jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f103992yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f103993zdlpuopuiu;

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
                if (this.f103993zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return gg.cqumvgiudr.iobyxmoadg((List) this.f103992yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f103991jyumaefscl));
            }

            public final Object ojitshcjhn(List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar.f103992yggfygwlhe = list;
                iobyxmoadgVar.f103991jyumaefscl = z13;
                return iobyxmoadgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f103994zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f103995zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.specialbanner.impl.presentation.SpecialBannerViewModel$iwizpuwonk$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2518iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f103997yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f103998zdlpuopuiu;

                    public C2518iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f103998zdlpuopuiu = obj;
                        this.f103997yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f103995zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2518iobyxmoadg c2518iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2518iobyxmoadg) {
                        c2518iobyxmoadg = (C2518iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2518iobyxmoadg.f103997yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2518iobyxmoadg.f103997yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2518iobyxmoadg = new C2518iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2518iobyxmoadg = new C2518iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2518iobyxmoadg.f103998zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2518iobyxmoadg.f103997yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f103995zdlpuopuiu;
                        if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                            c2518iobyxmoadg.f103997yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2518iobyxmoadg) == objGxszxtbevo) {
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
                this.f103994zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f103994zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SpecialBannerViewModel f103999zdlpuopuiu;

            static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                int f104000iwizpuwonk;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                /* synthetic */ Object f104002yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                Object f104003zdlpuopuiu;

                iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f104002yggfygwlhe = obj;
                    this.f104000iwizpuwonk |= Integer.MIN_VALUE;
                    return zoijcleaow.this.emit(null, this);
                }
            }

            zoijcleaow(SpecialBannerViewModel specialBannerViewModel) {
                this.f103999zdlpuopuiu = specialBannerViewModel;
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
                    int i13 = iobyxmoadgVar.f104000iwizpuwonk;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        iobyxmoadgVar.f104000iwizpuwonk = i13 - Integer.MIN_VALUE;
                    } else {
                        iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
                Object objInvoke = iobyxmoadgVar.f104002yggfygwlhe;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = iobyxmoadgVar.f104000iwizpuwonk;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                    List list = (List) vdvldrhtssVar.iobyxmoadg();
                    this.f103999zdlpuopuiu.f103938zfvoamnweg = list;
                    a72.iobyxmoadg iobyxmoadgVar2 = this.f103999zdlpuopuiu.f103904lereixgezr;
                    List listEablkybsjg = ((czzsidtyhn) this.f103999zdlpuopuiu.gtknphoqwx()).eablkybsjg();
                    iobyxmoadgVar.f104003zdlpuopuiu = this;
                    iobyxmoadgVar.f104000iwizpuwonk = 1;
                    objInvoke = iobyxmoadgVar2.invoke(listEablkybsjg, list, iobyxmoadgVar);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f104003zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                }
                List list2 = (List) objInvoke;
                sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = zoijcleaowVar.f103999zdlpuopuiu.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow((czzsidtyhn) value, null, null, null, null, false, list2, false, 95, null)));
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
            int i13 = this.f103990zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(sj.dxjokdxxww.wflxmlrfwp(SpecialBannerViewModel.this.e().iobyxmoadg(), SpecialBannerViewModel.this.h(), new iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(SpecialBannerViewModel.this);
                this.f103990zdlpuopuiu = 1;
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
        /* synthetic */ Object f104004yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104005zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f104005zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f104004yggfygwlhe, new CrashlyticsKey[0]);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f104004yggfygwlhe = th2;
            return jyumaefsclVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f104006jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104008zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        kcexrzcfyt(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104006jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new kcexrzcfyt(this.f104006jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104008zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                l00.btonecajqb btonecajqbVarE = SpecialBannerViewModel.this.e();
                ChangeProductParams changeProductParams = this.f104006jyumaefscl;
                this.f104008zdlpuopuiu = 1;
                if (btonecajqbVarE.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f104010yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        boolean f104011zdlpuopuiu;

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
            int i13 = this.f104010yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.this.A0(true);
                oa0.agtfadlqog agtfadlqogVar = SpecialBannerViewModel.this.f103914oxmwwwfdhm;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f104010yggfygwlhe = 1;
                obj = agtfadlqogVar.zoijcleaow(wwaezpbzknVar, this);
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
                    z14 = this.f104011zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((c52.rgvfuqvkyq) obj);
                    } catch (Throwable th2) {
                        th = th2;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    }
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.f103919rlfsiqarku = false;
                        specialBannerViewModel.i0((c52.rgvfuqvkyq) objWkgbmnqykc, z14);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null && !(thDxjokdxxww instanceof CancellationException)) {
                        specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                    }
                    SpecialBannerViewModel.this.A0(false);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                z13 = this.f104011zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                y00.iobyxmoadg iobyxmoadgVar2 = (y00.iobyxmoadg) obj;
                s42.iobyxmoadg iobyxmoadgVar3 = new s42.iobyxmoadg(SpecialBannerViewModel.this.f103883cqumvgiudr.getBannerId(), iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf(), null, false);
                landingPageKey = SpecialBannerViewModel.this.f103883cqumvgiudr.getLandingPageKey();
                if (!SpecialBannerViewModel.this.f103919rlfsiqarku) {
                    landingPageKey = null;
                }
                SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    d52.iobyxmoadg iobyxmoadgVar5 = specialBannerViewModel2.f103922stevsuqkhv;
                    this.f104011zdlpuopuiu = z13;
                    this.f104010yggfygwlhe = 3;
                    obj = iobyxmoadgVar5.eablkybsjg(landingPageKey, iobyxmoadgVar3, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    z14 = z13;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((c52.rgvfuqvkyq) obj);
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.f103919rlfsiqarku = false;
                        specialBannerViewModel.i0((c52.rgvfuqvkyq) objWkgbmnqykc, z14);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                    }
                    SpecialBannerViewModel.this.A0(false);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th3) {
                    th = th3;
                    z14 = z13;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            z10.iobyxmoadg iobyxmoadgVar7 = SpecialBannerViewModel.this.f103923tzroggbefp;
            gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
            this.f104011zdlpuopuiu = zBooleanValue;
            this.f104010yggfygwlhe = 2;
            Object objZoijcleaow = iobyxmoadgVar7.zoijcleaow(wwaezpbzknVar2, this);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            z13 = zBooleanValue;
            obj = objZoijcleaow;
            y00.iobyxmoadg iobyxmoadgVar8 = (y00.iobyxmoadg) obj;
            s42.iobyxmoadg iobyxmoadgVar9 = new s42.iobyxmoadg(SpecialBannerViewModel.this.f103883cqumvgiudr.getBannerId(), iobyxmoadgVar8.wkgbmnqykc(), iobyxmoadgVar8.ppxfxbqfkf(), null, false);
            landingPageKey = SpecialBannerViewModel.this.f103883cqumvgiudr.getLandingPageKey();
            if (!SpecialBannerViewModel.this.f103919rlfsiqarku) {
                landingPageKey = null;
            }
            SpecialBannerViewModel specialBannerViewModel3 = SpecialBannerViewModel.this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = gg.kcexrzcfyt.f37117yggfygwlhe;
            d52.iobyxmoadg iobyxmoadgVar11 = specialBannerViewModel3.f103922stevsuqkhv;
            this.f104011zdlpuopuiu = z13;
            this.f104010yggfygwlhe = 3;
            obj = iobyxmoadgVar11.eablkybsjg(landingPageKey, iobyxmoadgVar9, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            z14 = z13;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((c52.rgvfuqvkyq) obj);
            specialBannerViewModel = SpecialBannerViewModel.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                specialBannerViewModel.f103919rlfsiqarku = false;
                specialBannerViewModel.i0((c52.rgvfuqvkyq) objWkgbmnqykc, z14);
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
            }
            SpecialBannerViewModel.this.A0(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f104013yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104014zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            nufgyqmvbu nufgyqmvbuVar = SpecialBannerViewModel.this.new nufgyqmvbu(gxszxtbevoVar);
            nufgyqmvbuVar.f104013yggfygwlhe = obj;
            return nufgyqmvbuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f104014zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(((Throwable) this.f104013yggfygwlhe) instanceof CancellationException) && SpecialBannerViewModel.this.f103884crxdokpmqz == null) {
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

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f104015cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f104017jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f104018yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f104019zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ojitshcjhn(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104015cqumvgiudr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new ojitshcjhn(this.f104015cqumvgiudr, gxszxtbevoVar);
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
            int i13 = this.f104017jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        str2 = (String) this.f104018yggfygwlhe;
                        specialBannerViewModel2 = (SpecialBannerViewModel) this.f104019zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((String) obj);
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    str = this.f104015cqumvgiudr;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.j0((String) objWkgbmnqykc, str);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel specialBannerViewModel3 = SpecialBannerViewModel.this;
                str2 = this.f104015cqumvgiudr;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                e52.zoijcleaow zoijcleaowVar = specialBannerViewModel3.f103896iwizpuwonk;
                e52.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new e52.zoijcleaow.iobyxmoadg(str2);
                this.f104019zdlpuopuiu = specialBannerViewModel3;
                this.f104018yggfygwlhe = str2;
                this.f104017jyumaefscl = 1;
                Object objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar2, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                specialBannerViewModel2 = specialBannerViewModel3;
                obj = objZoijcleaow;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() > 10) {
                    specialBannerViewModel2.yggfygwlhe(uwvvkdfqfp.wflxmlrfwp.f104195iobyxmoadg);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                q20.iobyxmoadg iobyxmoadgVar3 = specialBannerViewModel2.f103900jyumaefscl;
                q20.iobyxmoadg.C1737iobyxmoadg c1737iobyxmoadg = new q20.iobyxmoadg.C1737iobyxmoadg(str2);
                this.f104019zdlpuopuiu = null;
                this.f104018yggfygwlhe = null;
                this.f104017jyumaefscl = 2;
                obj = iobyxmoadgVar3.zoijcleaow(c1737iobyxmoadg, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((String) obj);
                specialBannerViewModel = SpecialBannerViewModel.this;
                str = this.f104015cqumvgiudr;
                if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    specialBannerViewModel.j0((String) objWkgbmnqykc, str);
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
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f104020cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f104021iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f104022jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104024zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        oxmwwwfdhm(String str, String str2, String str3, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104022jyumaefscl = str;
            this.f104021iwizpuwonk = str2;
            this.f104020cqumvgiudr = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new oxmwwwfdhm(this.f104022jyumaefscl, this.f104021iwizpuwonk, this.f104020cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104024zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    SpecialBannerViewModel.this.fmlbqenlif(this.f104022jyumaefscl, true);
                    SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                    String str = this.f104022jyumaefscl;
                    String str2 = this.f104021iwizpuwonk;
                    String str3 = this.f104020cqumvgiudr;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    jw.iobyxmoadg iobyxmoadgVar2 = specialBannerViewModel.f103892hkdspvbjdz;
                    String strWkgbmnqykc = ((czzsidtyhn) specialBannerViewModel.gtknphoqwx()).wkgbmnqykc();
                    this.f104024zdlpuopuiu = 1;
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
                specialBannerViewModel2.yggfygwlhe(uwvvkdfqfp.gtknphoqwx.f104176iobyxmoadg);
            }
            SpecialBannerViewModel.this.fmlbqenlif(this.f104022jyumaefscl, false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f104025iobyxmoadg;

        static {
            int[] iArr = new int[f40.zoijcleaow.values().length];
            try {
                iArr[f40.zoijcleaow.QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f40.zoijcleaow.EVROPOLIS_GIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f104025iobyxmoadg = iArr;
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ f62.iobyxmoadg f104026cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f104028jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f104029yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f104030zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(f62.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104026cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new rgvfuqvkyq(this.f104026cqumvgiudr, gxszxtbevoVar);
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
            f62.iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            f62.iobyxmoadg iobyxmoadgVar2;
            SpecialBannerViewModel specialBannerViewModel2;
            String str;
            Object objZoijcleaow;
            f62.iobyxmoadg iobyxmoadgVar3;
            SpecialBannerViewModel specialBannerViewModel3;
            String strWflxmlrfwp;
            String str2;
            String strGtknphoqwx;
            c52.pmvmpeiblj pmvmpeibljVarVdvldrhtss;
            c52.pmvmpeiblj pmvmpeibljVar;
            String str3;
            String str4;
            e52.ppxfxbqfkf ppxfxbqfkfVar;
            e52.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar4;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104028jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        specialBannerViewModel3 = (SpecialBannerViewModel) this.f104029yggfygwlhe;
                        f62.iobyxmoadg iobyxmoadgVar5 = (f62.iobyxmoadg) this.f104030zdlpuopuiu;
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
                    iobyxmoadgVar = this.f104026cqumvgiudr;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.m0(iobyxmoadgVar.getItemId());
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        specialBannerViewModel.l0(thDxjokdxxww);
                    }
                    SpecialBannerViewModel.this.A0(false);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.this.A0(true);
                iobyxmoadgVar2 = this.f104026cqumvgiudr;
                specialBannerViewModel2 = SpecialBannerViewModel.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                String strBtonecajqb = iobyxmoadgVar2.btonecajqb();
                if (strBtonecajqb != null) {
                    q20.zoijcleaow zoijcleaowVar = specialBannerViewModel2.f103935yggfygwlhe;
                    q20.zoijcleaow.iobyxmoadg iobyxmoadgVar7 = new q20.zoijcleaow.iobyxmoadg(strBtonecajqb, 10);
                    this.f104030zdlpuopuiu = iobyxmoadgVar2;
                    this.f104029yggfygwlhe = specialBannerViewModel2;
                    this.f104028jyumaefscl = 1;
                    objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar7, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    specialBannerViewModel3 = specialBannerViewModel2;
                } else {
                    str = null;
                }
                String bannerId = specialBannerViewModel2.f103883cqumvgiudr.getBannerId();
                int i14 = Integer.parseInt(iobyxmoadgVar2.getItemId());
                String strOxmwwwfdhm = iobyxmoadgVar2.oxmwwwfdhm();
                String strOjitshcjhn = iobyxmoadgVar2.ojitshcjhn();
                String strDxjokdxxww = iobyxmoadgVar2.dxjokdxxww();
                String strEablkybsjg = iobyxmoadgVar2.eablkybsjg();
                String strWkgbmnqykc = iobyxmoadgVar2.vdvldrhtss().wkgbmnqykc();
                strWflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp();
                if (iobyxmoadgVar2.vdvldrhtss() == c52.pmvmpeiblj.ONLINE) {
                    str2 = strWflxmlrfwp;
                } else {
                    str2 = null;
                }
                strGtknphoqwx = iobyxmoadgVar2.gtknphoqwx();
                pmvmpeibljVarVdvldrhtss = iobyxmoadgVar2.vdvldrhtss();
                pmvmpeibljVar = c52.pmvmpeiblj.IN_STORE;
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
                c52.esjtqupxsv esjtqupxsvVar = new c52.esjtqupxsv(bannerId, i14, strOxmwwwfdhm, strOjitshcjhn, strDxjokdxxww, strEablkybsjg, strWkgbmnqykc, str2, str3, iobyxmoadgVar2.rgvfuqvkyq(), str4);
                ppxfxbqfkfVar = specialBannerViewModel2.f103926vdvldrhtss;
                iobyxmoadgVar4 = new e52.ppxfxbqfkf.iobyxmoadg(esjtqupxsvVar);
                this.f104030zdlpuopuiu = null;
                this.f104029yggfygwlhe = null;
                this.f104028jyumaefscl = 2;
                if (ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar4, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
                specialBannerViewModel = SpecialBannerViewModel.this;
                iobyxmoadgVar = this.f104026cqumvgiudr;
                if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    specialBannerViewModel.m0(iobyxmoadgVar.getItemId());
                }
                thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    specialBannerViewModel.l0(thDxjokdxxww);
                }
                SpecialBannerViewModel.this.A0(false);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
                str = (String) objZoijcleaow;
                f62.iobyxmoadg iobyxmoadgVar8 = iobyxmoadgVar3;
                specialBannerViewModel2 = specialBannerViewModel3;
                iobyxmoadgVar2 = iobyxmoadgVar8;
                String bannerId2 = specialBannerViewModel2.f103883cqumvgiudr.getBannerId();
                int i15 = Integer.parseInt(iobyxmoadgVar2.getItemId());
                String strOxmwwwfdhm2 = iobyxmoadgVar2.oxmwwwfdhm();
                String strOjitshcjhn2 = iobyxmoadgVar2.ojitshcjhn();
                String strDxjokdxxww2 = iobyxmoadgVar2.dxjokdxxww();
                String strEablkybsjg2 = iobyxmoadgVar2.eablkybsjg();
                String strWkgbmnqykc2 = iobyxmoadgVar2.vdvldrhtss().wkgbmnqykc();
                strWflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp();
                if (iobyxmoadgVar2.vdvldrhtss() == c52.pmvmpeiblj.ONLINE) {
                    str2 = strWflxmlrfwp;
                } else {
                    str2 = null;
                }
                strGtknphoqwx = iobyxmoadgVar2.gtknphoqwx();
                pmvmpeibljVarVdvldrhtss = iobyxmoadgVar2.vdvldrhtss();
                pmvmpeibljVar = c52.pmvmpeiblj.IN_STORE;
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
                c52.esjtqupxsv esjtqupxsvVar2 = new c52.esjtqupxsv(bannerId2, i15, strOxmwwwfdhm2, strOjitshcjhn2, strDxjokdxxww2, strEablkybsjg2, strWkgbmnqykc2, str2, str3, iobyxmoadgVar2.rgvfuqvkyq(), str4);
                ppxfxbqfkfVar = specialBannerViewModel2.f103926vdvldrhtss;
                iobyxmoadgVar4 = new e52.ppxfxbqfkf.iobyxmoadg(esjtqupxsvVar2);
                this.f104030zdlpuopuiu = null;
                this.f104029yggfygwlhe = null;
                this.f104028jyumaefscl = 2;
                if (ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar4, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            specialBannerViewModel = SpecialBannerViewModel.this;
            iobyxmoadgVar = this.f104026cqumvgiudr;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                specialBannerViewModel.m0(iobyxmoadgVar.getItemId());
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                specialBannerViewModel.l0(thDxjokdxxww);
            }
            SpecialBannerViewModel.this.A0(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ p62.ppxfxbqfkf f104031jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104033zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        vdvldrhtss(p62.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104031jyumaefscl = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new vdvldrhtss(this.f104031jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            String strWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104033zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    SpecialBannerViewModel.this.A0(true);
                    SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
                    p62.ppxfxbqfkf ppxfxbqfkfVar = this.f104031jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    p90.iobyxmoadg iobyxmoadgVar2 = specialBannerViewModel.f103937zdlpuopuiu;
                    p62.zoijcleaow zoijcleaowVarWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
                    if (zoijcleaowVarWkgbmnqykc == null || (strWkgbmnqykc = zoijcleaowVarWkgbmnqykc.wkgbmnqykc()) == null) {
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    int i14 = Integer.parseInt(strWkgbmnqykc);
                    y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt = specialBannerViewModel.kcexrzcfyt();
                    String strWkgbmnqykc2 = iobyxmoadgVarKcexrzcfyt != null ? iobyxmoadgVarKcexrzcfyt.wkgbmnqykc() : null;
                    if (strWkgbmnqykc2 == null) {
                        strWkgbmnqykc2 = "";
                    }
                    y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt2 = specialBannerViewModel.kcexrzcfyt();
                    p90.iobyxmoadg.C1679iobyxmoadg c1679iobyxmoadg = new p90.iobyxmoadg.C1679iobyxmoadg(i14, strWkgbmnqykc2, iobyxmoadgVarKcexrzcfyt2 != null ? iobyxmoadgVarKcexrzcfyt2.ppxfxbqfkf() : null);
                    this.f104033zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.invoke(c1679iobyxmoadg, this);
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
                specialBannerViewModel2.A0(false);
                specialBannerViewModel2.zdlpuopuiu(thDxjokdxxww);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            EvropolisGift evropolisGift = (EvropolisGift) objWkgbmnqykc;
            SpecialBannerViewModel.this.A0(false);
            SpecialBannerViewModel specialBannerViewModel3 = SpecialBannerViewModel.this;
            y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt3 = SpecialBannerViewModel.this.kcexrzcfyt();
            specialBannerViewModel3.yggfygwlhe(new uwvvkdfqfp.draadjrbmk(evropolisGift, iobyxmoadgVarKcexrzcfyt3 != null ? iobyxmoadgVarKcexrzcfyt3.ppxfxbqfkf() : null));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ o90.wkgbmnqykc f104034jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104036zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(o90.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104034jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new wflxmlrfwp(this.f104034jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007b  */
        /* JADX WARN: Code duplicated, block: B:28:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            SpecialBannerViewModel specialBannerViewModel;
            o90.wkgbmnqykc wkgbmnqykcVar;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104036zdlpuopuiu;
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
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((o90.zoijcleaow) obj);
                    specialBannerViewModel = SpecialBannerViewModel.this;
                    wkgbmnqykcVar = this.f104034jyumaefscl;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        specialBannerViewModel.D0(wkgbmnqykcVar, new o90.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf(false), (o90.zoijcleaow) objWkgbmnqykc);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        SpecialBannerViewModel.E0(specialBannerViewModel, wkgbmnqykcVar, o90.wkgbmnqykc.iobyxmoadg.C1565iobyxmoadg.f72364iobyxmoadg, null, 4, null);
                        specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.E0(SpecialBannerViewModel.this, this.f104034jyumaefscl, o90.wkgbmnqykc.iobyxmoadg.zoijcleaow.f72366iobyxmoadg, null, 4, null);
                z10.iobyxmoadg iobyxmoadgVar = SpecialBannerViewModel.this.f103923tzroggbefp;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f104036zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                y00.iobyxmoadg iobyxmoadgVar2 = (y00.iobyxmoadg) obj;
                SpecialBannerViewModel specialBannerViewModel2 = SpecialBannerViewModel.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                p90.zoijcleaow zoijcleaowVar = specialBannerViewModel2.f103902kcexrzcfyt;
                p90.zoijcleaow.iobyxmoadg iobyxmoadgVar4 = new p90.zoijcleaow.iobyxmoadg(iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf());
                this.f104036zdlpuopuiu = 2;
                obj = zoijcleaowVar.invoke(iobyxmoadgVar4, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((o90.zoijcleaow) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            specialBannerViewModel = SpecialBannerViewModel.this;
            wkgbmnqykcVar = this.f104034jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                specialBannerViewModel.D0(wkgbmnqykcVar, new o90.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf(false), (o90.zoijcleaow) objWkgbmnqykc);
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                SpecialBannerViewModel.E0(specialBannerViewModel, wkgbmnqykcVar, o90.wkgbmnqykc.iobyxmoadg.C1565iobyxmoadg.f72364iobyxmoadg, null, 4, null);
                specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
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
        final /* synthetic */ ComboSetProduct f104037iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f104038jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104040zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104038jyumaefscl = comboSetProduct;
            this.f104037iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return SpecialBannerViewModel.this.new wkgbmnqykc(this.f104038jyumaefscl, this.f104037iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objVdvldrhtss;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104040zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                SpecialBannerViewModel.this.A0(true);
                k00.iobyxmoadg iobyxmoadgVar = SpecialBannerViewModel.this.f103928wflxmlrfwp;
                ComboSetProduct comboSetProduct = this.f104038jyumaefscl;
                ComboSetProduct comboSetProduct2 = this.f104037iwizpuwonk;
                this.f104040zdlpuopuiu = 1;
                objVdvldrhtss = iobyxmoadgVar.vdvldrhtss(comboSetProduct, comboSetProduct2, this);
                if (objVdvldrhtss == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                objVdvldrhtss = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
            }
            SpecialBannerViewModel specialBannerViewModel = SpecialBannerViewModel.this;
            if (gg.kcexrzcfyt.agtfadlqog(objVdvldrhtss)) {
                specialBannerViewModel.t(((t00.iobyxmoadg) objVdvldrhtss).zoijcleaow());
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objVdvldrhtss);
            if (thDxjokdxxww != null) {
                specialBannerViewModel.zdlpuopuiu(thDxjokdxxww);
            }
            SpecialBannerViewModel.this.ppxfxbqfkf(null);
            SpecialBannerViewModel.this.A0(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f104042yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104043zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            yggfygwlhe yggfygwlheVar = SpecialBannerViewModel.this.new yggfygwlhe(gxszxtbevoVar);
            yggfygwlheVar.f104042yggfygwlhe = obj;
            return yggfygwlheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f104043zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            j00.zoijcleaow.iobyxmoadg iobyxmoadgVar = (j00.zoijcleaow.iobyxmoadg) this.f104042yggfygwlhe;
            SpecialBannerViewModel.this.jrbgnlbqoe(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((yggfygwlhe) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class zdlpuopuiu extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        zdlpuopuiu(Object obj) {
            super(2, obj, d60.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((d60.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final c52.istkbnxepw f104044iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final User f104045ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f104046wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f104047zoijcleaow;

        public zoijcleaow(c52.istkbnxepw banner, Map boundedBoxes, User user, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(boundedBoxes, "boundedBoxes");
            this.f104044iobyxmoadg = banner;
            this.f104047zoijcleaow = boundedBoxes;
            this.f104045ppxfxbqfkf = user;
            this.f104046wkgbmnqykc = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104044iobyxmoadg, zoijcleaowVar.f104044iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104047zoijcleaow, zoijcleaowVar.f104047zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104045ppxfxbqfkf, zoijcleaowVar.f104045ppxfxbqfkf) && this.f104046wkgbmnqykc == zoijcleaowVar.f104046wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((this.f104044iobyxmoadg.hashCode() * 31) + this.f104047zoijcleaow.hashCode()) * 31;
            User user = this.f104045ppxfxbqfkf;
            return ((iHashCode + (user == null ? 0 : user.hashCode())) * 31) + Boolean.hashCode(this.f104046wkgbmnqykc);
        }

        public final c52.istkbnxepw iobyxmoadg() {
            return this.f104044iobyxmoadg;
        }

        public final User ppxfxbqfkf() {
            return this.f104045ppxfxbqfkf;
        }

        public String toString() {
            return "PendingBannerData(banner=" + this.f104044iobyxmoadg + ", boundedBoxes=" + this.f104047zoijcleaow + ", user=" + this.f104045ppxfxbqfkf + ", isRegistrationFormEnabled=" + this.f104046wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f104046wkgbmnqykc;
        }

        public final Map zoijcleaow() {
            return this.f104047zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialBannerViewModel(nz1.iobyxmoadg getDefaultFeedbackPhoneUseCase, t20.zoijcleaow getIqosAgreementsStatusUseCase, a20.iobyxmoadg changeAdultCheckedUseCase, a20.zoijcleaow isAdultCheckedUseCase, c20.eablkybsjg isLoggedInUseCase, k00.iobyxmoadg cartInteractor, c20.dxjokdxxww subscribeToLoggedInUseCase, f20.ppxfxbqfkf clearCartUseCase, xrmfcynszj specialBannerUiMapper, e52.ppxfxbqfkf sendSpecialBannerFormUseCase, oa0.agtfadlqog isRegistrationFormEnabledUseCase, p90.zoijcleaow evropolisRedeemUseCase, p90.iobyxmoadg evropolisGiftUseCase, q20.zoijcleaow tryEncodeUriToBase64UseCase, q20.iobyxmoadg getFileNameFromUriUseCase, e52.zoijcleaow getFileSizeFromUriUseCase, SpecialBannerPayload payload, l00.gtknphoqwx productChangesSourceProvider, a72.iobyxmoadg updateSpecialBannersByCartDataUseCase, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, d60.iobyxmoadg resourcesManager, qm.iobyxmoadg addressFeatureApi, sa2.iobyxmoadg videoPlayerFeatureApi, ro.iobyxmoadg authFeatureApi, sm.iobyxmoadg getUserAddressFlowInfo, lq.iobyxmoadg catalogFeatureApi, fx1.iobyxmoadg promoCollectionFeatureApi, yy1.iobyxmoadg purchasesListComponentApi, pe0.iobyxmoadg loyaltyProgramFeatureApi, ya2.iobyxmoadg webViewScreenFeatureApi, kz1.iobyxmoadg feedbackFeatureApi, jw.iobyxmoadg promoCollectionComponentApi, androidx.lifecycle.pkzmftpjix savedStateHandle, lo.zoijcleaow analyticsTracker, CreatePurchaseListsResultHelper resultHelper, d52.iobyxmoadg specialBannerRepository, j00.zoijcleaow changeFavoritesInteractor, z10.iobyxmoadg getCurrentDeliveryDataUseCase) {
        super(new czzsidtyhn(null, null, null, null, false, null, false, 127, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIqosAgreementsStatusUseCase, "getIqosAgreementsStatusUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerUiMapper, "specialBannerUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sendSpecialBannerFormUseCase, "sendSpecialBannerFormUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isRegistrationFormEnabledUseCase, "isRegistrationFormEnabledUseCase");
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
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(videoPlayerFeatureApi, "videoPlayerFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
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
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        this.f103906lqeggnwhkg = new sx.ppxfxbqfkf();
        this.f103910nufgyqmvbu = getDefaultFeedbackPhoneUseCase;
        this.f103888dxjokdxxww = getIqosAgreementsStatusUseCase;
        this.f103880btonecajqb = changeAdultCheckedUseCase;
        this.f103890gtknphoqwx = isAdultCheckedUseCase;
        this.f103886draadjrbmk = isLoggedInUseCase;
        this.f103928wflxmlrfwp = cartInteractor;
        this.f103879agtfadlqog = subscribeToLoggedInUseCase;
        this.f103912ojitshcjhn = clearCartUseCase;
        this.f103917rgvfuqvkyq = specialBannerUiMapper;
        this.f103926vdvldrhtss = sendSpecialBannerFormUseCase;
        this.f103914oxmwwwfdhm = isRegistrationFormEnabledUseCase;
        this.f103902kcexrzcfyt = evropolisRedeemUseCase;
        this.f103937zdlpuopuiu = evropolisGiftUseCase;
        this.f103935yggfygwlhe = tryEncodeUriToBase64UseCase;
        this.f103900jyumaefscl = getFileNameFromUriUseCase;
        this.f103896iwizpuwonk = getFileSizeFromUriUseCase;
        this.f103883cqumvgiudr = payload;
        this.f103889esjtqupxsv = productChangesSourceProvider;
        this.f103904lereixgezr = updateSpecialBannersByCartDataUseCase;
        this.f103916pmvmpeiblj = subscribeToCurrentDeliveryDataUseCase;
        this.f103939zynmafqrjb = resourcesManager;
        this.f103895istkbnxepw = addressFeatureApi;
        this.f103881cdpycssgdh = videoPlayerFeatureApi;
        this.f103932yadqdtsiqt = authFeatureApi;
        this.f103894iozdgvuglv = getUserAddressFlowInfo;
        this.f103905lmojexxdyd = catalogFeatureApi;
        this.f103929wwaezpbzkn = promoCollectionFeatureApi;
        this.f103936ylkuphrtab = purchasesListComponentApi;
        this.f103915pkzmftpjix = loyaltyProgramFeatureApi;
        this.f103891hcddaimhww = webViewScreenFeatureApi;
        this.f103899jpowsppfya = feedbackFeatureApi;
        this.f103892hkdspvbjdz = promoCollectionComponentApi;
        this.f103882cllcsxoeiz = savedStateHandle;
        this.f103887dsvhmnatus = analyticsTracker;
        this.f103930wypolnanlu = resultHelper;
        this.f103922stevsuqkhv = specialBannerRepository;
        this.f103903kegysxyocb = changeFavoritesInteractor;
        this.f103923tzroggbefp = getCurrentDeliveryDataUseCase;
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(calendar, "getInstance(...)");
        this.f103898jlmebxxoox = calendar;
        this.f103927vipkmwdibw = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.oipsdeybqn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerViewModel.L0();
            }
        });
        this.f103897jhduphickx = ((Boolean) isAdultCheckedUseCase.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        this.f103919rlfsiqarku = true;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        this.f103925uwvvkdfqfp = string;
        this.f103934yfnezrywwk = f();
        this.f103938zfvoamnweg = hg.jyumaefscl.wflxmlrfwp();
        this.f103911oipsdeybqn = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.bfopjjpdmp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerViewModel.s0(this.f104049zdlpuopuiu);
            }
        });
        u();
        G0();
        F0();
        H0();
    }

    private final void A(String str, z52.zoijcleaow zoijcleaowVar) {
        NavigationPayload navigationPayloadWkgbmnqykc = l62.iobyxmoadg.wkgbmnqykc(zoijcleaowVar);
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : null, (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : new AnalyticsPayload(mhtqkkgtqm(), new AnalyticsLocation.BannerFeed(str, null, 2, null), new AnalyticElement.BannerItemElement(String.valueOf(zoijcleaowVar.gxszxtbevo()), String.valueOf(zoijcleaowVar.wkgbmnqykc()))), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(boolean z13) {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow((czzsidtyhn) value, null, null, null, null, false, null, z13, 63, null)));
    }

    private final void B(b62.zoijcleaow zoijcleaowVar) {
        Object value;
        if (zoijcleaowVar instanceof b62.zoijcleaow.iobyxmoadg) {
            NavigationPayload navigationPayloadIobyxmoadg = l62.iobyxmoadg.iobyxmoadg(((b62.zoijcleaow.iobyxmoadg) zoijcleaowVar).lqeggnwhkg());
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadIobyxmoadg.zoijcleaow((191 & 1) != 0 ? navigationPayloadIobyxmoadg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadIobyxmoadg.reference : null, (191 & 4) != 0 ? navigationPayloadIobyxmoadg.title : null, (191 & 8) != 0 ? navigationPayloadIobyxmoadg.message : null, (191 & 16) != 0 ? navigationPayloadIobyxmoadg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadIobyxmoadg.deepLink : null, (191 & 64) != 0 ? navigationPayloadIobyxmoadg.analyticsPayload : new AnalyticsPayload(mhtqkkgtqm(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadIobyxmoadg.isPushPayload : false));
        } else if (zoijcleaowVar instanceof b62.zoijcleaow.C0261zoijcleaow) {
            NavigationPayload navigationPayloadIobyxmoadg2 = l62.iobyxmoadg.iobyxmoadg(((b62.zoijcleaow.C0261zoijcleaow) zoijcleaowVar).lqeggnwhkg());
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadIobyxmoadg2.zoijcleaow((191 & 1) != 0 ? navigationPayloadIobyxmoadg2.navigationLink : null, (191 & 2) != 0 ? navigationPayloadIobyxmoadg2.reference : null, (191 & 4) != 0 ? navigationPayloadIobyxmoadg2.title : null, (191 & 8) != 0 ? navigationPayloadIobyxmoadg2.message : null, (191 & 16) != 0 ? navigationPayloadIobyxmoadg2.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadIobyxmoadg2.deepLink : null, (191 & 64) != 0 ? navigationPayloadIobyxmoadg2.analyticsPayload : new AnalyticsPayload(mhtqkkgtqm(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadIobyxmoadg2.isPushPayload : false));
        } else {
            if (!(zoijcleaowVar instanceof b62.zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((b62.zoijcleaow.ppxfxbqfkf) zoijcleaowVar).draadjrbmk()) {
                return;
            }
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow((czzsidtyhn) value, null, null, null, null, false, D(((czzsidtyhn) gtknphoqwx()).eablkybsjg(), zoijcleaowVar, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.iyctptxqzt
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return SpecialBannerViewModel.C((b62.zoijcleaow.ppxfxbqfkf) obj);
                }
            }), false, 95, null)));
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new draadjrbmk(zoijcleaowVar, null), 3, null);
        }
    }

    private final void B0(PromoCollectionItem promoCollectionItem) {
        yggfygwlhe(new uwvvkdfqfp.kcexrzcfyt(promoCollectionItem.getCurrentStatus().getName(), promoCollectionItem.getDescription(), promoCollectionItem.getCurrentStatus().getImageUrl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b62.zoijcleaow C(b62.zoijcleaow.ppxfxbqfkf button) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(button, "button");
        return b62.zoijcleaow.ppxfxbqfkf.nufgyqmvbu(button, null, null, null, false, true, null, null, 111, null);
    }

    private final void C0(QrCodeArgs qrCodeArgs) {
        yggfygwlhe(new uwvvkdfqfp.oxmwwwfdhm(qrCodeArgs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D(List list, b62.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar) {
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o00.iobyxmoadg iobyxmoadgVar = (o00.iobyxmoadg) it.next();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.getItemId(), iobyxmoadgVar.getItemId()) && (iobyxmoadgVar instanceof b62.zoijcleaow.ppxfxbqfkf)) {
                iobyxmoadgVar = (o00.iobyxmoadg) draadjrbmkVar.invoke(iobyxmoadgVar);
            }
            arrayList.add(iobyxmoadgVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    public final void D0(o90.wkgbmnqykc wkgbmnqykcVar, o90.wkgbmnqykc.iobyxmoadg iobyxmoadgVar, o90.zoijcleaow zoijcleaowVar) {
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        o90.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        o00.iobyxmoadg iobyxmoadgVar2;
        Object next;
        o00.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        Object next2;
        if (zoijcleaowVar != null) {
            wkgbmnqykcVarIobyxmoadg = wkgbmnqykcVar.iobyxmoadg((759 & 1) != 0 ? wkgbmnqykcVar.f72362zdlpuopuiu : null, (759 & 2) != 0 ? wkgbmnqykcVar.f72361yggfygwlhe : null, (759 & 4) != 0 ? wkgbmnqykcVar.f72357jyumaefscl : null, (759 & 8) != 0 ? wkgbmnqykcVar.f72356iwizpuwonk : zoijcleaowVar.wkgbmnqykc(), (759 & 16) != 0 ? wkgbmnqykcVar.f72353cqumvgiudr : null, (759 & 32) != 0 ? wkgbmnqykcVar.f72354esjtqupxsv : null, (759 & 64) != 0 ? wkgbmnqykcVar.f72358lereixgezr : null, (759 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? wkgbmnqykcVar.f72359pmvmpeiblj : null, (759 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? wkgbmnqykcVar.f72363zynmafqrjb : zoijcleaowVar.ppxfxbqfkf(), (759 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? wkgbmnqykcVar.f72355istkbnxepw : false, (759 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? wkgbmnqykcVar.f72352cdpycssgdh : iobyxmoadgVar);
            wkgbmnqykcVarIobyxmoadg.oxmwwwfdhm(zoijcleaowVar.iobyxmoadg());
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, o90.wkgbmnqykc.iobyxmoadg.C1565iobyxmoadg.f72364iobyxmoadg)) {
                o90.ppxfxbqfkf ppxfxbqfkfVar = (o90.ppxfxbqfkf) hg.jyumaefscl.weqkydbzbr(wkgbmnqykcVar.wflxmlrfwp());
                vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(ppxfxbqfkfVar != null ? ppxfxbqfkfVar.iobyxmoadg() : null, Boolean.valueOf(!wkgbmnqykcVar.wflxmlrfwp().isEmpty()));
            } else {
                vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(wkgbmnqykcVar.draadjrbmk(), Boolean.valueOf(wkgbmnqykcVar.vdvldrhtss()));
            }
            wkgbmnqykcVarIobyxmoadg = wkgbmnqykcVar.iobyxmoadg((759 & 1) != 0 ? wkgbmnqykcVar.f72362zdlpuopuiu : null, (759 & 2) != 0 ? wkgbmnqykcVar.f72361yggfygwlhe : null, (759 & 4) != 0 ? wkgbmnqykcVar.f72357jyumaefscl : null, (759 & 8) != 0 ? wkgbmnqykcVar.f72356iwizpuwonk : null, (759 & 16) != 0 ? wkgbmnqykcVar.f72353cqumvgiudr : null, (759 & 32) != 0 ? wkgbmnqykcVar.f72354esjtqupxsv : null, (759 & 64) != 0 ? wkgbmnqykcVar.f72358lereixgezr : null, (759 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? wkgbmnqykcVar.f72359pmvmpeiblj : (String) vdvldrhtssVarIobyxmoadg.iobyxmoadg(), (759 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? wkgbmnqykcVar.f72363zynmafqrjb : null, (759 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? wkgbmnqykcVar.f72355istkbnxepw : ((Boolean) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).booleanValue(), (759 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? wkgbmnqykcVar.f72352cdpycssgdh : iobyxmoadgVar);
        }
        if (zoijcleaowVar == null) {
            iobyxmoadgVar2 = null;
        } else {
            List listEablkybsjg = ((czzsidtyhn) gtknphoqwx()).eablkybsjg();
            if (listEablkybsjg == null || !listEablkybsjg.isEmpty()) {
                Iterator it = listEablkybsjg.iterator();
                while (true) {
                    if (it.hasNext()) {
                        o00.iobyxmoadg iobyxmoadgVar3 = (o00.iobyxmoadg) it.next();
                        if (((iobyxmoadgVar3 instanceof p62.iobyxmoadg) && (zoijcleaowVar.zoijcleaow() instanceof p62.iobyxmoadg)) || ((iobyxmoadgVar3 instanceof p62.wkgbmnqykc) && (zoijcleaowVar.zoijcleaow() instanceof p62.wkgbmnqykc))) {
                            if (!zoijcleaowVar.ppxfxbqfkf().isEmpty()) {
                                if (zoijcleaowVar.zoijcleaow() instanceof p62.iobyxmoadg) {
                                    Iterator it2 = ((czzsidtyhn) gtknphoqwx()).eablkybsjg().iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it2.next();
                                    } while (!(next2 instanceof p62.iobyxmoadg));
                                    if (next2 != null) {
                                        o00.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaowVar.zoijcleaow();
                                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarZoijcleaow, "null cannot be cast to non-null type ru.myspar.specialbanner.impl.presentation.models.productspromotion.HorizontalPromoSpecialBannerUiModel");
                                        iobyxmoadgVarWkgbmnqykc = p62.iobyxmoadg.wkgbmnqykc((p62.iobyxmoadg) next2, null, ((p62.iobyxmoadg) iobyxmoadgVarZoijcleaow).eablkybsjg(), 1, null);
                                    } else {
                                        iobyxmoadgVarWkgbmnqykc = null;
                                    }
                                } else {
                                    if (zoijcleaowVar.zoijcleaow() instanceof p62.wkgbmnqykc) {
                                        Iterator it3 = ((czzsidtyhn) gtknphoqwx()).eablkybsjg().iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it3.next();
                                        } while (!(next instanceof p62.wkgbmnqykc));
                                        if (next != null) {
                                            o00.iobyxmoadg iobyxmoadgVarZoijcleaow2 = zoijcleaowVar.zoijcleaow();
                                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarZoijcleaow2, "null cannot be cast to non-null type ru.myspar.specialbanner.impl.presentation.models.productspromotion.VerticalPromoSpecialBannerUiModel");
                                            iobyxmoadgVarWkgbmnqykc = p62.wkgbmnqykc.wkgbmnqykc((p62.wkgbmnqykc) next, null, ((p62.wkgbmnqykc) iobyxmoadgVarZoijcleaow2).eablkybsjg(), 1, null);
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
            this.f103908metgxyhuhe = true;
            iobyxmoadgVar2 = null;
        }
        List<o00.iobyxmoadg> listEablkybsjg2 = ((czzsidtyhn) gtknphoqwx()).eablkybsjg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg2, 10));
        for (o00.iobyxmoadg iobyxmoadgVar4 : listEablkybsjg2) {
            boolean z13 = false;
            boolean z14 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar4.getItemId(), wkgbmnqykcVarIobyxmoadg.getItemId()) && (iobyxmoadgVar4 instanceof o90.wkgbmnqykc);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar4.getItemId(), iobyxmoadgVar2 != null ? iobyxmoadgVar2.getItemId() : null) && (iobyxmoadgVar4 instanceof p62.iobyxmoadg)) {
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
            if (zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow((czzsidtyhn) value, null, null, null, null, false, arrayList, false, 95, null))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    private final void E() {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.dxjokdxxww((String) this.f103910nufgyqmvbu.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)));
    }

    static /* synthetic */ void E0(SpecialBannerViewModel specialBannerViewModel, o90.wkgbmnqykc wkgbmnqykcVar, o90.wkgbmnqykc.iobyxmoadg iobyxmoadgVar, o90.zoijcleaow zoijcleaowVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            zoijcleaowVar = null;
        }
        specialBannerViewModel.D0(wkgbmnqykcVar, iobyxmoadgVar, zoijcleaowVar);
    }

    private final void F(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        if (((Boolean) eablkybsjg().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            ipoelvxyzq(comboSetProduct, comboSetProduct2);
        } else {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103932yadqdtsiqt.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
        }
    }

    private final void F0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f103903kegysxyocb.dxjokdxxww(), new yggfygwlhe(null)), new jyumaefscl(null)), agtfadlqog());
    }

    private final void G0() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new iwizpuwonk(null), 3, null);
    }

    private final void H(e62.zoijcleaow zoijcleaowVar) {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.jyumaefscl(zoijcleaowVar.lqeggnwhkg()));
    }

    private final void H0() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new cqumvgiudr(null), 3, null);
    }

    private final void I0(String str) {
        auzgnhcxok auzgnhcxokVar = this.f103913okpsazkaxt;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f103913okpsazkaxt = pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new esjtqupxsv(str, null), 3, null);
    }

    private final void J(o90.wkgbmnqykc wkgbmnqykcVar) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wflxmlrfwp(wkgbmnqykcVar, null), 3, null);
    }

    private final void J0(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f103887dsvhmnatus.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.LandingPage(((czzsidtyhn) gtknphoqwx()).lqeggnwhkg(), ((czzsidtyhn) gtknphoqwx()).wkgbmnqykc()), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    private final void K(o90.wkgbmnqykc wkgbmnqykcVar) {
        o90.iobyxmoadg iobyxmoadgVarLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
        if (iobyxmoadgVarLqeggnwhkg != null) {
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(iobyxmoadgVarLqeggnwhkg.iobyxmoadg(), iobyxmoadgVarLqeggnwhkg.zoijcleaow(), null, null, false, null, new AnalyticsPayload(mhtqkkgtqm(), null, null, 6, null), false, 184, null));
        }
    }

    static /* synthetic */ void K0(SpecialBannerViewModel specialBannerViewModel, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        specialBannerViewModel.J0(analyticsPage, analyticElement, analyticsLocation);
    }

    private final void L(o90.wkgbmnqykc wkgbmnqykcVar) {
        EvropolisGift evropolisGiftDxjokdxxww = wkgbmnqykcVar.dxjokdxxww();
        if (evropolisGiftDxjokdxxww != null) {
            y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt = kcexrzcfyt();
            yggfygwlhe(new uwvvkdfqfp.draadjrbmk(evropolisGiftDxjokdxxww, iobyxmoadgVarKcexrzcfyt != null ? iobyxmoadgVarKcexrzcfyt.ppxfxbqfkf() : null));
            E0(this, wkgbmnqykcVar, o90.wkgbmnqykc.iobyxmoadg.C1565iobyxmoadg.f72364iobyxmoadg, null, 4, null);
            if (this.f103908metgxyhuhe) {
                c();
                this.f103908metgxyhuhe = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat L0() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault());
    }

    private final void M() {
        c();
    }

    private final void M0(ProductUiModel productUiModel, boolean z13, String str, boolean z14) {
        Object value;
        czzsidtyhn czzsidtyhnVar;
        ArrayList arrayList;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            czzsidtyhnVar = (czzsidtyhn) value;
            List<w30.ppxfxbqfkf> listEablkybsjg = czzsidtyhnVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (w30.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg : listEablkybsjg) {
                if (ppxfxbqfkfVarIobyxmoadg instanceof o62.iobyxmoadg) {
                    o62.iobyxmoadg iobyxmoadgVar = (o62.iobyxmoadg) ppxfxbqfkfVarIobyxmoadg;
                    List listDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
                    CounterModel counterModel = productUiModel.getCounterModel();
                    ppxfxbqfkfVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg((191 & 1) != 0 ? iobyxmoadgVar.f72186zdlpuopuiu : null, (191 & 2) != 0 ? iobyxmoadgVar.f72185yggfygwlhe : null, (191 & 4) != 0 ? iobyxmoadgVar.f72182jyumaefscl : null, (191 & 8) != 0 ? iobyxmoadgVar.f72181iwizpuwonk : null, (191 & 16) != 0 ? iobyxmoadgVar.f72179cqumvgiudr : null, (191 & 32) != 0 ? iobyxmoadgVar.f72180esjtqupxsv : null, (191 & 64) != 0 ? iobyxmoadgVar.f72183lereixgezr : qs.eablkybsjg.dxjokdxxww(listDxjokdxxww, productUiModel, productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : z13, (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (10235 & 2048) != 0 ? counterModel.message : str, (10235 & 4096) != 0 ? counterModel.autoHideMessage : z14, (10235 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null)), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f72184pmvmpeiblj : null);
                }
                arrayList.add(ppxfxbqfkfVarIobyxmoadg);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow(czzsidtyhnVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final void N(ProductUiModel productUiModel, AnalyticsLocation.ItemFeed itemFeed) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new agtfadlqog(itemFeed, productUiModel, null), 3, null);
    }

    static /* synthetic */ void N0(SpecialBannerViewModel specialBannerViewModel, ProductUiModel productUiModel, boolean z13, String str, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        specialBannerViewModel.M0(productUiModel, z13, str, z14);
    }

    private final void O(String str) {
        if (((Boolean) eablkybsjg().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103899jpowsppfya.iobyxmoadg(new FeedbackArgs(str)));
        } else {
            yggfygwlhe(uwvvkdfqfp.eablkybsjg.f104175iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(String str, List list) {
        Object value;
        czzsidtyhn czzsidtyhnVar;
        ArrayList arrayList;
        z62.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            czzsidtyhnVar = (czzsidtyhn) value;
            List<o00.iobyxmoadg> listEablkybsjg = czzsidtyhnVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (o00.iobyxmoadg iobyxmoadgVar : listEablkybsjg) {
                z62.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof z62.iobyxmoadg ? (z62.iobyxmoadg) iobyxmoadgVar : null;
                if (iobyxmoadgVar2 != null) {
                    z62.iobyxmoadg iobyxmoadgVar3 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.eablkybsjg(), str) ? iobyxmoadgVar2 : null;
                    if (iobyxmoadgVar3 != null && (iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((247 & 1) != 0 ? iobyxmoadgVar3.f129238zdlpuopuiu : null, (247 & 2) != 0 ? iobyxmoadgVar3.f129237yggfygwlhe : null, (247 & 4) != 0 ? iobyxmoadgVar3.f129234jyumaefscl : null, (247 & 8) != 0 ? iobyxmoadgVar3.f129233iwizpuwonk : list, (247 & 16) != 0 ? iobyxmoadgVar3.f129231cqumvgiudr : null, (247 & 32) != 0 ? iobyxmoadgVar3.f129232esjtqupxsv : false, (247 & 64) != 0 ? iobyxmoadgVar3.f129235lereixgezr : false, (247 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f129236pmvmpeiblj : false)) != null) {
                        iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
                    }
                }
                arrayList.add(iobyxmoadgVar);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow(czzsidtyhnVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final auzgnhcxok P(String str) {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ojitshcjhn(str, null), 3, null);
    }

    private final void P0(String str) {
        a(str, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.zfvoamnweg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerViewModel.Q0(this.f104279zdlpuopuiu, (f62.iobyxmoadg) obj);
            }
        });
    }

    private final void Q(String str, final RegistrationFormView.zoijcleaow zoijcleaowVar) {
        a(str, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.sflfametgt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerViewModel.R(zoijcleaowVar, (f62.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f62.iobyxmoadg Q0(SpecialBannerViewModel specialBannerViewModel, f62.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        f62.iobyxmoadg iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : null, (4095 & 8) != 0 ? form.f33015iwizpuwonk : null, (4095 & 16) != 0 ? form.f33011cqumvgiudr : null, (4095 & 32) != 0 ? form.f33012esjtqupxsv : null, (4095 & 64) != 0 ? form.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f33013iozdgvuglv : specialBannerViewModel.f103918ribwqtqdhb);
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f33020yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f33016jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f33015iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f33011cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f33012esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f33014istkbnxepw : iobyxmoadgVarIobyxmoadg.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f33013iozdgvuglv : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f62.iobyxmoadg R(RegistrationFormView.zoijcleaow zoijcleaowVar, f62.iobyxmoadg form) {
        f62.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.ppxfxbqfkf) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : ((RegistrationFormView.zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg(), (4095 & 8) != 0 ? form.f33015iwizpuwonk : null, (4095 & 16) != 0 ? form.f33011cqumvgiudr : null, (4095 & 32) != 0 ? form.f33012esjtqupxsv : null, (4095 & 64) != 0 ? form.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f33013iozdgvuglv : null);
        } else if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.gxszxtbevo) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : null, (4095 & 8) != 0 ? form.f33015iwizpuwonk : ((RegistrationFormView.zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg(), (4095 & 16) != 0 ? form.f33011cqumvgiudr : null, (4095 & 32) != 0 ? form.f33012esjtqupxsv : null, (4095 & 64) != 0 ? form.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f33013iozdgvuglv : null);
        } else if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.C2519zoijcleaow) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : null, (4095 & 8) != 0 ? form.f33015iwizpuwonk : null, (4095 & 16) != 0 ? form.f33011cqumvgiudr : ((RegistrationFormView.zoijcleaow.C2519zoijcleaow) zoijcleaowVar).iobyxmoadg(), (4095 & 32) != 0 ? form.f33012esjtqupxsv : null, (4095 & 64) != 0 ? form.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f33013iozdgvuglv : null);
        } else if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.iobyxmoadg) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : null, (4095 & 8) != 0 ? form.f33015iwizpuwonk : null, (4095 & 16) != 0 ? form.f33011cqumvgiudr : null, (4095 & 32) != 0 ? form.f33012esjtqupxsv : ((RegistrationFormView.zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg(), (4095 & 64) != 0 ? form.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f33013iozdgvuglv : null);
        } else if (zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.eablkybsjg) {
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : null, (4095 & 8) != 0 ? form.f33015iwizpuwonk : null, (4095 & 16) != 0 ? form.f33011cqumvgiudr : null, (4095 & 32) != 0 ? form.f33012esjtqupxsv : null, (4095 & 64) != 0 ? form.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : ((RegistrationFormView.zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg(), (4095 & 4096) != 0 ? form.f33013iozdgvuglv : null);
        } else {
            if (!(zoijcleaowVar instanceof RegistrationFormView.zoijcleaow.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : null, (4095 & 8) != 0 ? form.f33015iwizpuwonk : null, (4095 & 16) != 0 ? form.f33011cqumvgiudr : null, (4095 & 32) != 0 ? form.f33012esjtqupxsv : null, (4095 & 64) != 0 ? form.f33017lereixgezr : ((RegistrationFormView.zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg(), (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f33013iozdgvuglv : null);
        }
        f62.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
        return iobyxmoadgVar.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVar.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVar.f33020yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVar.f33016jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVar.f33015iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVar.f33011cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVar.f33012esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVar.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar.f33014istkbnxepw : iobyxmoadgVar.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVar.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVar.f33013iozdgvuglv : null);
    }

    private final void S(HintUiModel hintUiModel, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        yggfygwlhe(new uwvvkdfqfp.rgvfuqvkyq(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.LandingPage(((czzsidtyhn) gtknphoqwx()).lqeggnwhkg(), ((czzsidtyhn) gtknphoqwx()).wkgbmnqykc()), analyticsLocation)));
    }

    private final void T(z52.draadjrbmk draadjrbmkVar) {
        NavigationPayload navigationPayloadEablkybsjg = l62.iobyxmoadg.eablkybsjg(draadjrbmkVar);
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadEablkybsjg.zoijcleaow((191 & 1) != 0 ? navigationPayloadEablkybsjg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadEablkybsjg.reference : null, (191 & 4) != 0 ? navigationPayloadEablkybsjg.title : null, (191 & 8) != 0 ? navigationPayloadEablkybsjg.message : null, (191 & 16) != 0 ? navigationPayloadEablkybsjg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadEablkybsjg.deepLink : null, (191 & 64) != 0 ? navigationPayloadEablkybsjg.analyticsPayload : new AnalyticsPayload(mhtqkkgtqm(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadEablkybsjg.isPushPayload : false));
    }

    private final void U(ProductUiModel productUiModel, ProductCardEvent productCardEvent, AnalyticsLocation.ItemFeed itemFeed) {
        Object next;
        List limits;
        List listIobyxmoadg;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                ProductCardEvent.CounterInternal.ShowMessage showMessage = (ProductCardEvent.CounterInternal.ShowMessage) productCardEvent;
                M0(productUiModel, true, showMessage.getMessage(), showMessage.getAutoHide());
                return;
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                N0(this, productUiModel, false, null, false, 12, null);
                return;
            }
        }
        m00.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(new AnalyticsPage.LandingPage(((czzsidtyhn) gtknphoqwx()).lqeggnwhkg(), ((czzsidtyhn) gtknphoqwx()).wkgbmnqykc()), itemFeed, productUiModel.getName());
        Iterator it = this.f103938zfvoamnweg.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), productUiModel.getId()));
        ProductUIData productUIData = (ProductUIData) next;
        rhgxfdycjh(new ChangeProductParams(productUiModel.getId(), productUiModel.getArticle(), zoijcleaowVarIobyxmoadg, productUiModel.getAvailabilityModel().getIsAvailableToBuy(), productUiModel.getIsPmProduct(), productUiModel.getAvailabilityModel().getAvailableOnlyForPickup(), productUiModel.getMeasureTypeModel(), productUiModel.getAvgWeight(), (productUIData == null || (limits = productUIData.getLimits()) == null || (listIobyxmoadg = k30.zoijcleaow.iobyxmoadg(limits)) == null) ? productUiModel.getLimits() : listIobyxmoadg, changeProductAnalyticParams));
    }

    private final void V(ProductUiModel productUiModel, AnalyticsLocation.ItemFeed itemFeed) {
        J0(new AnalyticsPage.ItemDetail(productUiModel.getArticle(), productUiModel.getName()), new AnalyticElement.ProductItemElement(productUiModel.getArticle(), productUiModel.getName()), itemFeed);
        d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f103905lmojexxdyd.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(productUiModel.getId()), null, 2, null)));
    }

    private final void W(o62.iobyxmoadg iobyxmoadgVar) {
        NavigationPayload navigationPayloadZoijcleaow = l62.iobyxmoadg.zoijcleaow(iobyxmoadgVar);
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadZoijcleaow.zoijcleaow((191 & 1) != 0 ? navigationPayloadZoijcleaow.navigationLink : null, (191 & 2) != 0 ? navigationPayloadZoijcleaow.reference : null, (191 & 4) != 0 ? navigationPayloadZoijcleaow.title : null, (191 & 8) != 0 ? navigationPayloadZoijcleaow.message : null, (191 & 16) != 0 ? navigationPayloadZoijcleaow.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadZoijcleaow.deepLink : null, (191 & 64) != 0 ? navigationPayloadZoijcleaow.analyticsPayload : new AnalyticsPayload(mhtqkkgtqm(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadZoijcleaow.isPushPayload : false));
    }

    private final void X(String str, q62.iobyxmoadg iobyxmoadgVar) {
        Object value;
        List<w30.ppxfxbqfkf> listEablkybsjg = ((czzsidtyhn) gtknphoqwx()).eablkybsjg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
        for (w30.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc : listEablkybsjg) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarWkgbmnqykc.getItemId(), str) && (ppxfxbqfkfVarWkgbmnqykc instanceof q62.ppxfxbqfkf)) {
                q62.ppxfxbqfkf ppxfxbqfkfVar = (q62.ppxfxbqfkf) ppxfxbqfkfVarWkgbmnqykc;
                List listWkgbmnqykc = ppxfxbqfkfVar.eablkybsjg().wkgbmnqykc();
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
                Iterator it = listWkgbmnqykc.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ezmngbhpjk((q62.iobyxmoadg) it.next(), iobyxmoadgVar.getItemId()));
                }
                ppxfxbqfkfVarWkgbmnqykc = q62.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, null, q62.zoijcleaow.zoijcleaow(ppxfxbqfkfVar.eablkybsjg(), arrayList2, null, false, 6, null), 1, null);
            }
            arrayList.add(ppxfxbqfkfVarWkgbmnqykc);
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow((czzsidtyhn) value, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final void Y(Point point) {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.gtknphoqwx(point.getLatitude(), point.getLongitude()));
    }

    private final void Z(f62.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new rgvfuqvkyq(iobyxmoadgVar, null), 3, null);
    }

    private final void a(String str, tg.draadjrbmk draadjrbmkVar) {
        Object value;
        List<o00.iobyxmoadg> listEablkybsjg = ((czzsidtyhn) gtknphoqwx()).eablkybsjg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
        for (o00.iobyxmoadg iobyxmoadgVar : listEablkybsjg) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.getItemId(), str) && (iobyxmoadgVar instanceof f62.iobyxmoadg)) {
                iobyxmoadgVar = (o00.iobyxmoadg) draadjrbmkVar.invoke(iobyxmoadgVar);
            }
            arrayList.add(iobyxmoadgVar);
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow((czzsidtyhn) value, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final void a0(k62.ppxfxbqfkf ppxfxbqfkfVar) {
        yggfygwlhe(new uwvvkdfqfp.yggfygwlhe(ppxfxbqfkfVar));
    }

    private final z62.iobyxmoadg b(String str) {
        z62.iobyxmoadg iobyxmoadgVar;
        Iterator it = ((czzsidtyhn) getState().getValue()).eablkybsjg().iterator();
        while (true) {
            iobyxmoadgVar = null;
            if (!it.hasNext()) {
                break;
            }
            o00.iobyxmoadg iobyxmoadgVar2 = (o00.iobyxmoadg) it.next();
            z62.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar2 instanceof z62.iobyxmoadg ? (z62.iobyxmoadg) iobyxmoadgVar2 : null;
            if (iobyxmoadgVar3 != null) {
                iobyxmoadgVar = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar3.eablkybsjg(), str) ? iobyxmoadgVar3 : null;
                if (iobyxmoadgVar != null) {
                    break;
                }
            }
        }
        return iobyxmoadgVar;
    }

    private final void b0(String str) {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.shops.zoijcleaow.zoijcleaow(new ShopsArgs(ShopsArgs.zoijcleaow.SPECIAL_BANNER, ((czzsidtyhn) gtknphoqwx()).wkgbmnqykc(), str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        auzgnhcxok auzgnhcxokVar = this.f103893ikoacuggdj;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f103893ikoacuggdj = pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(null), 3, null);
    }

    private final void c0(r62.iobyxmoadg iobyxmoadgVar) {
        NavigationPayload navigationPayloadPpxfxbqfkf = l62.iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar);
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadPpxfxbqfkf.zoijcleaow((191 & 1) != 0 ? navigationPayloadPpxfxbqfkf.navigationLink : null, (191 & 2) != 0 ? navigationPayloadPpxfxbqfkf.reference : null, (191 & 4) != 0 ? navigationPayloadPpxfxbqfkf.title : null, (191 & 8) != 0 ? navigationPayloadPpxfxbqfkf.message : null, (191 & 16) != 0 ? navigationPayloadPpxfxbqfkf.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadPpxfxbqfkf.deepLink : null, (191 & 64) != 0 ? navigationPayloadPpxfxbqfkf.analyticsPayload : new AnalyticsPayload(mhtqkkgtqm(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadPpxfxbqfkf.isPushPayload : false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l00.btonecajqb e() {
        return (l00.btonecajqb) this.f103911oipsdeybqn.getValue();
    }

    private final void e0(t62.iobyxmoadg iobyxmoadgVar) {
        K0(this, AnalyticsPage.Video.f84364iwizpuwonk, null, null, 6, null);
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103881cdpycssgdh.iobyxmoadg(new VideoPlayerArgs(iobyxmoadgVar.eablkybsjg())));
    }

    private final void eslsurpljm(String str) {
        a(str, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.ydmasvzmpa
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerViewModel.krqnebusok((f62.iobyxmoadg) obj);
            }
        });
    }

    private final q62.iobyxmoadg ezmngbhpjk(q62.iobyxmoadg iobyxmoadgVar, String str) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.getItemId(), str) ? q62.iobyxmoadg.wkgbmnqykc(iobyxmoadgVar, null, null, null, null, false, !iobyxmoadgVar.dxjokdxxww(), 31, null) : iobyxmoadgVar;
    }

    private final Set f() {
        Set setQ;
        List list = (List) this.f103882cllcsxoeiz.zoijcleaow("promo_collection_scrolled_state");
        return (list == null || (setQ = hg.jyumaefscl.q(list)) == null) ? new LinkedHashSet() : setQ;
    }

    private final void f0() {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103891hcddaimhww.zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fmlbqenlif(String str, boolean z13) {
        Object value;
        czzsidtyhn czzsidtyhnVar;
        ArrayList arrayList;
        z62.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            czzsidtyhnVar = (czzsidtyhn) value;
            List<o00.iobyxmoadg> listEablkybsjg = czzsidtyhnVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (o00.iobyxmoadg iobyxmoadgVar : listEablkybsjg) {
                z62.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof z62.iobyxmoadg ? (z62.iobyxmoadg) iobyxmoadgVar : null;
                if (iobyxmoadgVar2 != null) {
                    z62.iobyxmoadg iobyxmoadgVar3 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.eablkybsjg(), str) ? iobyxmoadgVar2 : null;
                    if (iobyxmoadgVar3 != null && (iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((247 & 1) != 0 ? iobyxmoadgVar3.f129238zdlpuopuiu : null, (247 & 2) != 0 ? iobyxmoadgVar3.f129237yggfygwlhe : null, (247 & 4) != 0 ? iobyxmoadgVar3.f129234jyumaefscl : null, (247 & 8) != 0 ? iobyxmoadgVar3.f129233iwizpuwonk : null, (247 & 16) != 0 ? iobyxmoadgVar3.f129231cqumvgiudr : null, (247 & 32) != 0 ? iobyxmoadgVar3.f129232esjtqupxsv : false, (247 & 64) != 0 ? iobyxmoadgVar3.f129235lereixgezr : z13, (247 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f129236pmvmpeiblj : false)) != null) {
                        iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
                    }
                }
                arrayList.add(iobyxmoadgVar);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow(czzsidtyhnVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    private final void g0(p62.ppxfxbqfkf ppxfxbqfkfVar) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new vdvldrhtss(ppxfxbqfkfVar, null), 3, null);
    }

    private final void grlcpdaxtj(ProductUiModel productUiModel) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new eablkybsjg(productUiModel, null), 3, null);
    }

    private final void h0(String str, String str2, String str3) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new oxmwwwfdhm(str2, str, str3, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(c52.rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        c52.istkbnxepw istkbnxepwVarIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg();
        Map mapZoijcleaow = rgvfuqvkyqVar.zoijcleaow();
        User userPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
        if (istkbnxepwVarIobyxmoadg.gxszxtbevo().iobyxmoadg() != null) {
            yggfygwlhe(uwvvkdfqfp.ppxfxbqfkf.f104190iobyxmoadg);
        }
        o(istkbnxepwVarIobyxmoadg.gxszxtbevo().iobyxmoadg());
        if (!istkbnxepwVarIobyxmoadg.nufgyqmvbu() || this.f103883cqumvgiudr.getIsAdultConfirmed() || ((Boolean) this.f103890gtknphoqwx.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue() || this.f103897jhduphickx) {
            z0(this, istkbnxepwVarIobyxmoadg, mapZoijcleaow, userPpxfxbqfkf, z13, false, false, 48, null);
        } else {
            this.f103884crxdokpmqz = new zoijcleaow(istkbnxepwVarIobyxmoadg, mapZoijcleaow, userPpxfxbqfkf, z13);
            yggfygwlhe(uwvvkdfqfp.wkgbmnqykc.f104196iobyxmoadg);
        }
        if (this.f103909ntlheqmsrt != null) {
            t0();
        }
    }

    private final void ipoelvxyzq(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wkgbmnqykc(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    private final void ixidwrxhsl(String str) {
        yggfygwlhe(uwvvkdfqfp.iobyxmoadg.f104179iobyxmoadg);
        this.f103907mbcevpiqjq = str;
    }

    private final SimpleDateFormat j() {
        return (SimpleDateFormat) this.f103927vipkmwdibw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(final String str, final String str2) {
        if (this.f103909ntlheqmsrt != null) {
            this.f103924ulzqkzuiru = gg.cqumvgiudr.iobyxmoadg(str, str2);
        } else {
            a(this.f103907mbcevpiqjq, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.yfnezrywwk
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return SpecialBannerViewModel.k0(str, str2, (f62.iobyxmoadg) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(String str, boolean z13) {
        Object value;
        czzsidtyhn czzsidtyhnVar;
        ArrayList arrayList;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            czzsidtyhnVar = (czzsidtyhn) value;
            List<w30.ppxfxbqfkf> listEablkybsjg = czzsidtyhnVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (w30.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg : listEablkybsjg) {
                if (ppxfxbqfkfVarIobyxmoadg instanceof o62.iobyxmoadg) {
                    o62.iobyxmoadg iobyxmoadgVar = (o62.iobyxmoadg) ppxfxbqfkfVarIobyxmoadg;
                    List<ProductUiModel> listDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
                    ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listDxjokdxxww, 10));
                    for (ProductUiModel productUiModelLqeggnwhkg : listDxjokdxxww) {
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productUiModelLqeggnwhkg.getId(), str)) {
                            productUiModelLqeggnwhkg = productUiModelLqeggnwhkg.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelLqeggnwhkg.id : null, ((-1025) & 2) != 0 ? productUiModelLqeggnwhkg.name : null, ((-1025) & 4) != 0 ? productUiModelLqeggnwhkg.article : null, ((-1025) & 8) != 0 ? productUiModelLqeggnwhkg.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelLqeggnwhkg.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelLqeggnwhkg.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelLqeggnwhkg.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelLqeggnwhkg.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelLqeggnwhkg.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelLqeggnwhkg.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelLqeggnwhkg.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModelLqeggnwhkg.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelLqeggnwhkg.isFavorite : z13, ((-1025) & 8192) != 0 ? productUiModelLqeggnwhkg.favoriteEnabledState : true, ((-1025) & 16384) != 0 ? productUiModelLqeggnwhkg.inCart : false, ((-1025) & 32768) != 0 ? productUiModelLqeggnwhkg.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelLqeggnwhkg.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelLqeggnwhkg.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelLqeggnwhkg.fats : null, ((-1025) & 524288) != 0 ? productUiModelLqeggnwhkg.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelLqeggnwhkg.protein : null, ((-1025) & 2097152) != 0 ? productUiModelLqeggnwhkg.energy : null, ((-1025) & 4194304) != 0 ? productUiModelLqeggnwhkg.params : null, ((-1025) & 8388608) != 0 ? productUiModelLqeggnwhkg.description : null, ((-1025) & 16777216) != 0 ? productUiModelLqeggnwhkg.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelLqeggnwhkg.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelLqeggnwhkg.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelLqeggnwhkg.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelLqeggnwhkg.rating : null, ((-1025) & 536870912) != 0 ? productUiModelLqeggnwhkg.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelLqeggnwhkg.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelLqeggnwhkg.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelLqeggnwhkg.video : null, (16777215 & 2) != 0 ? productUiModelLqeggnwhkg.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelLqeggnwhkg.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelLqeggnwhkg.country : null, (16777215 & 16) != 0 ? productUiModelLqeggnwhkg.region : null, (16777215 & 32) != 0 ? productUiModelLqeggnwhkg.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelLqeggnwhkg.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelLqeggnwhkg.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelLqeggnwhkg.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelLqeggnwhkg.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelLqeggnwhkg.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelLqeggnwhkg.tasting : null, (16777215 & 4096) != 0 ? productUiModelLqeggnwhkg.styling : null, (16777215 & 8192) != 0 ? productUiModelLqeggnwhkg.button : null, (16777215 & 16384) != 0 ? productUiModelLqeggnwhkg.hints : null, (16777215 & 32768) != 0 ? productUiModelLqeggnwhkg.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModelLqeggnwhkg.counterModel : null, (16777215 & 131072) != 0 ? productUiModelLqeggnwhkg.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelLqeggnwhkg.vivino : null, (16777215 & 524288) != 0 ? productUiModelLqeggnwhkg.limits : null, (16777215 & 1048576) != 0 ? productUiModelLqeggnwhkg.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelLqeggnwhkg.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelLqeggnwhkg.isSelected : null, (16777215 & 8388608) != 0 ? productUiModelLqeggnwhkg.adv : null);
                        }
                        arrayList2.add(productUiModelLqeggnwhkg);
                    }
                    ppxfxbqfkfVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg((191 & 1) != 0 ? iobyxmoadgVar.f72186zdlpuopuiu : null, (191 & 2) != 0 ? iobyxmoadgVar.f72185yggfygwlhe : null, (191 & 4) != 0 ? iobyxmoadgVar.f72182jyumaefscl : null, (191 & 8) != 0 ? iobyxmoadgVar.f72181iwizpuwonk : null, (191 & 16) != 0 ? iobyxmoadgVar.f72179cqumvgiudr : null, (191 & 32) != 0 ? iobyxmoadgVar.f72180esjtqupxsv : null, (191 & 64) != 0 ? iobyxmoadgVar.f72183lereixgezr : arrayList2, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f72184pmvmpeiblj : null);
                }
                arrayList.add(ppxfxbqfkfVarIobyxmoadg);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow(czzsidtyhnVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f62.iobyxmoadg k0(String str, String str2, f62.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        f62.iobyxmoadg iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : null, (4095 & 8) != 0 ? form.f33015iwizpuwonk : null, (4095 & 16) != 0 ? form.f33011cqumvgiudr : null, (4095 & 32) != 0 ? form.f33012esjtqupxsv : null, (4095 & 64) != 0 ? form.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : str, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : str2, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f33013iozdgvuglv : null);
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f33020yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f33016jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f33015iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f33011cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f33012esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f33014istkbnxepw : iobyxmoadgVarIobyxmoadg.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f33013iozdgvuglv : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f62.iobyxmoadg krqnebusok(f62.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        f62.iobyxmoadg iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : null, (4095 & 8) != 0 ? form.f33015iwizpuwonk : null, (4095 & 16) != 0 ? form.f33011cqumvgiudr : null, (4095 & 32) != 0 ? form.f33012esjtqupxsv : null, (4095 & 64) != 0 ? form.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? form.f33013iozdgvuglv : null);
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f33020yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f33016jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f33015iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f33011cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f33012esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f33014istkbnxepw : iobyxmoadgVarIobyxmoadg.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f33013iozdgvuglv : null);
    }

    private final void l() {
        yggfygwlhe(uwvvkdfqfp.lqeggnwhkg.f104185iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(Throwable th2) {
        if (th2 instanceof FileSizeException) {
            yggfygwlhe(uwvvkdfqfp.wflxmlrfwp.f104195iobyxmoadg);
        } else {
            zdlpuopuiu(th2);
        }
    }

    private final void m(ComboSetProduct comboSetProduct, mo.zoijcleaow zoijcleaowVar) {
        J0(new AnalyticsPage.ItemDetail(comboSetProduct.getArticle(), comboSetProduct.getName()), new AnalyticElement.ProductItemElement(comboSetProduct.getArticle(), comboSetProduct.getName()), new AnalyticsLocation.Combo(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
        d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f103905lmojexxdyd.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Article(comboSetProduct.getArticle()), null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(String str) {
        yggfygwlhe(uwvvkdfqfp.zdlpuopuiu.f104198iobyxmoadg);
        a(str, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.opjhrmiecq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerViewModel.n0(this.f104154zdlpuopuiu, (f62.iobyxmoadg) obj);
            }
        });
    }

    private final AnalyticsPage.LandingPage mhtqkkgtqm() {
        return new AnalyticsPage.LandingPage(((czzsidtyhn) gtknphoqwx()).lqeggnwhkg(), ((czzsidtyhn) gtknphoqwx()).wkgbmnqykc());
    }

    private final void n(qu.iobyxmoadg iobyxmoadgVar) {
        yggfygwlhe(new uwvvkdfqfp.dxjokdxxww(new BuildYourComboDialogArgs(iobyxmoadgVar.dxjokdxxww().iobyxmoadg(), iobyxmoadgVar.dxjokdxxww().zoijcleaow(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.btonecajqb())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f62.iobyxmoadg n0(SpecialBannerViewModel specialBannerViewModel, f62.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        f62.iobyxmoadg iobyxmoadgVar = specialBannerViewModel.f103921sopmlzcsov;
        return iobyxmoadgVar == null ? form : iobyxmoadgVar;
    }

    private final void o(c52.yadqdtsiqt yadqdtsiqtVar) {
        auzgnhcxok auzgnhcxokVar = this.f103901jztzpxfvev;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        auzgnhcxok auzgnhcxokVar2 = this.f103931xrmfcynszj;
        if (auzgnhcxokVar2 != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar2, null, 1, null);
        }
        if (yadqdtsiqtVar == null) {
            return;
        }
        if (yadqdtsiqtVar.iobyxmoadg() > 0) {
            this.f103901jztzpxfvev = k30.wflxmlrfwp.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), (110 & 2) != 0 ? 0L : 0L, (110 & 4) != 0 ? 1000L : 0L, (110 & 8) != 0 ? null : null, ((int) yadqdtsiqtVar.iobyxmoadg()) + 1, (110 & 32) != 0 ? new k30.wflxmlrfwp.iobyxmoadg(null) : null, (110 & 64) != 0 ? new k30.wflxmlrfwp.zoijcleaow(null) : null, (110 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new k30.wflxmlrfwp.ppxfxbqfkf(null) : new nufgyqmvbu(null), (110 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new k30.wflxmlrfwp.wkgbmnqykc(null) : null);
        }
        if (yadqdtsiqtVar.zoijcleaow() > 0) {
            this.f103931xrmfcynszj = k30.wflxmlrfwp.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), (110 & 2) != 0 ? 0L : 0L, (110 & 4) != 0 ? 1000L : 0L, (110 & 8) != 0 ? null : null, ((int) yadqdtsiqtVar.zoijcleaow()) + 1, (110 & 32) != 0 ? new k30.wflxmlrfwp.iobyxmoadg(null) : null, (110 & 64) != 0 ? new k30.wflxmlrfwp.zoijcleaow(null) : null, (110 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new k30.wflxmlrfwp.ppxfxbqfkf(null) : new dxjokdxxww(null), (110 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new k30.wflxmlrfwp.wkgbmnqykc(null) : null);
        }
    }

    private final void o0(p62.ppxfxbqfkf ppxfxbqfkfVar) {
        if (((Boolean) eablkybsjg().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            p0(ppxfxbqfkfVar);
        } else {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103932yadqdtsiqt.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
        }
    }

    private final void p(f40.zoijcleaow zoijcleaowVar, String str) {
        d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
        iobyxmoadgVar.kcexrzcfyt().wkgbmnqykc(this.f103915pkzmftpjix.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.lrnfpwlwnk
            @Override // l9.draadjrbmk
            public final void iobyxmoadg(Object obj) {
                SpecialBannerViewModel.q(this.f104089iobyxmoadg, obj);
            }
        });
        iobyxmoadgVar.pkzmftpjix(new NavigationPayload(zoijcleaowVar, str, null, null, false, null, new AnalyticsPayload(mhtqkkgtqm(), null, null, 6, null), false, 188, null));
    }

    private final void p0(p62.ppxfxbqfkf ppxfxbqfkfVar) {
        p62.zoijcleaow zoijcleaowVarWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
        f40.zoijcleaow zoijcleaowVarPpxfxbqfkf = zoijcleaowVarWkgbmnqykc != null ? zoijcleaowVarWkgbmnqykc.ppxfxbqfkf() : null;
        p62.zoijcleaow zoijcleaowVarWkgbmnqykc2 = ppxfxbqfkfVar.wkgbmnqykc();
        String strWkgbmnqykc = zoijcleaowVarWkgbmnqykc2 != null ? zoijcleaowVarWkgbmnqykc2.wkgbmnqykc() : null;
        if (strWkgbmnqykc == null) {
            strWkgbmnqykc = "";
        }
        int i13 = zoijcleaowVarPpxfxbqfkf == null ? -1 : ppxfxbqfkf.f104025iobyxmoadg[zoijcleaowVarPpxfxbqfkf.ordinal()];
        if (i13 == 1) {
            m62.zoijcleaow zoijcleaowVarGxszxtbevo = ((czzsidtyhn) getState().getValue()).gxszxtbevo();
            m62.iobyxmoadg iobyxmoadgVarIobyxmoadg = zoijcleaowVarGxszxtbevo.iobyxmoadg();
            C0(new QrCodeArgs(zoijcleaowVarGxszxtbevo.ppxfxbqfkf(), zoijcleaowVarGxszxtbevo.zoijcleaow(), iobyxmoadgVarIobyxmoadg != null ? new QrCodeButton(iobyxmoadgVarIobyxmoadg.eablkybsjg(), iobyxmoadgVarIobyxmoadg.iobyxmoadg(), iobyxmoadgVarIobyxmoadg.zoijcleaow(), iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(), iobyxmoadgVarIobyxmoadg.wkgbmnqykc()) : null, ppxfxbqfkfVar.draadjrbmk(), ppxfxbqfkfVar.dxjokdxxww(), ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar.gtknphoqwx(), ppxfxbqfkfVar.btonecajqb(), null, ppxfxbqfkfVar.wflxmlrfwp(), true));
            return;
        }
        if (i13 == 2) {
            g0(ppxfxbqfkfVar);
        } else if (zoijcleaowVarPpxfxbqfkf != null) {
            q0(zoijcleaowVarPpxfxbqfkf, strWkgbmnqykc);
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
    public static final void q(SpecialBannerViewModel specialBannerViewModel, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        pe0.iobyxmoadg iobyxmoadgVar = specialBannerViewModel.f103915pkzmftpjix;
        if (iobyxmoadgVar.zoijcleaow(iobyxmoadgVar)) {
            specialBannerViewModel.c();
        }
    }

    private final void q0(f40.zoijcleaow zoijcleaowVar, String str) {
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(zoijcleaowVar, str, null, null, false, null, new AnalyticsPayload(mhtqkkgtqm(), null, null, 6, null), false, 184, null));
    }

    private final void r(String str, String str2) {
        Object next;
        z62.iobyxmoadg iobyxmoadgVarB = b(str);
        if (iobyxmoadgVarB == null) {
            return;
        }
        Iterator it = iobyxmoadgVarB.nufgyqmvbu().iterator();
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
            B0(promoCollectionItem);
        } else {
            if (!(currentStatus instanceof PromoCollectionItem.Status.ReadyToOpen)) {
                throw new NoWhenBranchMatchedException();
            }
            h0(iobyxmoadgVarB.getItemId(), str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        yggfygwlhe(new uwvvkdfqfp.iwizpuwonk(warning.getMessage()));
    }

    private final void rhgxfdycjh(ChangeProductParams changeProductParams) {
        Object obj = null;
        boolean zBooleanValue = ((Boolean) pj.btonecajqb.zoijcleaow(null, new gxszxtbevo(null), 1, null)).booleanValue();
        for (Object obj2 : this.f103938zfvoamnweg) {
            ProductUIData productUIData = (ProductUIData) obj2;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productUIData.getArticle(), changeProductParams.getProductId()) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productUIData.getId(), changeProductParams.getProductId())) {
                obj = obj2;
                break;
            }
        }
        boolean z13 = obj != null;
        if (zBooleanValue || !changeProductParams.getIsPmProduct() || z13) {
            hkdspvbjdz(changeProductParams, false);
        } else {
            yggfygwlhe(new uwvvkdfqfp.agtfadlqog(changeProductParams));
        }
    }

    private final void s(String str) {
        Object value;
        czzsidtyhn czzsidtyhnVar;
        ArrayList arrayList;
        z62.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            czzsidtyhnVar = (czzsidtyhn) value;
            this.f103934yfnezrywwk.add(str);
            v0(this.f103934yfnezrywwk);
            List<o00.iobyxmoadg> listEablkybsjg = czzsidtyhnVar.eablkybsjg();
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listEablkybsjg, 10));
            for (o00.iobyxmoadg iobyxmoadgVar : listEablkybsjg) {
                z62.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof z62.iobyxmoadg ? (z62.iobyxmoadg) iobyxmoadgVar : null;
                if (iobyxmoadgVar2 != null) {
                    z62.iobyxmoadg iobyxmoadgVar3 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.eablkybsjg(), str) ? iobyxmoadgVar2 : null;
                    if (iobyxmoadgVar3 != null && (iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((247 & 1) != 0 ? iobyxmoadgVar3.f129238zdlpuopuiu : null, (247 & 2) != 0 ? iobyxmoadgVar3.f129237yggfygwlhe : null, (247 & 4) != 0 ? iobyxmoadgVar3.f129234jyumaefscl : null, (247 & 8) != 0 ? iobyxmoadgVar3.f129233iwizpuwonk : null, (247 & 16) != 0 ? iobyxmoadgVar3.f129231cqumvgiudr : null, (247 & 32) != 0 ? iobyxmoadgVar3.f129232esjtqupxsv : false, (247 & 64) != 0 ? iobyxmoadgVar3.f129235lereixgezr : false, (247 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f129236pmvmpeiblj : true)) != null) {
                        iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
                    }
                }
                arrayList.add(iobyxmoadgVar);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhn.zoijcleaow(czzsidtyhnVar, null, null, null, null, false, arrayList, false, 95, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l00.btonecajqb s0(SpecialBannerViewModel specialBannerViewModel) {
        return l00.gtknphoqwx.zoijcleaow(specialBannerViewModel.f103889esjtqupxsv, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Warning warning) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warning, Warning.Empty.f87479jyumaefscl)) {
            yggfygwlhe(uwvvkdfqfp.nufgyqmvbu.f104186iobyxmoadg);
            return;
        }
        if (warning instanceof Warning.WithCodeAndMessage) {
            r0(warning);
        } else if (warning instanceof Warning.DailyLimit) {
            yggfygwlhe(new uwvvkdfqfp.ojitshcjhn(((Warning.DailyLimit) warning).getMessage()));
        } else if (!(warning instanceof Warning.AvailableOnlyForPickup) && !(warning instanceof Warning.Interval)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void t0() {
        final RegistrationFormState registrationFormState = this.f103909ntlheqmsrt;
        if (registrationFormState != null) {
            a(registrationFormState.getItemId(), new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.weqkydbzbr
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return SpecialBannerViewModel.u0(registrationFormState, this, (f62.iobyxmoadg) obj);
                }
            });
            this.f103909ntlheqmsrt = null;
            this.f103924ulzqkzuiru = null;
        }
    }

    private final void u() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new btonecajqb(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f62.iobyxmoadg u0(RegistrationFormState registrationFormState, SpecialBannerViewModel specialBannerViewModel, f62.iobyxmoadg form) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
        f62.iobyxmoadg iobyxmoadgVarIobyxmoadg = form.iobyxmoadg((4095 & 1) != 0 ? form.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? form.f33020yggfygwlhe : null, (4095 & 4) != 0 ? form.f33016jyumaefscl : registrationFormState.getUserName(), (4095 & 8) != 0 ? form.f33015iwizpuwonk : registrationFormState.getPhone(), (4095 & 16) != 0 ? form.f33011cqumvgiudr : registrationFormState.getEmail(), (4095 & 32) != 0 ? form.f33012esjtqupxsv : registrationFormState.getAdditionalField(), (4095 & 64) != 0 ? form.f33017lereixgezr : registrationFormState.getOrderNumber(), (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? form.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? form.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? form.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? form.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? form.f33019yadqdtsiqt : registrationFormState.getSelectedOrderType(), (4095 & 4096) != 0 ? form.f33013iozdgvuglv : registrationFormState.getReceiptDate());
        gg.vdvldrhtss vdvldrhtssVar = specialBannerViewModel.f103924ulzqkzuiru;
        if (vdvldrhtssVar != null) {
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f33020yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f33016jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f33015iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f33011cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f33012esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f33018pmvmpeiblj : (String) vdvldrhtssVar.lqeggnwhkg(), (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f33022zynmafqrjb : (String) vdvldrhtssVar.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f33014istkbnxepw : false, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f33013iozdgvuglv : null);
            f62.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVarIobyxmoadg.iobyxmoadg((4095 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f33021zdlpuopuiu : null, (4095 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f33020yggfygwlhe : null, (4095 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f33016jyumaefscl : null, (4095 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f33015iwizpuwonk : null, (4095 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f33011cqumvgiudr : null, (4095 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f33012esjtqupxsv : null, (4095 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f33017lereixgezr : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f33018pmvmpeiblj : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f33022zynmafqrjb : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f33014istkbnxepw : iobyxmoadgVarIobyxmoadg.nufgyqmvbu(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f33010cdpycssgdh : false, (4095 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f33019yadqdtsiqt : null, (4095 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f33013iozdgvuglv : null);
            if (iobyxmoadgVarIobyxmoadg2 != null) {
                return iobyxmoadgVarIobyxmoadg2;
            }
        }
        return iobyxmoadgVarIobyxmoadg;
    }

    private final void v(String str, String str2) {
        d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f103929wwaezpbzkn.ppxfxbqfkf(new PromoCollectionPayload(((czzsidtyhn) gtknphoqwx()).wkgbmnqykc(), str2, str, this.f103885czzsidtyhn)));
    }

    private final void v0(Set set) {
        this.f103882cllcsxoeiz.wkgbmnqykc("promo_collection_scrolled_state", hg.jyumaefscl.m(set));
    }

    private final void w(ProductUiModel productUiModel) {
        if (((Boolean) eablkybsjg().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            grlcpdaxtj(productUiModel);
        } else {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103932yadqdtsiqt.ppxfxbqfkf(new NonAuthorizedPayload(null, null, 3, null)));
        }
    }

    private final void x() {
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    private final void y() {
        this.f103880btonecajqb.zoijcleaow(Boolean.TRUE);
        this.f103897jhduphickx = true;
        zoijcleaow zoijcleaowVar = this.f103884crxdokpmqz;
        if (zoijcleaowVar == null) {
            c();
        } else {
            z0(this, zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.wkgbmnqykc(), false, false, 48, null);
            this.f103884crxdokpmqz = null;
        }
    }

    private final void y0(c52.istkbnxepw istkbnxepwVar, Map map, User user, boolean z13, boolean z14, boolean z15) {
        Object next;
        Object next2;
        Object value;
        this.f103885czzsidtyhn = istkbnxepwVar.iobyxmoadg();
        xrmfcynszj xrmfcynszjVar = this.f103917rgvfuqvkyq;
        List list = this.f103938zfvoamnweg;
        y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt = kcexrzcfyt();
        czzsidtyhn czzsidtyhnVarWkgbmnqykc = xrmfcynszjVar.wkgbmnqykc(istkbnxepwVar, map, user, z13, z14, z15, list, iobyxmoadgVarKcexrzcfyt != null ? iobyxmoadgVarKcexrzcfyt.ppxfxbqfkf() : null, this.f103934yfnezrywwk, new zdlpuopuiu(this.f103939zynmafqrjb));
        if (!this.f103883cqumvgiudr.getLoadTitle()) {
            String bannerTitle = this.f103883cqumvgiudr.getBannerTitle();
            if (bannerTitle == null) {
                bannerTitle = "";
            }
            czzsidtyhnVarWkgbmnqykc = czzsidtyhn.zoijcleaow(czzsidtyhnVarWkgbmnqykc, null, bannerTitle, null, null, false, null, false, 125, null);
        }
        Iterator it = czzsidtyhnVarWkgbmnqykc.eablkybsjg().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((o00.iobyxmoadg) next) instanceof f62.iobyxmoadg));
        this.f103921sopmlzcsov = next instanceof f62.iobyxmoadg ? (f62.iobyxmoadg) next : null;
        Iterator it2 = czzsidtyhnVarWkgbmnqykc.eablkybsjg().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!(((o00.iobyxmoadg) next2) instanceof z62.iobyxmoadg));
        o00.iobyxmoadg iobyxmoadgVar = (o00.iobyxmoadg) next2;
        if (iobyxmoadgVar != null) {
            z62.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof z62.iobyxmoadg ? (z62.iobyxmoadg) iobyxmoadgVar : null;
            if (iobyxmoadgVar2 != null) {
                I0(iobyxmoadgVar2.eablkybsjg());
            }
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, czzsidtyhnVarWkgbmnqykc));
        if (czzsidtyhnVarWkgbmnqykc.eablkybsjg().isEmpty()) {
            return;
        }
        this.f103887dsvhmnatus.zoijcleaow(new oo.dxjokdxxww.iobyxmoadg(null, 1, null));
    }

    private final void yzdjzghtvl(String str) {
        this.f103918ribwqtqdhb = null;
        this.f103898jlmebxxoox.setTime(new Date());
        P0(str);
    }

    private final void z() {
        this.f103892hkdspvbjdz.ppxfxbqfkf(this.f103925uwvvkdfqfp);
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    static /* synthetic */ void z0(SpecialBannerViewModel specialBannerViewModel, c52.istkbnxepw istkbnxepwVar, Map map, User user, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        specialBannerViewModel.y0(istkbnxepwVar, map, user, z13, (i13 & 16) != 0 ? true : z14, (i13 & 32) != 0 ? true : z15);
    }

    public final void G(String itemId, Date date) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(date, "date");
        this.f103898jlmebxxoox.setTime(date);
        Date time = this.f103898jlmebxxoox.getTime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        yggfygwlhe(new uwvvkdfqfp.zoijcleaow(itemId, time));
    }

    public final void I(metgxyhuhe event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof metgxyhuhe.lqeggnwhkg) {
            z();
            return;
        }
        if (event instanceof metgxyhuhe.btonecajqb) {
            B(((metgxyhuhe.btonecajqb) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.oxmwwwfdhm) {
            H(((metgxyhuhe.oxmwwwfdhm) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.cllcsxoeiz) {
            b0(((metgxyhuhe.cllcsxoeiz) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.iozdgvuglv) {
            a0(((metgxyhuhe.iozdgvuglv) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.wypolnanlu) {
            e0(((metgxyhuhe.wypolnanlu) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.hcddaimhww) {
            metgxyhuhe.hcddaimhww hcddaimhwwVar = (metgxyhuhe.hcddaimhww) event;
            X(hcddaimhwwVar.iobyxmoadg(), hcddaimhwwVar.zoijcleaow());
            return;
        }
        if (event instanceof metgxyhuhe.pkzmftpjix) {
            W(((metgxyhuhe.pkzmftpjix) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.istkbnxepw) {
            return;
        }
        if (event instanceof metgxyhuhe.wwaezpbzkn) {
            metgxyhuhe.wwaezpbzkn wwaezpbzknVar = (metgxyhuhe.wwaezpbzkn) event;
            V(wwaezpbzknVar.zoijcleaow(), wwaezpbzknVar.iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.cqumvgiudr) {
            O(((metgxyhuhe.cqumvgiudr) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.hkdspvbjdz) {
            Y(((metgxyhuhe.hkdspvbjdz) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.draadjrbmk) {
            E();
            return;
        }
        if (event instanceof metgxyhuhe.lmojexxdyd) {
            metgxyhuhe.lmojexxdyd lmojexxdydVar = (metgxyhuhe.lmojexxdyd) event;
            U(lmojexxdydVar.zoijcleaow(), lmojexxdydVar.ppxfxbqfkf(), lmojexxdydVar.iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.iwizpuwonk) {
            metgxyhuhe.iwizpuwonk iwizpuwonkVar = (metgxyhuhe.iwizpuwonk) event;
            N(iwizpuwonkVar.zoijcleaow(), iwizpuwonkVar.iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.gtknphoqwx) {
            hkdspvbjdz(((metgxyhuhe.gtknphoqwx) event).iobyxmoadg(), false);
            return;
        }
        if (event instanceof metgxyhuhe.lereixgezr) {
            metgxyhuhe.lereixgezr lereixgezrVar = (metgxyhuhe.lereixgezr) event;
            Q(lereixgezrVar.zoijcleaow(), lereixgezrVar.iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.eablkybsjg) {
            ixidwrxhsl(((metgxyhuhe.eablkybsjg) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.vdvldrhtss) {
            eslsurpljm(((metgxyhuhe.vdvldrhtss) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.esjtqupxsv) {
            P(((metgxyhuhe.esjtqupxsv) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.pmvmpeiblj) {
            Z(((metgxyhuhe.pmvmpeiblj) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.zynmafqrjb) {
            f0();
            return;
        }
        if (event instanceof metgxyhuhe.wflxmlrfwp) {
            metgxyhuhe.wflxmlrfwp wflxmlrfwpVar = (metgxyhuhe.wflxmlrfwp) event;
            m(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.ojitshcjhn) {
            n(((metgxyhuhe.ojitshcjhn) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.agtfadlqog) {
            metgxyhuhe.agtfadlqog agtfadlqogVar = (metgxyhuhe.agtfadlqog) event;
            F(agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.zoijcleaow());
            return;
        }
        if (event instanceof metgxyhuhe.rgvfuqvkyq) {
            o0(((metgxyhuhe.rgvfuqvkyq) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, metgxyhuhe.yadqdtsiqt.f104142iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.yadqdtsiqt(MainTab.CART, true);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, metgxyhuhe.ppxfxbqfkf.f104130iobyxmoadg)) {
            x();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, metgxyhuhe.wkgbmnqykc.f104138iobyxmoadg)) {
            y();
            return;
        }
        if (event instanceof metgxyhuhe.nufgyqmvbu) {
            metgxyhuhe.nufgyqmvbu nufgyqmvbuVar = (metgxyhuhe.nufgyqmvbu) event;
            A(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.cdpycssgdh) {
            T(((metgxyhuhe.cdpycssgdh) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.jpowsppfya) {
            yzdjzghtvl(((metgxyhuhe.jpowsppfya) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.gxszxtbevo) {
            ylkuphrtab(((metgxyhuhe.gxszxtbevo) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.kcexrzcfyt) {
            J(((metgxyhuhe.kcexrzcfyt) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.yggfygwlhe) {
            L(((metgxyhuhe.yggfygwlhe) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.zdlpuopuiu) {
            K(((metgxyhuhe.zdlpuopuiu) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, metgxyhuhe.jyumaefscl.f104114iobyxmoadg)) {
            M();
            return;
        }
        if (event instanceof metgxyhuhe.dsvhmnatus) {
            c0(((metgxyhuhe.dsvhmnatus) event).iobyxmoadg());
            return;
        }
        if (event instanceof metgxyhuhe.zoijcleaow) {
            w(((metgxyhuhe.zoijcleaow) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, metgxyhuhe.dxjokdxxww.f104099iobyxmoadg)) {
            l();
            return;
        }
        if (event instanceof metgxyhuhe.iobyxmoadg) {
            metgxyhuhe.iobyxmoadg iobyxmoadgVar = (metgxyhuhe.iobyxmoadg) event;
            p(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
            return;
        }
        if (event instanceof metgxyhuhe.stevsuqkhv) {
            metgxyhuhe.stevsuqkhv stevsuqkhvVar = (metgxyhuhe.stevsuqkhv) event;
            v(stevsuqkhvVar.iobyxmoadg(), stevsuqkhvVar.zoijcleaow());
            return;
        }
        if (event instanceof metgxyhuhe.kegysxyocb) {
            metgxyhuhe.kegysxyocb kegysxyocbVar = (metgxyhuhe.kegysxyocb) event;
            r(kegysxyocbVar.iobyxmoadg(), kegysxyocbVar.zoijcleaow());
        } else if (event instanceof metgxyhuhe.tzroggbefp) {
            s(((metgxyhuhe.tzroggbefp) event).iobyxmoadg());
        } else {
            if (!(event instanceof metgxyhuhe.ylkuphrtab)) {
                throw new NoWhenBranchMatchedException();
            }
            metgxyhuhe.ylkuphrtab ylkuphrtabVar = (metgxyhuhe.ylkuphrtab) event;
            S(ylkuphrtabVar.ppxfxbqfkf(), ylkuphrtabVar.iobyxmoadg(), ylkuphrtabVar.zoijcleaow());
        }
    }

    public tg.iobyxmoadg d() {
        return this.f103920sflfametgt;
    }

    public final void d0(String itemId, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        Calendar.getInstance().set(13, 1);
        this.f103898jlmebxxoox.set(11, i13);
        this.f103898jlmebxxoox.set(12, i14);
        this.f103898jlmebxxoox.set(13, 0);
        this.f103918ribwqtqdhb = j().format(this.f103898jlmebxxoox.getTime());
        P0(itemId);
    }

    @Override // h20.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f103886draadjrbmk;
    }

    public final RegistrationFormState g() {
        Object next;
        Iterator it = ((czzsidtyhn) gtknphoqwx()).eablkybsjg().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((o00.iobyxmoadg) next) instanceof f62.iobyxmoadg));
        f62.iobyxmoadg iobyxmoadgVar = next instanceof f62.iobyxmoadg ? (f62.iobyxmoadg) next : null;
        if (iobyxmoadgVar != null) {
            return new RegistrationFormState(iobyxmoadgVar.getItemId(), iobyxmoadgVar.oxmwwwfdhm(), iobyxmoadgVar.ojitshcjhn(), iobyxmoadgVar.dxjokdxxww(), iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.wflxmlrfwp(), iobyxmoadgVar.vdvldrhtss(), this.f103918ribwqtqdhb);
        }
        return null;
    }

    @Override // h20.ppxfxbqfkf
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gtknphoqwx(null), 3, null);
    }

    public sj.lqeggnwhkg h() {
        return this.f103906lqeggnwhkg.ppxfxbqfkf();
    }

    public final Date i() {
        Date date;
        String str = this.f103918ribwqtqdhb;
        if (str != null && (date = j().parse(str)) != null) {
            return date;
        }
        Date time = this.f103898jlmebxxoox.getTime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        return time;
    }

    @Override // h20.ppxfxbqfkf
    public void iozdgvuglv(ChangeProductParams params, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        if (str == null) {
            str = this.f103939zynmafqrjb.getString(pm.dxjokdxxww.available_only_for_pickup_product);
        }
        yggfygwlhe(new uwvvkdfqfp.gxszxtbevo(params, str));
    }

    public void k(sx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f103906lqeggnwhkg.wkgbmnqykc(event);
    }

    @Override // h20.ppxfxbqfkf
    public y00.iobyxmoadg kcexrzcfyt() {
        return this.f103933ydmasvzmpa;
    }

    @Override // vx.eablkybsjg, androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        String landingPageKey = this.f103883cqumvgiudr.getLandingPageKey();
        if (landingPageKey != null) {
            this.f103922stevsuqkhv.zoijcleaow(landingPageKey);
        }
        super.onCleared();
    }

    @Override // h20.ppxfxbqfkf
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f103920sflfametgt = iobyxmoadgVar;
    }

    @Override // h20.ppxfxbqfkf
    public void tzroggbefp(ChangeProductParams changeProductParams) {
        yggfygwlhe(uwvvkdfqfp.vdvldrhtss.f104194iobyxmoadg);
    }

    @Override // vx.eablkybsjg
    protected Object vdvldrhtss(sx.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        k(iobyxmoadgVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public void w0(y00.iobyxmoadg iobyxmoadgVar) {
        this.f103933ydmasvzmpa = iobyxmoadgVar;
    }

    @Override // h20.ppxfxbqfkf
    public void wwaezpbzkn(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new kcexrzcfyt(params, null), 3, null);
    }

    public final void x0(RegistrationFormState savedState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedState, "savedState");
        this.f103909ntlheqmsrt = savedState;
    }

    @Override // h20.ppxfxbqfkf
    public void zoijcleaow() {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103932yadqdtsiqt.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
    }
}
