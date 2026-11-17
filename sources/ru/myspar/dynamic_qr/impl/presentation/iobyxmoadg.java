package ru.myspar.dynamic_qr.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.dynamic_qr.impl.domain.models.DynamicQrCode;
import ru.myspar.dynamic_qr.impl.domain.store.DynamicQrCodeStore$QrCodeType;
import ru.myspar.dynamic_qr.impl.domain.store.State;
import ru.myspar.dynamic_qr.impl.domain.store.eablkybsjg;
import ru.myspar.dynamic_qr.impl.domain.store.lqeggnwhkg;
import ru.myspar.user.models.UserCard;
import t80.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f88186btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f88187draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f88188gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.dynamic_qr.impl.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2017iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f88189iobyxmoadg;

        static {
            int[] iArr = new int[r80.iobyxmoadg.values().length];
            try {
                iArr[r80.iobyxmoadg.INTERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f88189iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f88186btonecajqb = resourcesManager;
        this.f88188gtknphoqwx = new draadjrbmk() { // from class: t80.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.dynamic_qr.impl.presentation.iobyxmoadg.sopmlzcsov(this.f110060zdlpuopuiu, (State) obj);
            }
        };
        this.f88187draadjrbmk = new draadjrbmk() { // from class: t80.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.dynamic_qr.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.dynamic_qr.impl.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.dynamic_qr.impl.domain.store.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f88190iobyxmoadg)) {
            return ru.myspar.dynamic_qr.impl.domain.store.wkgbmnqykc.iobyxmoadg.f88170iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zoijcleaow c2019zoijcleaow;
        String number;
        String number2;
        String string;
        zdlpuopuiu.btonecajqb(state, "<this>");
        DynamicQrCodeStore$QrCodeType qrcodeType = state.getQrcodeType();
        if (qrcodeType instanceof DynamicQrCodeStore$QrCodeType.Dynamic) {
            DynamicQrCode model = ((DynamicQrCodeStore$QrCodeType.Dynamic) state.getQrcodeType()).getModel();
            String qrcode = model.getQrcode();
            UserCard userCard = state.getUserCard();
            number2 = userCard != null ? userCard.getDesc() : null;
            if (number2 == null) {
                number2 = "";
            }
            UserCard userCard2 = state.getUserCard();
            c2019zoijcleaow = new zoijcleaow.iobyxmoadg.C2018iobyxmoadg(qrcode, model.getDescription(), userCard2 != null ? vg.iobyxmoadg.ppxfxbqfkf(userCard2.getBonuses()) : 0, number2);
        } else if (qrcodeType instanceof DynamicQrCodeStore$QrCodeType.Expired) {
            c2019zoijcleaow = new zoijcleaow.iobyxmoadg.C2019zoijcleaow(((DynamicQrCodeStore$QrCodeType.Expired) state.getQrcodeType()).getQrcode(), iobyxmoadgVar.f88186btonecajqb.getString(q80.ppxfxbqfkf.error_info_for_static_qr), state.getIsLoading(), iobyxmoadgVar.f88186btonecajqb.getString(q80.ppxfxbqfkf.error_default_message));
        } else if (qrcodeType instanceof DynamicQrCodeStore$QrCodeType.Static) {
            UserCard userCard3 = state.getUserCard();
            if (userCard3 == null || (number = userCard3.getNumber()) == null || kcexrzcfyt.zfvoamnweg(number)) {
                number = null;
            }
            boolean isLoading = state.getIsLoading();
            UserCard userCard4 = state.getUserCard();
            String number3 = userCard4 != null ? userCard4.getNumber() : null;
            String string2 = (number3 == null || kcexrzcfyt.zfvoamnweg(number3)) ? iobyxmoadgVar.f88186btonecajqb.getString(q80.ppxfxbqfkf.error_info_for_empty_qr) : iobyxmoadgVar.f88186btonecajqb.getString(q80.ppxfxbqfkf.error_info_for_static_qr);
            if (C2017iobyxmoadg.f88189iobyxmoadg[((DynamicQrCodeStore$QrCodeType.Static) state.getQrcodeType()).getErrorType().ordinal()] == 1) {
                string = iobyxmoadgVar.f88186btonecajqb.getString(q80.ppxfxbqfkf.error_internet_message);
            } else {
                UserCard userCard5 = state.getUserCard();
                number2 = userCard5 != null ? userCard5.getNumber() : null;
                string = (number2 == null || kcexrzcfyt.zfvoamnweg(number2)) ? iobyxmoadgVar.f88186btonecajqb.getString(q80.ppxfxbqfkf.error_empty_message) : iobyxmoadgVar.f88186btonecajqb.getString(q80.ppxfxbqfkf.error_default_message);
            }
            c2019zoijcleaow = new zoijcleaow.iobyxmoadg.C2019zoijcleaow(number, string2, isLoading, string);
        } else {
            if (qrcodeType != null) {
                throw new NoWhenBranchMatchedException();
            }
            c2019zoijcleaow = zoijcleaow.C2020zoijcleaow.f88202iobyxmoadg;
        }
        return new gxszxtbevo(c2019zoijcleaow);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f88188gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f88187draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f88191iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
