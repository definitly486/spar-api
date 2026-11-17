package ru.myspar.contacts.impl.contacts_screen.presentation;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.iwizpuwonk;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.contacts.api.model.ContactsScreenPayload;
import ru.myspar.contacts.impl.contacts_screen.presentation.ContactsFragmentCompose;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lru/myspar/contacts/impl/contacts_screen/presentation/ContactsFragmentCompose;", "Lru/myspar/core/base/mvi/bottomsheet/BaseComposeMviBottomSheetDialogFragment;", "Lmx/lqeggnwhkg;", "Lru/myspar/contacts/impl/contacts_screen/presentation/zoijcleaow;", "Lru/myspar/contacts/impl/contacts_screen/presentation/ppxfxbqfkf;", "<init>", "()V", "Lgg/wwaezpbzkn;", "zfvoamnweg", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", CommonUrlParts.MODEL, "uwvvkdfqfp", "(Lmx/lqeggnwhkg;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "sflfametgt", "(Lru/myspar/contacts/impl/contacts_screen/presentation/ppxfxbqfkf;)V", "", "iozdgvuglv", "I", "jhduphickx", "()I", "verticalSpacerAfterCurtain", "Lru/myspar/contacts/impl/contacts_screen/presentation/iobyxmoadg;", "lmojexxdyd", "Lgg/gtknphoqwx;", "ydmasvzmpa", "()Lru/myspar/contacts/impl/contacts_screen/presentation/iobyxmoadg;", "binder", "wwaezpbzkn", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactsFragmentCompose extends Hilt_ContactsFragmentCompose<mx.lqeggnwhkg, ru.myspar.contacts.impl.contacts_screen.presentation.zoijcleaow, ru.myspar.contacts.impl.contacts_screen.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final int f86466ylkuphrtab = 8;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final int verticalSpacerAfterCurtain = 16;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f86469zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f86469zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f86469zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f86470zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f86470zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f86470zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.contacts.impl.contacts_screen.presentation.ContactsFragmentCompose$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ContactsFragmentCompose iobyxmoadg(ContactsScreenPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            return (ContactsFragmentCompose) b40.iobyxmoadg.zoijcleaow(new ContactsFragmentCompose(), payload, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f86471yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f86472zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f86472zdlpuopuiu = iobyxmoadgVar;
            this.f86471yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f86472zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f86471yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f86473yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f86474zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f86474zdlpuopuiu = fragment;
            this.f86473yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f86473yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f86474zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends androidx.activity.jyumaefscl {
        ppxfxbqfkf() {
            super(true);
        }

        @Override // androidx.activity.jyumaefscl
        public void lqeggnwhkg() {
            ContactsFragmentCompose.this.ribwqtqdhb(ru.myspar.contacts.impl.contacts_screen.presentation.zoijcleaow.ppxfxbqfkf.f86492iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f86476zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f86476zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f86476zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, ContactsFragmentCompose.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ru.myspar.contacts.impl.contacts_screen.presentation.zoijcleaow) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ru.myspar.contacts.impl.contacts_screen.presentation.zoijcleaow p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((ContactsFragmentCompose) this.receiver).ribwqtqdhb(p13);
        }
    }

    public ContactsFragmentCompose() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oipsdeybqn(ContactsFragmentCompose contactsFragmentCompose) {
        contactsFragmentCompose.vipkmwdibw().ulzqkzuiru();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yfnezrywwk(ContactsFragmentCompose contactsFragmentCompose, mx.lqeggnwhkg lqeggnwhkgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        contactsFragmentCompose.jlmebxxoox(lqeggnwhkgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zfvoamnweg() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, null, null, 6, null).agtfadlqog(jx.zoijcleaow.contacts_permission_dialog_title).lqeggnwhkg(jx.zoijcleaow.contacts_permission_dialog_text).iobyxmoadg(new rx.iobyxmoadg(rx.zoijcleaow.PRIMARY, Integer.valueOf(jx.zoijcleaow.contacts_permission_dialog_settings_btn), null, new tg.iobyxmoadg() { // from class: mx.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ContactsFragmentCompose.oipsdeybqn(this.f68049zdlpuopuiu);
            }
        }, 4, null)).iobyxmoadg(new rx.iobyxmoadg(rx.zoijcleaow.SECONDARY, Integer.valueOf(jx.zoijcleaow.contacts_permission_dialog_confirm_btn), null, null, 12, null)).ppxfxbqfkf(rx.ppxfxbqfkf.VERTICAL).zoijcleaow().show();
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: jhduphickx, reason: from getter */
    public int getVerticalSpacerAfterCurtain() {
        return this.verticalSpacerAfterCurtain;
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        zdlpuopuiu.nufgyqmvbu(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        iwizpuwonk onBackPressedDispatcher = ((com.google.android.material.bottomsheet.ppxfxbqfkf) dialog).getOnBackPressedDispatcher();
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.dxjokdxxww(viewLifecycleOwner, new ppxfxbqfkf());
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public void ikoacuggdj(ru.myspar.contacts.impl.contacts_screen.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.contacts.impl.contacts_screen.presentation.ppxfxbqfkf.zoijcleaow) {
            sopmlzcsov(((ru.myspar.contacts.impl.contacts_screen.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
        } else if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.contacts.impl.contacts_screen.presentation.ppxfxbqfkf.iobyxmoadg.f86484iobyxmoadg)) {
            dismiss();
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.contacts.impl.contacts_screen.presentation.ppxfxbqfkf.C1986ppxfxbqfkf.f86485iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            zfvoamnweg();
        }
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void jlmebxxoox(final mx.lqeggnwhkg model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(991873459);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(model) : draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(991873459, i14, -1, "ru.myspar.contacts.impl.contacts_screen.presentation.ContactsFragmentCompose.Render (ContactsFragmentCompose.kt:41)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-156616031);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            nx.eablkybsjg.zoijcleaow(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVarBtonecajqb, i14 & 14);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: mx.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsFragmentCompose.yfnezrywwk(this.f68048zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg vipkmwdibw() {
        return (iobyxmoadg) this.binder.getValue();
    }
}
