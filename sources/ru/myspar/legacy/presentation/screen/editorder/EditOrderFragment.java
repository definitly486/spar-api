package ru.myspar.legacy.presentation.screen.editorder;

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
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001a\b\u0007\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001lB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u001f\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\u00020\b2\b\b\u0001\u0010+\u001a\u00020*2\b\b\u0001\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0005J\u000f\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010\u0005J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0005J\u001f\u00107\u001a\u00020\b2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J!\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AR\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020?0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010S\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010S\u001a\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lru/myspar/legacy/presentation/screen/editorder/EditOrderFragment;", "Lru/myspar/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/legacy/presentation/screen/editorder/lereixgezr;", "Le40/iobyxmoadg;", "<init>", "()V", "Lru/myspar/legacy/presentation/screen/editorder/cqumvgiudr;", "uiLabel", "Lgg/wwaezpbzkn;", "ydmasvzmpa", "(Lru/myspar/legacy/presentation/screen/editorder/cqumvgiudr;)Lgg/wwaezpbzkn;", "weqkydbzbr", "Lru/myspar/legacy/presentation/screen/editorder/iwizpuwonk;", "state", "yfnezrywwk", "(Lru/myspar/legacy/presentation/screen/editorder/iwizpuwonk;)V", "Ljava/time/LocalDateTime;", "dateTime", "jhduphickx", "(Ljava/time/LocalDateTime;)V", "okpsazkaxt", "()Lgg/wwaezpbzkn;", "editOrderExpirationTime", "nuxfzjnpeb", "", "endNotificationTime", "lrnfpwlwnk", "(J)V", "oneMinuteNotificationTime", "tbqsvytpvh", "ikoacuggdj", "", "promo", "Lru/myspar/legacy/presentation/screen/editorder/iwizpuwonk$iobyxmoadg;", "status", "roivzttewh", "(Ljava/lang/String;Lru/myspar/legacy/presentation/screen/editorder/iwizpuwonk$iobyxmoadg;)V", "Landroid/widget/EditText;", "editText", "value", "auzgnhcxok", "(Landroid/widget/EditText;Ljava/lang/String;)V", "", "title", "tint", "uawqvzlxes", "(II)V", "iwxlajgraz", "lxfrhoxuzk", "skhdrjzrfn", "ageimvtcrz", "Lru/myspar/common/view/hint/model/HintUiModel;", "hint", "Lru/myspar/common/view/product/model/cart/CartProductUiModel;", "product", "fiwbwshyhd", "(Lru/myspar/common/view/hint/model/HintUiModel;Lru/myspar/common/view/product/model/cart/CartProductUiModel;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "gxszxtbevo", "()Z", "Lru/myspar/legacy/presentation/screen/editorder/iobyxmoadg;", "esjtqupxsv", "Lru/myspar/legacy/presentation/screen/editorder/iobyxmoadg;", "jztzpxfvev", "()Lru/myspar/legacy/presentation/screen/editorder/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/legacy/presentation/screen/editorder/iobyxmoadg;)V", "assistedFactory", "Lq40/iobyxmoadg;", "lereixgezr", "Lq40/iobyxmoadg;", "czzsidtyhn", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "pmvmpeiblj", "Lgg/gtknphoqwx;", "uwvvkdfqfp", "()Lru/myspar/legacy/presentation/screen/editorder/lereixgezr;", "viewModel", "Lm60/lereixgezr;", "zynmafqrjb", "Lys/ppxfxbqfkf;", "xrmfcynszj", "()Lm60/lereixgezr;", "binding", "Landroidx/compose/runtime/iwxlajgraz;", "istkbnxepw", "Landroidx/compose/runtime/iwxlajgraz;", "isRemoveLoading", "ru/myspar/legacy/presentation/screen/editorder/EditOrderFragment$vdvldrhtss", "cdpycssgdh", "rlfsiqarku", "()Lru/myspar/legacy/presentation/screen/editorder/EditOrderFragment$vdvldrhtss;", "productAdapter", "Lru/myspar/core/domain/models/payload/EditOrderPayload;", "yadqdtsiqt", "metgxyhuhe", "()Lru/myspar/core/domain/models/payload/EditOrderPayload;", "payload", "iozdgvuglv", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EditOrderFragment extends Hilt_EditOrderFragment<lereixgezr> implements e40.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx productAdapter;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final iwxlajgraz isRemoveLoading;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx payload;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f88909lmojexxdyd = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(EditOrderFragment.class, "binding", "getBinding()Lru/myspar/databinding/FragmentEditOrderBinding;", 0))};

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final int f88910wwaezpbzkn = 8;

    public static final class agtfadlqog implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f88918jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88919yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88920zdlpuopuiu;

        public agtfadlqog(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f88920zdlpuopuiu = jpowsppfyaVar;
            this.f88919yggfygwlhe = j13;
            this.f88918jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88920zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88919yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f88918jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.ojitshcjhn.f89041iobyxmoadg);
        }
    }

    public static final class btonecajqb implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f88921jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88922yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88923zdlpuopuiu;

        public btonecajqb(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f88923zdlpuopuiu = jpowsppfyaVar;
            this.f88922yggfygwlhe = j13;
            this.f88921jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88923zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88922yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f88921jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.nufgyqmvbu.f89040iobyxmoadg);
        }
    }

    public static final class draadjrbmk implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f88924jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88925yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88926zdlpuopuiu;

        public draadjrbmk(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f88926zdlpuopuiu = jpowsppfyaVar;
            this.f88925yggfygwlhe = j13;
            this.f88924jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88926zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88925yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f88924jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.ppxfxbqfkf.f89042iobyxmoadg);
        }
    }

    public static final class dxjokdxxww implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f88927jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88928yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88929zdlpuopuiu;

        public dxjokdxxww(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f88929zdlpuopuiu = jpowsppfyaVar;
            this.f88928yggfygwlhe = j13;
            this.f88927jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88929zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88928yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f88927jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.wflxmlrfwp.f89044iobyxmoadg);
        }
    }

    public static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f88930iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f88931jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f88932yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88933zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ EditOrderFragment f88934jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f88935yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f88936zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, EditOrderFragment editOrderFragment) {
                super(2, gxszxtbevoVar);
                this.f88934jyumaefscl = editOrderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f88934jyumaefscl);
                iobyxmoadgVar.f88935yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f88936zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    wypolnanlu state = this.f88934jyumaefscl.wwaezpbzkn().getState();
                    lqeggnwhkg lqeggnwhkgVar = this.f88934jyumaefscl.new lqeggnwhkg();
                    this.f88936zdlpuopuiu = 1;
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
            this.f88932yggfygwlhe = fragment;
            this.f88931jyumaefscl = zoijcleaowVar;
            this.f88930iwizpuwonk = editOrderFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f88932yggfygwlhe, this.f88931jyumaefscl, gxszxtbevoVar, this.f88930iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88933zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f88932yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f88931jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f88930iwizpuwonk);
                this.f88933zdlpuopuiu = 1;
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
        final /* synthetic */ EditOrderFragment f88937jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88938yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88939zdlpuopuiu;

        public gtknphoqwx(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f88939zdlpuopuiu = jpowsppfyaVar;
            this.f88938yggfygwlhe = j13;
            this.f88937jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88939zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88938yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f88937jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.dxjokdxxww.f89034iobyxmoadg);
        }
    }

    public static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f88940iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f88941jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f88942yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88943zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ EditOrderFragment f88944jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f88945yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f88946zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, EditOrderFragment editOrderFragment) {
                super(2, gxszxtbevoVar);
                this.f88944jyumaefscl = editOrderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f88944jyumaefscl);
                iobyxmoadgVar.f88945yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f88946zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = this.f88944jyumaefscl.wwaezpbzkn().draadjrbmk();
                    nufgyqmvbu nufgyqmvbuVar = this.f88944jyumaefscl.new nufgyqmvbu();
                    this.f88946zdlpuopuiu = 1;
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
            this.f88942yggfygwlhe = fragment;
            this.f88941jyumaefscl = zoijcleaowVar;
            this.f88940iwizpuwonk = editOrderFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f88942yggfygwlhe, this.f88941jyumaefscl, gxszxtbevoVar, this.f88940iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88943zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f88942yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f88941jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f88940iwizpuwonk);
                this.f88943zdlpuopuiu = 1;
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

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.editorder.EditOrderFragment$iobyxmoadg, reason: from kotlin metadata */
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
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(lereixgezrVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return lereixgezrVarIobyxmoadg;
        }
    }

    public static final class jyumaefscl extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f88948yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88949zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88949zdlpuopuiu = iobyxmoadgVar;
            this.f88948yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f88949zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88948yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class kcexrzcfyt extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88950zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(Fragment fragment) {
            super(0);
            this.f88950zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f88950zdlpuopuiu;
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
        public final Object emit(ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objOipsdeybqn = EditOrderFragment.oipsdeybqn(EditOrderFragment.this, iwizpuwonkVar, gxszxtbevoVar);
            return objOipsdeybqn == mg.zoijcleaow.gxszxtbevo() ? objOipsdeybqn : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, EditOrderFragment.this, EditOrderFragment.class, "handleState", "handleState(Lru/myspar/legacy/presentation/screen/editorder/EditOrderView$Model;)V", 4);
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
            return new kotlin.jvm.internal.iobyxmoadg(2, EditOrderFragment.this, EditOrderFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/legacy/presentation/screen/editorder/EditOrderView$UiLabel;)Lkotlin/Unit;", 12);
        }
    }

    public static final class ojitshcjhn implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f88953jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88954yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88955zdlpuopuiu;

        public ojitshcjhn(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f88955zdlpuopuiu = jpowsppfyaVar;
            this.f88954yggfygwlhe = j13;
            this.f88953jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88955zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88954yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f88953jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.zoijcleaow.f89046iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm implements zynmafqrjb, kotlin.jvm.internal.agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final /* synthetic */ tg.draadjrbmk f88956zdlpuopuiu;

        oxmwwwfdhm(tg.draadjrbmk function) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(function, "function");
            this.f88956zdlpuopuiu = function;
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
            this.f88956zdlpuopuiu.invoke(obj);
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return this.f88956zdlpuopuiu;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f88957zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, m60.lereixgezr.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/FragmentEditOrderBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final m60.lereixgezr invoke(View p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return m60.lereixgezr.iobyxmoadg(p13);
        }
    }

    public static final class rgvfuqvkyq implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ EditOrderFragment f88958jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88959yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88960zdlpuopuiu;

        public rgvfuqvkyq(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f88960zdlpuopuiu = jpowsppfyaVar;
            this.f88959yggfygwlhe = j13;
            this.f88958jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88960zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88959yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f88958jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.lqeggnwhkg.f89039iobyxmoadg);
        }
    }

    public static final class vdvldrhtss extends df.wkgbmnqykc {
        vdvldrhtss(final EditOrderFragment editOrderFragment, androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
            df.ppxfxbqfkf ppxfxbqfkfVar = this.f27903iobyxmoadg;
            df.zoijcleaow zoijcleaowVarWkgbmnqykc = gu.wkgbmnqykc.wkgbmnqykc(new tg.draadjrbmk() { // from class: ru.myspar.legacy.presentation.screen.editorder.draadjrbmk
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.vdvldrhtss.draadjrbmk((CartProductUiModel) obj);
                }
            }, new tg.rgvfuqvkyq() { // from class: ru.myspar.legacy.presentation.screen.editorder.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return EditOrderFragment.vdvldrhtss.wflxmlrfwp(editOrderFragment, (HintUiModel) obj, (CartProductUiModel) obj2);
                }
            }, new tg.draadjrbmk() { // from class: ru.myspar.legacy.presentation.screen.editorder.agtfadlqog
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.vdvldrhtss.agtfadlqog((CartProductUiModel) obj);
                }
            }, new tg.draadjrbmk() { // from class: ru.myspar.legacy.presentation.screen.editorder.ojitshcjhn
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.vdvldrhtss.ojitshcjhn((CartProductUiModel) obj);
                }
            }, new tg.draadjrbmk() { // from class: ru.myspar.legacy.presentation.screen.editorder.rgvfuqvkyq
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.vdvldrhtss.rgvfuqvkyq(editOrderFragment, (CartProductUiModel) obj);
                }
            }, new tg.rgvfuqvkyq() { // from class: ru.myspar.legacy.presentation.screen.editorder.vdvldrhtss
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return EditOrderFragment.vdvldrhtss.vdvldrhtss(editOrderFragment, (CartProductUiModel) obj, (ProductCardEvent) obj2);
                }
            }, false, false, true, editOrderFragment.isRemoveLoading, false, (6144 & 2048) != 0 ? 2 : 0, (6144 & 4096) != 0 ? qt.zoijcleaow.FULL : null);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zoijcleaowVarWkgbmnqykc, "null cannot be cast to non-null type com.hannesdorfmann.adapterdelegates4.AdapterDelegate<kotlin.collections.MutableList<ru.myspar.common.view.product.model.cart.CartProductUiModel>>");
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
            editOrderFragment.wwaezpbzkn().weqkydbzbr(new ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.gtknphoqwx(it));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn vdvldrhtss(EditOrderFragment editOrderFragment, CartProductUiModel product, ProductCardEvent productCardEvent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            editOrderFragment.wwaezpbzkn().weqkydbzbr(new ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.btonecajqb(product, productCardEvent));
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
        final /* synthetic */ EditOrderFragment f88961jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88962yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88963zdlpuopuiu;

        public wflxmlrfwp(jpowsppfya jpowsppfyaVar, long j13, EditOrderFragment editOrderFragment) {
            this.f88963zdlpuopuiu = jpowsppfyaVar;
            this.f88962yggfygwlhe = j13;
            this.f88961jyumaefscl = editOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88963zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88962yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f88961jyumaefscl.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.agtfadlqog.f89030iobyxmoadg);
        }
    }

    static final class wkgbmnqykc implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk f88964yggfygwlhe;

        static final class iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk f88966zdlpuopuiu;

            iobyxmoadg(ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk iwizpuwonkVar) {
                this.f88966zdlpuopuiu = iwizpuwonkVar;
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
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(508512991, i13, -1, "ru.myspar.legacy.presentation.screen.editorder.EditOrderFragment.handleState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditOrderFragment.kt:232)");
                }
                au.wkgbmnqykc.zoijcleaow(this.f88966zdlpuopuiu.yggfygwlhe(), androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), null, null, 0L, 0L, draadjrbmkVar, 48, 60);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        wkgbmnqykc(ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk iwizpuwonkVar) {
            this.f88964yggfygwlhe = iwizpuwonkVar;
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(657328196, i13, -1, "ru.myspar.legacy.presentation.screen.editorder.EditOrderFragment.handleState.<anonymous>.<anonymous>.<anonymous> (EditOrderFragment.kt:229)");
            }
            Context contextRequireContext = EditOrderFragment.this.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            y50.zoijcleaow.zoijcleaow(c60.zoijcleaow.eablkybsjg(contextRequireContext) ? y50.nufgyqmvbu.Dark : y50.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(508512991, true, new iobyxmoadg(this.f88964yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class yggfygwlhe extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f88967zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yggfygwlhe(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88967zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f88967zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class zdlpuopuiu extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88968zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f88968zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f88968zdlpuopuiu.invoke();
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f88969iobyxmoadg;

        static {
            int[] iArr = new int[ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg.values().length];
            try {
                iArr[ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg.APPLIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg.NOT_APPLIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f88969iobyxmoadg = iArr;
        }
    }

    public EditOrderFragment() {
        super(pm.gxszxtbevo.fragment_edit_order);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.fyldjkxazc(this.f89151zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new zdlpuopuiu(new kcexrzcfyt(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(lereixgezr.class), new yggfygwlhe(gtknphoqwxVarIobyxmoadg), new jyumaefscl(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = ys.iobyxmoadg.zoijcleaow(this, ppxfxbqfkf.f88957zdlpuopuiu);
        this.isRemoveLoading = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
        this.productAdapter = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.iyctptxqzt(this.f89145zdlpuopuiu);
            }
        });
        this.payload = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.opjhrmiecq(this.f89149zdlpuopuiu);
            }
        });
    }

    private final void ageimvtcrz() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        rx.nufgyqmvbu.iobyxmoadg.wflxmlrfwp(new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null).agtfadlqog(pm.dxjokdxxww.order_edit_limit_time_title).lqeggnwhkg(pm.dxjokdxxww.order_edit_limit_time_message), pm.dxjokdxxww.order_edit_limit_time_positive, null, 2, null).zoijcleaow().show();
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
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.gxszxtbevo.f89037iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd(HintUiModel hint, CartProductUiModel product) {
        HintDialogAnalyticsInfo hintDialogAnalyticsInfo = new HintDialogAnalyticsInfo(new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), new AnalyticsPage.OrderEdit(metgxyhuhe().getOrderId()), null, 4, null);
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        st.zoijcleaow.iobyxmoadg(hint, hintDialogAnalyticsInfo, oxmwwwfdhmVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf fyldjkxazc(EditOrderFragment editOrderFragment) {
        return editOrderFragment.new iwizpuwonk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hszhottldk(EditOrderFragment editOrderFragment) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.eablkybsjg.f89035iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn igdgnonuha(EditOrderFragment editOrderFragment) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.iobyxmoadg.f89038iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final wwaezpbzkn ikoacuggdj() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String string = context.getString(pm.dxjokdxxww.notification_channel_name);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        String string2 = context.getString(pm.dxjokdxxww.notification_channel_description);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "getString(...)");
        NotificationChannel notificationChannel = new NotificationChannel("EditOrderNotificationChannel", string, 4);
        notificationChannel.setDescription(string2);
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void iwxlajgraz() {
        rx.iobyxmoadg iobyxmoadgVar = new rx.iobyxmoadg(rx.zoijcleaow.PRIMARY, Integer.valueOf(pm.dxjokdxxww.order_edit_products_action_continue), null, null, 12, null);
        rx.iobyxmoadg iobyxmoadgVar2 = new rx.iobyxmoadg(rx.zoijcleaow.SECONDARY, Integer.valueOf(pm.dxjokdxxww.order_edit_products_action_cancel), null, new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.dvvnrvtcbc(this.f88996zdlpuopuiu);
            }
        }, 4, null);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null).agtfadlqog(pm.dxjokdxxww.order_edit_products_waring_title).lqeggnwhkg(pm.dxjokdxxww.order_edit_products_last_product_waring_message).iobyxmoadg(iobyxmoadgVar).iobyxmoadg(iobyxmoadgVar2).ppxfxbqfkf(rx.ppxfxbqfkf.VERTICAL).zoijcleaow().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vdvldrhtss iyctptxqzt(EditOrderFragment editOrderFragment) {
        return new vdvldrhtss(editOrderFragment, fc0.iobyxmoadg.iobyxmoadg());
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
            cllcsxoeizVarIobyxmoadg.dxjokdxxww(cqumvgiudrVar.iobyxmoadg()).dxjokdxxww(this, new oxmwwwfdhm(new tg.draadjrbmk() { // from class: ru.myspar.legacy.presentation.screen.editorder.btonecajqb
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return EditOrderFragment.zeieaojujs(this.f88985zdlpuopuiu, (hkdspvbjdz) obj);
                }
            }));
        }
    }

    private final void lxfrhoxuzk() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        gc0.eablkybsjg.iobyxmoadg.gxszxtbevo(new gc0.eablkybsjg.iobyxmoadg(contextRequireContext).nufgyqmvbu(pm.dxjokdxxww.title_edit_order).zoijcleaow(pm.dxjokdxxww.msg_save_changed_warning).lqeggnwhkg(pm.dxjokdxxww.action_save_edit_and_exit, new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.wizcaqwiak(this.f89143zdlpuopuiu);
            }
        }), pm.dxjokdxxww.action_continue_edit_order, null, 2, null).wkgbmnqykc(pm.dxjokdxxww.action_cancel_edit_and_exit, new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.hszhottldk(this.f89144zdlpuopuiu);
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
    public static final /* synthetic */ Object oipsdeybqn(EditOrderFragment editOrderFragment, ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
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

    private final void roivzttewh(String promo, ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg status) {
        TextInputEditText etPromocode = xrmfcynszj().f65740lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(etPromocode, "etPromocode");
        auzgnhcxok(etPromocode, promo);
        m60.lereixgezr lereixgezrVarXrmfcynszj = xrmfcynszj();
        MaterialTextView tvPromocodeStatus = lereixgezrVarXrmfcynszj.f65734jpowsppfya;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvPromocodeStatus, "tvPromocodeStatus");
        tvPromocodeStatus.setVisibility(status == ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk.iobyxmoadg.NOT_ENTERED ? 4 : 0);
        TextInputEditText etPromocode2 = lereixgezrVarXrmfcynszj.f65740lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(etPromocode2, "etPromocode");
        etPromocode2.setPadding(etPromocode2.getPaddingLeft(), etPromocode2.getPaddingTop(), lereixgezrVarXrmfcynszj.f65749vdvldrhtss.getWidth() + 12, etPromocode2.getPaddingBottom());
        int i13 = zoijcleaow.f88969iobyxmoadg[status.ordinal()];
        if (i13 == 1) {
            uawqvzlxes(pm.dxjokdxxww.order_edit_promocode_applied, s40.ppxfxbqfkf.colorPrimary1);
        } else {
            if (i13 != 2) {
                return;
            }
            uawqvzlxes(pm.dxjokdxxww.not_applied, s40.ppxfxbqfkf.colorSecondary1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn sflfametgt(EditOrderFragment editOrderFragment) {
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.wkgbmnqykc.f89045iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null).lqeggnwhkg(pm.dxjokdxxww.order_edit_end_time_message).draadjrbmk(pm.dxjokdxxww.order_edit_end_time_positive, new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.igdgnonuha(this.f88999zdlpuopuiu);
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
        m60.lereixgezr lereixgezrVarXrmfcynszj = xrmfcynszj();
        lereixgezrVarXrmfcynszj.f65734jpowsppfya.setText(title);
        MaterialTextView materialTextView = lereixgezrVarXrmfcynszj.f65734jpowsppfya;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        materialTextView.setTextColor(c60.zoijcleaow.ppxfxbqfkf(contextRequireContext, tint));
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
        editOrderFragment.wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.rgvfuqvkyq.f89043iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final m60.lereixgezr xrmfcynszj() {
        return (m60.lereixgezr) this.binding.iobyxmoadg(this, f88909lmojexxdyd[0]);
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
            r40.iobyxmoadg.eablkybsjg(czzsidtyhn(), pm.dxjokdxxww.order_edit_temp_saved_message);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (uiLabel instanceof cqumvgiudr.ppxfxbqfkf) {
            iwxlajgraz();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, cqumvgiudr.zoijcleaow.f88995iobyxmoadg)) {
            weqkydbzbr();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, cqumvgiudr.eablkybsjg.f88988iobyxmoadg)) {
            ageimvtcrz();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (uiLabel instanceof cqumvgiudr.nufgyqmvbu) {
            r40.iobyxmoadg.dxjokdxxww(czzsidtyhn(), ((cqumvgiudr.nufgyqmvbu) uiLabel).iobyxmoadg(), null, null, 6, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (uiLabel instanceof cqumvgiudr.dxjokdxxww) {
            r40.iobyxmoadg.btonecajqb(czzsidtyhn(), ((cqumvgiudr.dxjokdxxww) uiLabel).iobyxmoadg(), null, null, 6, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, cqumvgiudr.gxszxtbevo.f88989iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        r40.iobyxmoadg.ppxfxbqfkf(czzsidtyhn(), pm.dxjokdxxww.product_not_available, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yfnezrywwk(ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk state) {
        this.isRemoveLoading.setValue(Boolean.valueOf(state.cqumvgiudr()));
        m60.lereixgezr lereixgezrVarXrmfcynszj = xrmfcynszj();
        lereixgezrVarXrmfcynszj.f65727gxszxtbevo.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(657328196, true, new wkgbmnqykc(state)));
        lereixgezrVarXrmfcynszj.f65739lmojexxdyd.setText(state.gtknphoqwx());
        lereixgezrVarXrmfcynszj.f65729hkdspvbjdz.setText(state.nufgyqmvbu());
        MaterialTextView tvReceiver = lereixgezrVarXrmfcynszj.f65729hkdspvbjdz;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvReceiver, "tvReceiver");
        tvReceiver.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(state.nufgyqmvbu()) ? 0 : 8);
        lereixgezrVarXrmfcynszj.f65728hcddaimhww.setText(state.vdvldrhtss());
        MaterialTextView tvPhone = lereixgezrVarXrmfcynszj.f65728hcddaimhww;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvPhone, "tvPhone");
        tvPhone.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(state.vdvldrhtss()) ? 0 : 8);
        lereixgezrVarXrmfcynszj.f65755yggfygwlhe.setText(state.lqeggnwhkg());
        MaterialTextView tvEmail = lereixgezrVarXrmfcynszj.f65755yggfygwlhe;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvEmail, "tvEmail");
        tvEmail.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(state.lqeggnwhkg()) ? 0 : 8);
        lereixgezrVarXrmfcynszj.f65733iwizpuwonk.setText(state.dxjokdxxww());
        lereixgezrVarXrmfcynszj.f65747rgvfuqvkyq.setText(state.wkgbmnqykc());
        lereixgezrVarXrmfcynszj.f65754yadqdtsiqt.setText(state.btonecajqb());
        lereixgezrVarXrmfcynszj.f65722dsvhmnatus.setText(state.draadjrbmk());
        lereixgezrVarXrmfcynszj.f65756ylkuphrtab.setText(state.ojitshcjhn());
        rlfsiqarku().wkgbmnqykc(state.oxmwwwfdhm());
        lereixgezrVarXrmfcynszj.f65753wypolnanlu.setText(state.iwizpuwonk());
        lereixgezrVarXrmfcynszj.f65743oxmwwwfdhm.setText(state.ppxfxbqfkf());
        MaterialTextView tvComment = lereixgezrVarXrmfcynszj.f65743oxmwwwfdhm;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvComment, "tvComment");
        tvComment.setVisibility(mj.kcexrzcfyt.zfvoamnweg(state.ppxfxbqfkf()) ? 8 : 0);
        roivzttewh(state.kcexrzcfyt(), state.zdlpuopuiu());
        ComposeView clLoading = lereixgezrVarXrmfcynszj.f65751wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, state.cqumvgiudr());
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
        editOrderFragment.wwaezpbzkn().weqkydbzbr(new ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.draadjrbmk(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final q40.iobyxmoadg czzsidtyhn() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // e40.iobyxmoadg
    public boolean gxszxtbevo() {
        wwaezpbzkn().weqkydbzbr(ru.myspar.legacy.presentation.screen.editorder.jyumaefscl.wkgbmnqykc.f89045iobyxmoadg);
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

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m60.lereixgezr lereixgezrVarXrmfcynszj = xrmfcynszj();
        ComposeView cvActionBar = lereixgezrVarXrmfcynszj.f65724eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = getString(pm.dxjokdxxww.title_edit_order);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EditOrderFragment.sflfametgt(this.f88997zdlpuopuiu);
            }
        }, null, null, 109, null);
        MaterialTextView tvReceiverEdit = lereixgezrVarXrmfcynszj.f65719cllcsxoeiz;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvReceiverEdit, "tvReceiverEdit");
        tvReceiverEdit.setOnClickListener(new dxjokdxxww(new jpowsppfya(), 400L, this));
        MaterialTextView tvIntervalEdit = lereixgezrVarXrmfcynszj.f65731iozdgvuglv;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvIntervalEdit, "tvIntervalEdit");
        tvIntervalEdit.setOnClickListener(new btonecajqb(new jpowsppfya(), 400L, this));
        MaterialTextView tvPaymentEdit = lereixgezrVarXrmfcynszj.f65744pkzmftpjix;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvPaymentEdit, "tvPaymentEdit");
        tvPaymentEdit.setOnClickListener(new gtknphoqwx(new jpowsppfya(), 400L, this));
        TextInputEditText etPromocode = lereixgezrVarXrmfcynszj.f65740lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(etPromocode, "etPromocode");
        ge0.oxmwwwfdhm.iobyxmoadg(etPromocode, new tg.draadjrbmk() { // from class: ru.myspar.legacy.presentation.screen.editorder.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return EditOrderFragment.zfvoamnweg(this.f89000zdlpuopuiu, (CharSequence) obj);
            }
        });
        MaterialTextView tvApplyPromocode = lereixgezrVarXrmfcynszj.f65749vdvldrhtss;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvApplyPromocode, "tvApplyPromocode");
        tvApplyPromocode.setOnClickListener(new draadjrbmk(new jpowsppfya(), 400L, this));
        MaterialButton btnCancel = lereixgezrVarXrmfcynszj.f65758zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnCancel, "btnCancel");
        btnCancel.setOnClickListener(new wflxmlrfwp(new jpowsppfya(), 400L, this));
        MaterialButton btnSave = lereixgezrVarXrmfcynszj.f65746ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnSave, "btnSave");
        btnSave.setOnClickListener(new agtfadlqog(new jpowsppfya(), 400L, this));
        MaterialButton tvAddFromCatalog = lereixgezrVarXrmfcynszj.f65742ojitshcjhn;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvAddFromCatalog, "tvAddFromCatalog");
        tvAddFromCatalog.setOnClickListener(new ojitshcjhn(new jpowsppfya(), 400L, this));
        MaterialTextView tvCommentEdit = lereixgezrVarXrmfcynszj.f65736kcexrzcfyt;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvCommentEdit, "tvCommentEdit");
        tvCommentEdit.setOnClickListener(new rgvfuqvkyq(new jpowsppfya(), 400L, this));
        RecyclerView recyclerView = lereixgezrVarXrmfcynszj.f65750wflxmlrfwp;
        t40.zoijcleaow.iobyxmoadg iobyxmoadgVar = t40.zoijcleaow.f109665lqeggnwhkg;
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        recyclerView.btonecajqb(iobyxmoadgVar.iobyxmoadg(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView);
        e60.zoijcleaow.ppxfxbqfkf(recyclerView, rlfsiqarku(), xrmfcynszj());
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new eablkybsjg(this, zoijcleaowVar, null, this), 3, null);
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner2), null, null, new gxszxtbevo(this, zoijcleaowVar, null, this), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public lereixgezr wwaezpbzkn() {
        return (lereixgezr) this.viewModel.getValue();
    }
}
