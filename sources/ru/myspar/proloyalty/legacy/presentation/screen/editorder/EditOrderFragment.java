package ru.myspar.proloyalty.legacy.presentation.screen.editorder;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ribwqtqdhb;
import androidx.lifecycle.zynmafqrjb;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import g6.hkdspvbjdz;
import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.yadqdtsiqt;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001a\b\u0007\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001lB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u001f\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\u00020\b2\b\b\u0001\u0010+\u001a\u00020*2\b\b\u0001\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0005J\u000f\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010\u0005J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0005J\u001f\u00107\u001a\u00020\b2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J!\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AR\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020?0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010S\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010S\u001a\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/screen/editorder/EditOrderFragment;", "Lru/myspar/proloyalty/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/proloyalty/legacy/presentation/screen/editorder/lereixgezr;", "Lj21/iobyxmoadg;", "<init>", "()V", "Lru/myspar/proloyalty/legacy/presentation/screen/editorder/cqumvgiudr;", "uiLabel", "Lgg/wwaezpbzkn;", "ydmasvzmpa", "(Lru/myspar/proloyalty/legacy/presentation/screen/editorder/cqumvgiudr;)Lgg/wwaezpbzkn;", "weqkydbzbr", "Lru/myspar/proloyalty/legacy/presentation/screen/editorder/iwizpuwonk;", "state", "yfnezrywwk", "(Lru/myspar/proloyalty/legacy/presentation/screen/editorder/iwizpuwonk;)V", "Ljava/time/LocalDateTime;", "dateTime", "jhduphickx", "(Ljava/time/LocalDateTime;)V", "okpsazkaxt", "()Lgg/wwaezpbzkn;", "editOrderExpirationTime", "nuxfzjnpeb", "", "endNotificationTime", "lrnfpwlwnk", "(J)V", "oneMinuteNotificationTime", "tbqsvytpvh", "ikoacuggdj", "", "promo", "Lru/myspar/proloyalty/legacy/presentation/screen/editorder/iwizpuwonk$iobyxmoadg;", "status", "roivzttewh", "(Ljava/lang/String;Lru/myspar/proloyalty/legacy/presentation/screen/editorder/iwizpuwonk$iobyxmoadg;)V", "Landroid/widget/EditText;", "editText", "value", "auzgnhcxok", "(Landroid/widget/EditText;Ljava/lang/String;)V", "", "title", "tint", "uawqvzlxes", "(II)V", "iwxlajgraz", "lxfrhoxuzk", "skhdrjzrfn", "ageimvtcrz", "Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;", "hint", "Lru/myspar/proloyalty/common/view/product/model/cart/CartProductUiModel;", "product", "fiwbwshyhd", "(Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;Lru/myspar/proloyalty/common/view/product/model/cart/CartProductUiModel;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "gxszxtbevo", "()Z", "Lru/myspar/proloyalty/legacy/presentation/screen/editorder/iobyxmoadg;", "esjtqupxsv", "Lru/myspar/proloyalty/legacy/presentation/screen/editorder/iobyxmoadg;", "jztzpxfvev", "()Lru/myspar/proloyalty/legacy/presentation/screen/editorder/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/proloyalty/legacy/presentation/screen/editorder/iobyxmoadg;)V", "assistedFactory", "Lz21/iobyxmoadg;", "lereixgezr", "Lz21/iobyxmoadg;", "czzsidtyhn", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "pmvmpeiblj", "Lgg/gtknphoqwx;", "uwvvkdfqfp", "()Lru/myspar/proloyalty/legacy/presentation/screen/editorder/lereixgezr;", "viewModel", "Lz41/yggfygwlhe;", "zynmafqrjb", "Lsr0/ppxfxbqfkf;", "xrmfcynszj", "()Lz41/yggfygwlhe;", "binding", "Landroidx/compose/runtime/iwxlajgraz;", "istkbnxepw", "Landroidx/compose/runtime/iwxlajgraz;", "isRemoveLoading", "ru/myspar/proloyalty/legacy/presentation/screen/editorder/EditOrderFragment$vdvldrhtss", "cdpycssgdh", "rlfsiqarku", "()Lru/myspar/proloyalty/legacy/presentation/screen/editorder/EditOrderFragment$vdvldrhtss;", "productAdapter", "Lru/myspar/proloyalty/core/domain/models/payload/EditOrderPayload;", "yadqdtsiqt", "metgxyhuhe", "()Lru/myspar/proloyalty/core/domain/models/payload/EditOrderPayload;", "payload", "iozdgvuglv", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EditOrderFragment extends Hilt_EditOrderFragment<lereixgezr> implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx productAdapter;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final iwxlajgraz isRemoveLoading;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx payload;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f96693lmojexxdyd = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(EditOrderFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/FragmentEditOrderProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final int f96694wwaezpbzkn = 8;

    public static final class agtfadlqog implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96702jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96703yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96704zdlpuopuiu;

        public agtfadlqog(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f96704zdlpuopuiu = jpowsppfyaVar;
            this.f96703yggfygwlhe = j13;
            this.f96702jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96704zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96703yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f96702jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.ojitshcjhn.f96825iobyxmoadg);
        }
    }

    public static final class btonecajqb implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96705jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96706yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96707zdlpuopuiu;

        public btonecajqb(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f96707zdlpuopuiu = jpowsppfyaVar;
            this.f96706yggfygwlhe = j13;
            this.f96705jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96707zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96706yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f96705jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.nufgyqmvbu.f96824iobyxmoadg);
        }
    }

    public static final class draadjrbmk implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96708jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96709yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96710zdlpuopuiu;

        public draadjrbmk(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f96710zdlpuopuiu = jpowsppfyaVar;
            this.f96709yggfygwlhe = j13;
            this.f96708jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96710zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96709yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f96708jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.ppxfxbqfkf.f96826iobyxmoadg);
        }
    }

    public static final class dxjokdxxww implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96711jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96712yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96713zdlpuopuiu;

        public dxjokdxxww(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f96713zdlpuopuiu = jpowsppfyaVar;
            this.f96712yggfygwlhe = j13;
            this.f96711jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96713zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96712yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f96711jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.wflxmlrfwp.f96828iobyxmoadg);
        }
    }

    public static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96714iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f96715jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f96716yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96717zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ EditOrderFragment f96718jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f96719yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f96720zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, EditOrderFragment editOrderFragment) {
                super(2, gxszxtbevoVar);
                this.f96718jyumaefscl = editOrderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f96718jyumaefscl);
                iobyxmoadgVar.f96719yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f96720zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    wypolnanlu state = this.f96718jyumaefscl.wwaezpbzkn().getState();
                    lqeggnwhkg lqeggnwhkgVar = this.f96718jyumaefscl.new lqeggnwhkg();
                    this.f96720zdlpuopuiu = 1;
                    if (state.collect(lqeggnwhkgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, EditOrderFragment editOrderFragment) {
            super(2, gxszxtbevoVar);
            this.f96716yggfygwlhe = fragment;
            this.f96715jyumaefscl = zoijcleaowVar;
            this.f96714iwizpuwonk = editOrderFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f96716yggfygwlhe, this.f96715jyumaefscl, gxszxtbevoVar, this.f96714iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96717zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f96716yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f96715jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f96714iwizpuwonk);
                this.f96717zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class gtknphoqwx implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96721jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96722yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96723zdlpuopuiu;

        public gtknphoqwx(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f96723zdlpuopuiu = jpowsppfyaVar;
            this.f96722yggfygwlhe = j13;
            this.f96721jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96723zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96722yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f96721jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.dxjokdxxww.f96818iobyxmoadg);
        }
    }

    public static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96724iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f96725jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f96726yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96727zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ EditOrderFragment f96728jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f96729yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f96730zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, EditOrderFragment editOrderFragment) {
                super(2, gxszxtbevoVar);
                this.f96728jyumaefscl = editOrderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f96728jyumaefscl);
                iobyxmoadgVar.f96729yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f96730zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = this.f96728jyumaefscl.wwaezpbzkn().draadjrbmk();
                    nufgyqmvbu nufgyqmvbuVar = this.f96728jyumaefscl.new nufgyqmvbu();
                    this.f96730zdlpuopuiu = 1;
                    if (lqeggnwhkgVarDraadjrbmk.collect(nufgyqmvbuVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, EditOrderFragment editOrderFragment) {
            super(2, gxszxtbevoVar);
            this.f96726yggfygwlhe = fragment;
            this.f96725jyumaefscl = zoijcleaowVar;
            this.f96724iwizpuwonk = editOrderFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f96726yggfygwlhe, this.f96725jyumaefscl, gxszxtbevoVar, this.f96724iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96727zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f96726yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f96725jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f96724iwizpuwonk);
                this.f96727zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.editorder.EditOrderFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EditOrderFragment iobyxmoadg(EditOrderPayload payload) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
            EditOrderFragment editOrderFragment = new EditOrderFragment();
            editOrderFragment.setArguments(q1.ppxfxbqfkf.zoijcleaow(gg.cqumvgiudr.iobyxmoadg("payload", payload)));
            return editOrderFragment;
        }

        private Companion() {
        }
    }

    public static final class iwizpuwonk implements crxdokpmqz.ppxfxbqfkf {
        public iwizpuwonk() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            lereixgezr lereixgezrVarIobyxmoadg = EditOrderFragment.this.jztzpxfvev().iobyxmoadg(EditOrderFragment.this.metgxyhuhe());
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(lereixgezrVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.proloyalty.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return lereixgezrVarIobyxmoadg;
        }
    }

    public static final class jyumaefscl extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f96732yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f96733zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f96733zdlpuopuiu = iobyxmoadgVar;
            this.f96732yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f96733zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f96732yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class kcexrzcfyt extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f96734zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(Fragment fragment) {
            super(0);
            this.f96734zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f96734zdlpuopuiu;
        }
    }

    /* synthetic */ class lqeggnwhkg implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {
        lqeggnwhkg() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objOipsdeybqn = EditOrderFragment.oipsdeybqn(EditOrderFragment.this, iwizpuwonkVar, gxszxtbevoVar);
            return objOipsdeybqn == mg.zoijcleaow.gxszxtbevo() ? objOipsdeybqn : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, EditOrderFragment.this, EditOrderFragment.class, "handleState", "handleState(Lru/myspar/proloyalty/legacy/presentation/screen/editorder/EditOrderView$Model;)V", 4);
        }
    }

    /* synthetic */ class nufgyqmvbu implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {
        nufgyqmvbu() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(cqumvgiudr cqumvgiudrVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objBfopjjpdmp = EditOrderFragment.bfopjjpdmp(EditOrderFragment.this, cqumvgiudrVar, gxszxtbevoVar);
            return objBfopjjpdmp == mg.zoijcleaow.gxszxtbevo() ? objBfopjjpdmp : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, EditOrderFragment.this, EditOrderFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/proloyalty/legacy/presentation/screen/editorder/EditOrderView$UiLabel;)Lkotlin/Unit;", 12);
        }
    }

    public static final class ojitshcjhn implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96737jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96738yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96739zdlpuopuiu;

        public ojitshcjhn(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f96739zdlpuopuiu = jpowsppfyaVar;
            this.f96738yggfygwlhe = j13;
            this.f96737jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96739zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96738yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f96737jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.zoijcleaow.f96830iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm implements zynmafqrjb, kotlin.jvm.internal.agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final /* synthetic */ tg.draadjrbmk f96740zdlpuopuiu;

        oxmwwwfdhm(tg.draadjrbmk function) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(function, "function");
            this.f96740zdlpuopuiu = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof zynmafqrjb) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // androidx.lifecycle.zynmafqrjb
        public final /* synthetic */ void iobyxmoadg(Object obj) {
            this.f96740zdlpuopuiu.invoke(obj);
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return this.f96740zdlpuopuiu;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f96741zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, z41.yggfygwlhe.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/FragmentEditOrderProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final z41.yggfygwlhe invoke(View p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return z41.yggfygwlhe.iobyxmoadg(p13);
        }
    }

    public static final class rgvfuqvkyq implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96742jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96743yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96744zdlpuopuiu;

        public rgvfuqvkyq(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f96744zdlpuopuiu = jpowsppfyaVar;
            this.f96743yggfygwlhe = j13;
            this.f96742jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96744zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96743yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f96742jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.lqeggnwhkg.f96823iobyxmoadg);
        }
    }

    public static final class vdvldrhtss extends df.wkgbmnqykc {
        vdvldrhtss(final EditOrderFragment editOrderFragment, androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
            df.ppxfxbqfkf ppxfxbqfkfVar = this.f27903iobyxmoadg;
            df.zoijcleaow zoijcleaowVarWkgbmnqykc = at0.wkgbmnqykc.wkgbmnqykc(new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.draadjrbmk
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.vdvldrhtss.draadjrbmk((CartProductUiModel) obj);
                }
            }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return EditOrderFragment.vdvldrhtss.wflxmlrfwp(editOrderFragment, (HintUiModel) obj, (CartProductUiModel) obj2);
                }
            }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.agtfadlqog
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.vdvldrhtss.agtfadlqog((CartProductUiModel) obj);
                }
            }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.ojitshcjhn
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.vdvldrhtss.ojitshcjhn((CartProductUiModel) obj);
                }
            }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.rgvfuqvkyq
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.vdvldrhtss.rgvfuqvkyq(editOrderFragment, (CartProductUiModel) obj);
                }
            }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.vdvldrhtss
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return EditOrderFragment.vdvldrhtss.vdvldrhtss(editOrderFragment, (CartProductUiModel) obj, (ProductCardEvent) obj2);
                }
            }, false, false, true, editOrderFragment.isRemoveLoading, false, (6144 & 2048) != 0 ? 2 : 0, (6144 & 4096) != 0 ? js0.zoijcleaow.FULL : null);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zoijcleaowVarWkgbmnqykc, "null cannot be cast to non-null type com.hannesdorfmann.adapterdelegates4.AdapterDelegate<kotlin.collections.MutableList<ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel>>");
            ppxfxbqfkfVar.ppxfxbqfkf(zoijcleaowVarWkgbmnqykc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn agtfadlqog(CartProductUiModel it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn draadjrbmk(CartProductUiModel it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ojitshcjhn(CartProductUiModel it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn rgvfuqvkyq(EditOrderFragment editOrderFragment, CartProductUiModel it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            editOrderFragment.wwaezpbzkn().weqkydbzbr(new ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.gtknphoqwx(it));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn vdvldrhtss(EditOrderFragment editOrderFragment, CartProductUiModel product, ProductCardEvent productCardEvent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            editOrderFragment.wwaezpbzkn().weqkydbzbr(new ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.btonecajqb(product, productCardEvent));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn wflxmlrfwp(EditOrderFragment editOrderFragment, HintUiModel hint, CartProductUiModel product) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            editOrderFragment.fiwbwshyhd(hint, product);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f96745jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96746yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96747zdlpuopuiu;

        public wflxmlrfwp(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f96747zdlpuopuiu = jpowsppfyaVar;
            this.f96746yggfygwlhe = j13;
            this.f96745jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96747zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96746yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f96745jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.agtfadlqog.f96814iobyxmoadg);
        }
    }

    static final class wkgbmnqykc implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk f96748yggfygwlhe;

        static final class iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk f96750zdlpuopuiu;

            iobyxmoadg(ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk iwizpuwonkVar) {
                this.f96750zdlpuopuiu = iwizpuwonkVar;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-610325495, i13, -1, "ru.myspar.proloyalty.legacy.presentation.screen.editorder.EditOrderFragment.handleState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditOrderFragment.kt:232)");
                }
                us0.wkgbmnqykc.zoijcleaow(this.f96750zdlpuopuiu.yggfygwlhe(), androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), null, null, 0L, 0L, draadjrbmkVar, 48, 60);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        wkgbmnqykc(ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk iwizpuwonkVar) {
            this.f96748yggfygwlhe = iwizpuwonkVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1997221828, i13, -1, "ru.myspar.proloyalty.legacy.presentation.screen.editorder.EditOrderFragment.handleState.<anonymous>.<anonymous>.<anonymous> (EditOrderFragment.kt:229)");
            }
            Context contextRequireContext = EditOrderFragment.this.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            l41.zoijcleaow.zoijcleaow(p41.ppxfxbqfkf.eablkybsjg(contextRequireContext) ? l41.nufgyqmvbu.Dark : l41.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-610325495, true, new iobyxmoadg(this.f96748yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class yggfygwlhe extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f96751zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yggfygwlhe(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f96751zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f96751zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class zdlpuopuiu extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f96752zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f96752zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f96752zdlpuopuiu.invoke();
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f96753iobyxmoadg;

        static {
            int[] iArr = new int[ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg.values().length];
            try {
                iArr[ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg.APPLIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg.NOT_APPLIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96753iobyxmoadg = iArr;
        }
    }

    public EditOrderFragment() {
        super(vk0.eablkybsjg.fragment_edit_order_proloyalty);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.fyldjkxazc(this.f96937zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new zdlpuopuiu(new kcexrzcfyt(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(lereixgezr.class), new yggfygwlhe(gtknphoqwxVarIobyxmoadg), new jyumaefscl(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, ppxfxbqfkf.f96741zdlpuopuiu);
        this.isRemoveLoading = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
        this.productAdapter = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.iyctptxqzt(this.f96781zdlpuopuiu);
            }
        });
        this.payload = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.opjhrmiecq(this.f96784zdlpuopuiu);
            }
        });
    }

    private final void ageimvtcrz() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ow0.nufgyqmvbu.iobyxmoadg.wflxmlrfwp(new ow0.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null).agtfadlqog(vk0.lqeggnwhkg.proloyalty_order_edit_limit_time_title).lqeggnwhkg(vk0.lqeggnwhkg.proloyalty_order_edit_limit_time_message), vk0.lqeggnwhkg.proloyalty_order_edit_limit_time_positive, null, 2, null).zoijcleaow().show();
    }

    private final void auzgnhcxok(EditText editText, String value) {
        Editable text = editText.getText();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(text != null ? text.toString() : null, value)) {
            return;
        }
        editText.setText(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object bfopjjpdmp(EditOrderFragment editOrderFragment, cqumvgiudr cqumvgiudrVar, lg.gxszxtbevo gxszxtbevoVar) {
        editOrderFragment.ydmasvzmpa(cqumvgiudrVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dvvnrvtcbc(EditOrderFragment editOrderFragment) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.gxszxtbevo.f96821iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd(HintUiModel hint, CartProductUiModel product) {
        HintDialogAnalyticsInfo hintDialogAnalyticsInfo = new HintDialogAnalyticsInfo(new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), new AnalyticsPage.OrderEdit(metgxyhuhe().getOrderId()), null, 4, null);
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        ms0.zoijcleaow.iobyxmoadg(hint, hintDialogAnalyticsInfo, oxmwwwfdhmVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf fyldjkxazc(EditOrderFragment editOrderFragment) {
        return editOrderFragment.new iwizpuwonk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hszhottldk(EditOrderFragment editOrderFragment) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.eablkybsjg.f96819iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn igdgnonuha(EditOrderFragment editOrderFragment) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.iobyxmoadg.f96822iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final wwaezpbzkn ikoacuggdj() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String string = context.getString(vk0.lqeggnwhkg.proloyalty_notification_channel_name);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        String string2 = context.getString(vk0.lqeggnwhkg.proloyalty_notification_channel_description);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "getString(...)");
        NotificationChannel notificationChannel = new NotificationChannel("EditOrderNotificationChannel", string, 4);
        notificationChannel.setDescription(string2);
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void iwxlajgraz() {
        ow0.iobyxmoadg iobyxmoadgVar = new ow0.iobyxmoadg(ow0.zoijcleaow.PRIMARY, Integer.valueOf(vk0.lqeggnwhkg.proloyalty_order_edit_products_action_continue), null, null, 12, null);
        ow0.iobyxmoadg iobyxmoadgVar2 = new ow0.iobyxmoadg(ow0.zoijcleaow.SECONDARY, Integer.valueOf(vk0.lqeggnwhkg.proloyalty_order_edit_products_action_cancel), null, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.dvvnrvtcbc(this.f96769zdlpuopuiu);
            }
        }, 4, null);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new ow0.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null).agtfadlqog(vk0.lqeggnwhkg.proloyalty_order_edit_products_waring_title).lqeggnwhkg(vk0.lqeggnwhkg.proloyalty_order_edit_products_last_product_waring_message).iobyxmoadg(iobyxmoadgVar).iobyxmoadg(iobyxmoadgVar2).ppxfxbqfkf(ow0.ppxfxbqfkf.VERTICAL).zoijcleaow().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vdvldrhtss iyctptxqzt(EditOrderFragment editOrderFragment) {
        return new vdvldrhtss(editOrderFragment, ea1.iobyxmoadg.iobyxmoadg());
    }

    private final void jhduphickx(LocalDateTime dateTime) {
        ikoacuggdj();
        nuxfzjnpeb(dateTime);
    }

    private final void lrnfpwlwnk(long endNotificationTime) {
        g6.cqumvgiudr cqumvgiudrVar = (g6.cqumvgiudr) ((g6.cqumvgiudr.iobyxmoadg) ((g6.cqumvgiudr.iobyxmoadg) ((g6.cqumvgiudr.iobyxmoadg) new g6.cqumvgiudr.iobyxmoadg(OrderEditNotificationWorker.class).gtknphoqwx(endNotificationTime, TimeUnit.SECONDS)).draadjrbmk(new androidx.work.zoijcleaow.iobyxmoadg().eablkybsjg("PARAM_IS_END", true).lqeggnwhkg("PARAM_ORDER_ID", metgxyhuhe().getOrderId()).iobyxmoadg())).iobyxmoadg("END_EDIT_WORK_TAG")).zoijcleaow();
        Context context = getContext();
        if (context != null) {
            g6.cllcsxoeiz.iobyxmoadg iobyxmoadgVar = g6.cllcsxoeiz.f36369iobyxmoadg;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext, "getApplicationContext(...)");
            g6.cllcsxoeiz cllcsxoeizVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(applicationContext);
            cllcsxoeizVarIobyxmoadg.gxszxtbevo("END_EDIT_WORK_TAG", g6.dxjokdxxww.KEEP, cqumvgiudrVar);
            cllcsxoeizVarIobyxmoadg.dxjokdxxww(cqumvgiudrVar.iobyxmoadg()).dxjokdxxww(this, new oxmwwwfdhm(new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.lqeggnwhkg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.zeieaojujs(this.f96931zdlpuopuiu, (hkdspvbjdz) obj);
                }
            }));
        }
    }

    private final void lxfrhoxuzk() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        fa1.eablkybsjg.iobyxmoadg.gxszxtbevo(new fa1.eablkybsjg.iobyxmoadg(contextRequireContext).nufgyqmvbu(vk0.lqeggnwhkg.proloyalty_title_edit_order).zoijcleaow(vk0.lqeggnwhkg.proloyalty_msg_save_changed_warning).lqeggnwhkg(vk0.lqeggnwhkg.proloyalty_action_save_edit_and_exit, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.wizcaqwiak(this.f96932zdlpuopuiu);
            }
        }), vk0.lqeggnwhkg.proloyalty_action_continue_edit_order, null, 2, null).wkgbmnqykc(vk0.lqeggnwhkg.proloyalty_action_cancel_edit_and_exit, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.hszhottldk(this.f96780zdlpuopuiu);
            }
        }).iobyxmoadg().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditOrderPayload metgxyhuhe() {
        return (EditOrderPayload) this.payload.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.time.LocalDateTime, java.time.temporal.Temporal] */
    private final void nuxfzjnpeb(LocalDateTime editOrderExpirationTime) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        ?? localDateTime = editOrderExpirationTime.atZone(ZoneId.of("Europe/Moscow")).withZoneSameInstant(zoneIdSystemDefault).toLocalDateTime();
        ChronoUnit chronoUnit = ChronoUnit.SECONDS;
        long jBetween = chronoUnit.between(localDateTimeNow, localDateTime.minusMinutes(1L));
        lrnfpwlwnk(chronoUnit.between(localDateTimeNow, localDateTime));
        tbqsvytpvh(jBetween);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object oipsdeybqn(EditOrderFragment editOrderFragment, ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
        editOrderFragment.yfnezrywwk(iwizpuwonkVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final wwaezpbzkn okpsazkaxt() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        g6.cllcsxoeiz.iobyxmoadg iobyxmoadgVar = g6.cllcsxoeiz.f36369iobyxmoadg;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext, "getApplicationContext(...)");
        g6.cllcsxoeiz cllcsxoeizVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(applicationContext);
        cllcsxoeizVarIobyxmoadg.iobyxmoadg("BEFORE_END_EDIT_WORK_TAG");
        cllcsxoeizVarIobyxmoadg.iobyxmoadg("END_EDIT_WORK_TAG");
        androidx.core.app.rgvfuqvkyq rgvfuqvkyqVarWkgbmnqykc = androidx.core.app.rgvfuqvkyq.wkgbmnqykc(context);
        rgvfuqvkyqVarWkgbmnqykc.zoijcleaow(12415812);
        rgvfuqvkyqVarWkgbmnqykc.zoijcleaow(12415813);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditOrderPayload opjhrmiecq(EditOrderFragment editOrderFragment) {
        Parcelable parcelable = editOrderFragment.requireArguments().getParcelable("payload");
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(parcelable);
        return (EditOrderPayload) parcelable;
    }

    private final vdvldrhtss rlfsiqarku() {
        return (vdvldrhtss) this.productAdapter.getValue();
    }

    private final void roivzttewh(String promo, ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg status) {
        TextInputEditText etPromocode = xrmfcynszj().f128524lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(etPromocode, "etPromocode");
        auzgnhcxok(etPromocode, promo);
        z41.yggfygwlhe yggfygwlheVarXrmfcynszj = xrmfcynszj();
        MaterialTextView tvPromocodeStatus = yggfygwlheVarXrmfcynszj.f128518jpowsppfya;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvPromocodeStatus, "tvPromocodeStatus");
        tvPromocodeStatus.setVisibility(status == ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg.NOT_ENTERED ? 4 : 0);
        TextInputEditText etPromocode2 = yggfygwlheVarXrmfcynszj.f128524lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(etPromocode2, "etPromocode");
        etPromocode2.setPadding(etPromocode2.getPaddingLeft(), etPromocode2.getPaddingTop(), yggfygwlheVarXrmfcynszj.f128533vdvldrhtss.getWidth() + 12, etPromocode2.getPaddingBottom());
        int i13 = zoijcleaow.f96753iobyxmoadg[status.ordinal()];
        if (i13 == 1) {
            uawqvzlxes(vk0.lqeggnwhkg.proloyalty_order_edit_promocode_applied, b31.ppxfxbqfkf.colorPrimary1);
        } else {
            if (i13 != 2) {
                return;
            }
            uawqvzlxes(vk0.lqeggnwhkg.proloyalty_not_applied, b31.ppxfxbqfkf.colorSecondary1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn sflfametgt(EditOrderFragment editOrderFragment) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.wkgbmnqykc.f96829iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new ow0.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null).lqeggnwhkg(vk0.lqeggnwhkg.proloyalty_order_edit_end_time_message).draadjrbmk(vk0.lqeggnwhkg.proloyalty_order_edit_end_time_positive, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.igdgnonuha(this.f96783zdlpuopuiu);
            }
        }).zoijcleaow().show();
    }

    private final void tbqsvytpvh(long oneMinuteNotificationTime) {
        g6.cqumvgiudr cqumvgiudrVar = (g6.cqumvgiudr) ((g6.cqumvgiudr.iobyxmoadg) ((g6.cqumvgiudr.iobyxmoadg) ((g6.cqumvgiudr.iobyxmoadg) new g6.cqumvgiudr.iobyxmoadg(OrderEditNotificationWorker.class).gtknphoqwx(oneMinuteNotificationTime, TimeUnit.SECONDS)).draadjrbmk(new androidx.work.zoijcleaow.iobyxmoadg().eablkybsjg("PARAM_IS_END", false).iobyxmoadg())).iobyxmoadg("BEFORE_END_EDIT_WORK_TAG")).zoijcleaow();
        Context context = getContext();
        if (context != null) {
            g6.cllcsxoeiz.iobyxmoadg iobyxmoadgVar = g6.cllcsxoeiz.f36369iobyxmoadg;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext, "getApplicationContext(...)");
            iobyxmoadgVar.iobyxmoadg(applicationContext).gxszxtbevo("BEFORE_END_EDIT_WORK_TAG", g6.dxjokdxxww.KEEP, cqumvgiudrVar);
        }
    }

    private final void uawqvzlxes(int title, int tint) {
        z41.yggfygwlhe yggfygwlheVarXrmfcynszj = xrmfcynszj();
        yggfygwlheVarXrmfcynszj.f128518jpowsppfya.setText(title);
        MaterialTextView materialTextView = yggfygwlheVarXrmfcynszj.f128518jpowsppfya;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        materialTextView.setTextColor(p41.ppxfxbqfkf.ppxfxbqfkf(contextRequireContext, tint));
    }

    private final void weqkydbzbr() {
        View currentFocus = requireActivity().getWindow().getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        xrmfcynszj().getRoot().requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wizcaqwiak(EditOrderFragment editOrderFragment) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.rgvfuqvkyq.f96827iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final z41.yggfygwlhe xrmfcynszj() {
        return (z41.yggfygwlhe) this.binding.iobyxmoadg(this, f96693lmojexxdyd[0]);
    }

    private final wwaezpbzkn ydmasvzmpa(cqumvgiudr uiLabel) {
        if (uiLabel instanceof cqumvgiudr.wkgbmnqykc) {
            lxfrhoxuzk();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (uiLabel instanceof cqumvgiudr.iobyxmoadg) {
            return okpsazkaxt();
        }
        if (uiLabel instanceof cqumvgiudr.btonecajqb) {
            jhduphickx(((cqumvgiudr.btonecajqb) uiLabel).iobyxmoadg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (uiLabel instanceof cqumvgiudr.lqeggnwhkg) {
            a31.iobyxmoadg.eablkybsjg(czzsidtyhn(), vk0.lqeggnwhkg.proloyalty_order_edit_temp_saved_message);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (uiLabel instanceof cqumvgiudr.ppxfxbqfkf) {
            iwxlajgraz();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, cqumvgiudr.zoijcleaow.f96779iobyxmoadg)) {
            weqkydbzbr();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, cqumvgiudr.eablkybsjg.f96772iobyxmoadg)) {
            ageimvtcrz();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (uiLabel instanceof cqumvgiudr.nufgyqmvbu) {
            a31.iobyxmoadg.dxjokdxxww(czzsidtyhn(), ((cqumvgiudr.nufgyqmvbu) uiLabel).iobyxmoadg(), null, null, 6, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (uiLabel instanceof cqumvgiudr.dxjokdxxww) {
            a31.iobyxmoadg.btonecajqb(czzsidtyhn(), ((cqumvgiudr.dxjokdxxww) uiLabel).iobyxmoadg(), null, null, 6, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, cqumvgiudr.gxszxtbevo.f96773iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        a31.iobyxmoadg.ppxfxbqfkf(czzsidtyhn(), vk0.lqeggnwhkg.proloyalty_product_not_available, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yfnezrywwk(ru.myspar.proloyalty.legacy.presentation.screen.editorder.iwizpuwonk state) {
        this.isRemoveLoading.setValue(Boolean.valueOf(state.cqumvgiudr()));
        z41.yggfygwlhe yggfygwlheVarXrmfcynszj = xrmfcynszj();
        yggfygwlheVarXrmfcynszj.f128511gxszxtbevo.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1997221828, true, new wkgbmnqykc(state)));
        yggfygwlheVarXrmfcynszj.f128523lmojexxdyd.setText(state.gtknphoqwx());
        yggfygwlheVarXrmfcynszj.f128513hkdspvbjdz.setText(state.nufgyqmvbu());
        MaterialTextView tvReceiver = yggfygwlheVarXrmfcynszj.f128513hkdspvbjdz;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvReceiver, "tvReceiver");
        tvReceiver.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(state.nufgyqmvbu()) ? 0 : 8);
        yggfygwlheVarXrmfcynszj.f128512hcddaimhww.setText(state.vdvldrhtss());
        MaterialTextView tvPhone = yggfygwlheVarXrmfcynszj.f128512hcddaimhww;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvPhone, "tvPhone");
        tvPhone.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(state.vdvldrhtss()) ? 0 : 8);
        yggfygwlheVarXrmfcynszj.f128539yggfygwlhe.setText(state.lqeggnwhkg());
        MaterialTextView tvEmail = yggfygwlheVarXrmfcynszj.f128539yggfygwlhe;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvEmail, "tvEmail");
        tvEmail.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(state.lqeggnwhkg()) ? 0 : 8);
        yggfygwlheVarXrmfcynszj.f128517iwizpuwonk.setText(state.dxjokdxxww());
        yggfygwlheVarXrmfcynszj.f128531rgvfuqvkyq.setText(state.wkgbmnqykc());
        yggfygwlheVarXrmfcynszj.f128538yadqdtsiqt.setText(state.btonecajqb());
        yggfygwlheVarXrmfcynszj.f128506dsvhmnatus.setText(state.draadjrbmk());
        yggfygwlheVarXrmfcynszj.f128540ylkuphrtab.setText(state.ojitshcjhn());
        rlfsiqarku().wkgbmnqykc(state.oxmwwwfdhm());
        yggfygwlheVarXrmfcynszj.f128537wypolnanlu.setText(state.iwizpuwonk());
        yggfygwlheVarXrmfcynszj.f128527oxmwwwfdhm.setText(state.ppxfxbqfkf());
        MaterialTextView tvComment = yggfygwlheVarXrmfcynszj.f128527oxmwwwfdhm;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvComment, "tvComment");
        tvComment.setVisibility(mj.kcexrzcfyt.zfvoamnweg(state.ppxfxbqfkf()) ? 8 : 0);
        roivzttewh(state.kcexrzcfyt(), state.zdlpuopuiu());
        ComposeView clLoading = yggfygwlheVarXrmfcynszj.f128535wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, state.cqumvgiudr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zeieaojujs(EditOrderFragment editOrderFragment, hkdspvbjdz hkdspvbjdzVar) {
        if ((hkdspvbjdzVar != null ? hkdspvbjdzVar.iobyxmoadg() : null) == hkdspvbjdz.ppxfxbqfkf.SUCCEEDED) {
            editOrderFragment.skhdrjzrfn();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zfvoamnweg(EditOrderFragment editOrderFragment, CharSequence charSequence) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(new ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.draadjrbmk(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final z21.iobyxmoadg czzsidtyhn() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        wwaezpbzkn().weqkydbzbr(ru.myspar.proloyalty.legacy.presentation.screen.editorder.jyumaefscl.wkgbmnqykc.f96829iobyxmoadg);
        return true;
    }

    public final iobyxmoadg jztzpxfvev() {
        iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        z41.yggfygwlhe yggfygwlheVarXrmfcynszj = xrmfcynszj();
        ComposeView cvActionBar = yggfygwlheVarXrmfcynszj.f128508eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = getString(vk0.lqeggnwhkg.proloyalty_title_edit_order);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.sflfametgt(this.f96939zdlpuopuiu);
            }
        }, null, null, 109, null);
        MaterialTextView tvReceiverEdit = yggfygwlheVarXrmfcynszj.f128503cllcsxoeiz;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvReceiverEdit, "tvReceiverEdit");
        tvReceiverEdit.setOnClickListener(new dxjokdxxww(new jpowsppfya(), 400L, this));
        MaterialTextView tvIntervalEdit = yggfygwlheVarXrmfcynszj.f128515iozdgvuglv;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvIntervalEdit, "tvIntervalEdit");
        tvIntervalEdit.setOnClickListener(new btonecajqb(new jpowsppfya(), 400L, this));
        MaterialTextView tvPaymentEdit = yggfygwlheVarXrmfcynszj.f128528pkzmftpjix;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvPaymentEdit, "tvPaymentEdit");
        tvPaymentEdit.setOnClickListener(new gtknphoqwx(new jpowsppfya(), 400L, this));
        TextInputEditText etPromocode = yggfygwlheVarXrmfcynszj.f128524lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(etPromocode, "etPromocode");
        bc1.lqeggnwhkg.iobyxmoadg(etPromocode, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return EditOrderFragment.zfvoamnweg(this.f96933zdlpuopuiu, (CharSequence) obj);
            }
        });
        MaterialTextView tvApplyPromocode = yggfygwlheVarXrmfcynszj.f128533vdvldrhtss;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvApplyPromocode, "tvApplyPromocode");
        tvApplyPromocode.setOnClickListener(new draadjrbmk(new jpowsppfya(), 400L, this));
        MaterialButton btnCancel = yggfygwlheVarXrmfcynszj.f128542zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnCancel, "btnCancel");
        btnCancel.setOnClickListener(new wflxmlrfwp(new jpowsppfya(), 400L, this));
        MaterialButton btnSave = yggfygwlheVarXrmfcynszj.f128530ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnSave, "btnSave");
        btnSave.setOnClickListener(new agtfadlqog(new jpowsppfya(), 400L, this));
        MaterialButton tvAddFromCatalog = yggfygwlheVarXrmfcynszj.f128526ojitshcjhn;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvAddFromCatalog, "tvAddFromCatalog");
        tvAddFromCatalog.setOnClickListener(new ojitshcjhn(new jpowsppfya(), 400L, this));
        MaterialTextView tvCommentEdit = yggfygwlheVarXrmfcynszj.f128520kcexrzcfyt;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvCommentEdit, "tvCommentEdit");
        tvCommentEdit.setOnClickListener(new rgvfuqvkyq(new jpowsppfya(), 400L, this));
        RecyclerView recyclerView = yggfygwlheVarXrmfcynszj.f128534wflxmlrfwp;
        c31.zoijcleaow.iobyxmoadg iobyxmoadgVar = c31.zoijcleaow.f18695lqeggnwhkg;
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        recyclerView.btonecajqb(iobyxmoadgVar.iobyxmoadg(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView);
        r41.zoijcleaow.ppxfxbqfkf(recyclerView, rlfsiqarku(), xrmfcynszj());
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new eablkybsjg(this, zoijcleaowVar, null, this), 3, null);
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner2), null, null, new gxszxtbevo(this, zoijcleaowVar, null, this), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public lereixgezr wwaezpbzkn() {
        return (lereixgezr) this.viewModel.getValue();
    }
}
