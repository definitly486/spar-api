package ri0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.legacy.presentation.view.SwitchableTextView;
import ru.myspar.options.impl.options.presentation.models.UserSubscriptionUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends jyumaefscl implements vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof UserSubscriptionUiModel);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f82697zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    private static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, UserSubscriptionUiModel userSubscriptionUiModel) {
        SwitchableTextView stvAutoRenewalSubscription = ((ni0.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf()).f70123zoijcleaow;
        zdlpuopuiu.dxjokdxxww(stvAutoRenewalSubscription, "stvAutoRenewalSubscription");
        eablkybsjg(stvAutoRenewalSubscription, userSubscriptionUiModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "compoundButton");
        if (iobyxmoadgVar.getBindingAdapterPosition() == -1 || !compoundButton.isPressed()) {
            return;
        }
        rgvfuqvkyqVar.invoke(((UserSubscriptionUiModel) iobyxmoadgVar.eablkybsjg()).getItemId(), Boolean.valueOf(z13));
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, UserSubscriptionUiModel userSubscriptionUiModel) {
        SwitchableTextView switchableTextView = ((ni0.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf()).f70123zoijcleaow;
        switchableTextView.setTitle(userSubscriptionUiModel.getSubscriptionName());
        zdlpuopuiu.lqeggnwhkg(switchableTextView);
        eablkybsjg(switchableTextView, userSubscriptionUiModel);
    }

    private static final void eablkybsjg(SwitchableTextView switchableTextView, UserSubscriptionUiModel userSubscriptionUiModel) {
        switchableTextView.setChecked(userSubscriptionUiModel.getIsSettingSelected());
        switchableTextView.setToggleEnabled(userSubscriptionUiModel.getIsEnabledForChange());
        if (userSubscriptionUiModel.getIsSettingSelected() || !userSubscriptionUiModel.getIsEnabledForChange()) {
            return;
        }
        switchableTextView.setMessageEnabled(userSubscriptionUiModel.getAutoRenewalEnabled());
        switchableTextView.setToggleEnabled(userSubscriptionUiModel.getAutoRenewalEnabled());
    }

    private static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, List list) {
        for (Object obj : list) {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (it.next() instanceof lqeggnwhkg.iobyxmoadg) {
                    btonecajqb(iobyxmoadgVar, (UserSubscriptionUiModel) iobyxmoadgVar.eablkybsjg());
                }
            }
        }
    }

    public static final df.zoijcleaow gxszxtbevo(final rgvfuqvkyq onAutoRenewalClicked) {
        zdlpuopuiu.btonecajqb(onAutoRenewalClicked, "onAutoRenewalClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: ri0.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: ri0.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.nufgyqmvbu(onAutoRenewalClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f82697zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ni0.ppxfxbqfkf lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        ni0.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = ni0.ppxfxbqfkf.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "inflate(...)");
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((ni0.ppxfxbqfkf) adapterDelegateViewBinding.ppxfxbqfkf()).f70123zoijcleaow.setListener(new CompoundButton.OnCheckedChangeListener() { // from class: ri0.wkgbmnqykc
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                gxszxtbevo.draadjrbmk(adapterDelegateViewBinding, rgvfuqvkyqVar, compoundButton, z13);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: ri0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.wflxmlrfwp(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(ef.iobyxmoadg iobyxmoadgVar, List payloads) {
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            dxjokdxxww(iobyxmoadgVar, (UserSubscriptionUiModel) iobyxmoadgVar.eablkybsjg());
        } else {
            gtknphoqwx(iobyxmoadgVar, payloads);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
