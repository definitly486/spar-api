package modern.payments.ecomAndroid.secureChapter.impl;

import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.tzroggbefp;
import java.security.interfaces.ECPublicKey;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import modern.payments.ecomAndroid.domain.manager.CardDataManager;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.presentation.model.card.NewCardPresentationData;
import modern.payments.ecomAndroid.secureChapter.EncryptedDataHandler;
import modern.payments.ecomAndroid.secureChapter.cryptoEntities.Jose4jImpl;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.tracker.ITracker;
import nl.zoijcleaow;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.ikoacuggdj;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmodern/payments/ecomAndroid/secureChapter/impl/EncryptedCardDataHandler;", "Lmodern/payments/ecomAndroid/secureChapter/EncryptedDataHandler;", "Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;", "cardDataManager", "Lmodern/payments/ecomAndroid/secureChapter/cryptoEntities/Jose4jImpl;", "jose4jImpl", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;Lmodern/payments/ecomAndroid/secureChapter/cryptoEntities/Jose4jImpl;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "printToLogIfEmpty", "(Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;)Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "", "ecomPublicKey", "getJwe", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;", "Lmodern/payments/ecomAndroid/secureChapter/cryptoEntities/Jose4jImpl;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lnl/zoijcleaow;", "ecTestPrivateKey", "Lnl/zoijcleaow;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EncryptedCardDataHandler implements EncryptedDataHandler {
    private final CardDataManager cardDataManager;
    private final zoijcleaow ecTestPrivateKey;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final Jose4jImpl jose4jImpl;
    private final ITracker tracker;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.secureChapter.impl.EncryptedCardDataHandler$getJwe$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "", "<anonymous>", "(Lpj/cllcsxoeiz;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.secureChapter.impl.EncryptedCardDataHandler$getJwe$2", f = "EncryptedCardDataHandler.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ String $ecomPublicKey;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$ecomPublicKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            AnonymousClass2 anonymousClass2 = EncryptedCardDataHandler.this.new AnonymousClass2(this.$ecomPublicKey, gxszxtbevoVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            mg.zoijcleaow.gxszxtbevo();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            int i13 = 0;
            while (true) {
                if (i13 >= 3) {
                    return null;
                }
                EncryptedCardDataHandler encryptedCardDataHandler = EncryptedCardDataHandler.this;
                String str = this.$ecomPublicKey;
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    new zoijcleaow(tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("kty", "EC"), cqumvgiudr.iobyxmoadg("kid", "6ad7a4bc-8b26-41d5-977d-9d2b090cb999"), cqumvgiudr.iobyxmoadg("x", "my2hO8Mqxc9dDIqdGLefaypwmCjZQZvfcAEdErrHxqg"), cqumvgiudr.iobyxmoadg("y", "IBK6sM8BfQyYgCs5sB8PjwJJZB1i8WrSKrT5_UWZAUs"), cqumvgiudr.iobyxmoadg("crv", "P-256")));
                    Jose4jImpl jose4jImpl = encryptedCardDataHandler.jose4jImpl;
                    String string = encryptedCardDataHandler.printToLogIfEmpty(encryptedCardDataHandler.cardDataManager.getCardData()).toString();
                    ECPublicKey eCPublicKeyHcddaimhww = encryptedCardDataHandler.decodeEcomPublicKey(str).hcddaimhww();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eCPublicKeyHcddaimhww, "getECPublicKey(...)");
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(jose4jImpl.createJweEcdhAes(string, eCPublicKeyHcddaimhww));
                } catch (Throwable th2) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
                EncryptedCardDataHandler encryptedCardDataHandler2 = EncryptedCardDataHandler.this;
                Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    FeatureExtensionsKt.track(encryptedCardDataHandler2.tracker, encryptedCardDataHandler2.ecomSdkOptionsRepository, "JWE Exception", thDxjokdxxww, ITracker.Priority.ERROR, "EncryptedCardDataHandler");
                }
                String str2 = (String) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
                if (str2 != null) {
                    return str2;
                }
                i13++;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super String> gxszxtbevoVar) {
            return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public EncryptedCardDataHandler(CardDataManager cardDataManager, Jose4jImpl jose4jImpl, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cardDataManager, "cardDataManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jose4jImpl, "jose4jImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tracker, "tracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.cardDataManager = cardDataManager;
        this.jose4jImpl = jose4jImpl;
        this.tracker = tracker;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
        this.ecTestPrivateKey = new zoijcleaow(tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("kty", "EC"), cqumvgiudr.iobyxmoadg("kid", "6ad7a4bc-8b26-41d5-977d-9d2b090cb999"), cqumvgiudr.iobyxmoadg("x", "my2hO8Mqxc9dDIqdGLefaypwmCjZQZvfcAEdErrHxqg"), cqumvgiudr.iobyxmoadg("y", "IBK6sM8BfQyYgCs5sB8PjwJJZB1i8WrSKrT5_UWZAUs"), cqumvgiudr.iobyxmoadg("crv", "P-256"), cqumvgiudr.iobyxmoadg("d", "f74kIzjzkrM6QIAUYV4bd9DZxTd2J1bjPDD0vCZiVzM")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewCardPresentationData printToLogIfEmpty(NewCardPresentationData newCardPresentationData) {
        if (newCardPresentationData.getCardNumber().length() == 0 || newCardPresentationData.getExpiryMonth().length() == 0 || newCardPresentationData.getExpiryYear().length() == 0 || newCardPresentationData.getCvc().length() == 0) {
            FeatureExtensionsKt.track$default(this.tracker, this.ecomSdkOptionsRepository, "Card Data is empty", null, ITracker.Priority.ERROR, "EncryptedCardDataHandler", 4, null);
        }
        return newCardPresentationData;
    }

    @Override // modern.payments.ecomAndroid.secureChapter.EncryptedDataHandler
    public zoijcleaow decodeEcomPublicKey(String str) {
        return EncryptedDataHandler.DefaultImpls.decodeEcomPublicKey(this, str);
    }

    @Override // modern.payments.ecomAndroid.secureChapter.EncryptedDataHandler
    public Object getJwe(String str, lg.gxszxtbevo<? super String> gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(ikoacuggdj.zoijcleaow(), new AnonymousClass2(str, null), gxszxtbevoVar);
    }
}
