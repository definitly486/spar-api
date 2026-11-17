package ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import androidx.lifecycle.pkzmftpjix;
import g91.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.specificpromotion.store.State;
import t61.eablkybsjg;
import t61.lqeggnwhkg;
import tg.draadjrbmk;
import vk0.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f96537btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f96538draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96539gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f96537btonecajqb = resourcesManager;
        this.f96539gtknphoqwx = new draadjrbmk() { // from class: g91.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.iobyxmoadg.jlmebxxoox(this.f36712zdlpuopuiu, (State) obj);
            }
        };
        this.f96538draadjrbmk = new draadjrbmk() { // from class: g91.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu jlmebxxoox(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        String image = state.getProduct().getImage();
        if (image == null) {
            image = "";
        }
        return new nufgyqmvbu(new h91.iobyxmoadg(image, state.getProduct().getName(), iobyxmoadgVar.ulzqkzuiru(state.getProduct().getOldPrice()), iobyxmoadgVar.ulzqkzuiru(state.getProduct().getPrice()), state.getProduct().getOldPrice() > 0.0d), state.getProduct().getQrCode(), iobyxmoadgVar.sopmlzcsov(state.getProduct().getNeeds()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t61.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f96545iobyxmoadg)) {
            return t61.wkgbmnqykc.iobyxmoadg.f109931iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final CharSequence sopmlzcsov(int i13) {
        String string = this.f96537btonecajqb.getString(vk0.lqeggnwhkg.proloyalty_format_pay_stickers_info);
        String string2 = this.f96537btonecajqb.getString(vk0.lqeggnwhkg.proloyalty_format_stickers_balance, Integer.valueOf(i13), this.f96537btonecajqb.lqeggnwhkg(gxszxtbevo.plural_stickers, i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.append((CharSequence) " ");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    private final String ulzqkzuiru(double d13) {
        return this.f96537btonecajqb.getString(vk0.lqeggnwhkg.proloyalty_approximate_price_format, t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(d13)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f109916iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f96540iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f109917iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.C2281ppxfxbqfkf.f96541iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96539gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96538draadjrbmk;
    }
}
