package ru.myspar.main_activity.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.esjtqupxsv;
import androidx.activity.iwizpuwonk;
import androidx.activity.wflxmlrfwp;
import androidx.activity.zynmafqrjb;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.lifecycle.sopmlzcsov;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.agtfadlqog;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import o72.Splash;
import ru.myspar.ads.api.model.ImagePopupDialogArgs;
import ru.myspar.ads.api.model.ProductDayPopupDialogArgs;
import ru.myspar.ads.api.model.PromoCodePopupDialogArgs;
import ru.myspar.ads.api.model.TextPopupDialogArgs;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.catalog.api.model.HintDialogArgs;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintNavLink;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.domain.models.payload.MySparScreenPayload;
import ru.myspar.core.domain.models.reviewWithBonuses.ReviewWithBonuses;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.navigation.containers.TabContainerFragment;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.domain.feature.rateorder.model.RateOrderDialogArgs;
import ru.myspar.domain.feature.review.store.InAppReviewDialogArgs;
import ru.myspar.domain.feature.updateapplicationtwo.store.UpdateApplicationTwoDialogArgs;
import ru.myspar.dynamic_qr.api.model.DynamicQrCodeArgs;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.legacy.presentation.dialogs.iqos.IqosAgreementsDialogFragment;
import ru.myspar.legacy.presentation.dialogs.rateorder.RateOrderDialogFragment;
import ru.myspar.legacy.presentation.dialogs.update.UpdateApplicationDialogFragment;
import ru.myspar.legacy.presentation.dialogs.update.UpdateDialogFragment;
import ru.myspar.legacy.presentation.dialogs.updateapplicationtwo.UpdateApplicationTwoDialogFragment;
import ru.myspar.legacy.presentation.screen.review.InAppReviewDialogFragment;
import ru.myspar.main_activity.impl.MainActivity;
import ru.myspar.main_activity.impl.dialogs_interactor.dialog.purchaserating.PurchaseRatingDialogFragment;
import ru.myspar.main_activity.impl.models.PopupTypesUiModel;
import ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.rate.rate_bonus_product.api.model.RateProductResultDialogArgs;
import ru.myspar.rate.rate_bonus_product.api.model.ReviewWithBonusesDialogArgs;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u009e\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u007fB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010\u0006J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001e01H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010\u0006J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\b@\u0010\u0006J\u0017\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ!\u0010L\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\b\u0010K\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010Q\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bU\u0010RJ\u0017\u0010V\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bV\u0010TJ\u0017\u0010W\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bW\u0010TJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bX\u0010TJ\u0017\u0010Z\u001a\u00020\u00072\u0006\u0010=\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\b\\\u0010TJ\u0017\u0010_\u001a\u00020\u00072\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0007H\u0002¢\u0006\u0004\ba\u0010\u0006J\u0017\u0010d\u001a\u00020\u00072\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00072\u0006\u0010c\u001a\u00020fH\u0002¢\u0006\u0004\bg\u0010hJ\u0019\u0010k\u001a\u00020\u00072\b\u0010j\u001a\u0004\u0018\u00010iH\u0014¢\u0006\u0004\bk\u0010lJ\u0019\u0010o\u001a\u00020\u00072\b\u0010n\u001a\u0004\u0018\u00010mH\u0014¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0007H\u0014¢\u0006\u0004\bq\u0010\u0006J\u000f\u0010r\u001a\u00020\u0007H\u0014¢\u0006\u0004\br\u0010\u0006J\u001f\u0010w\u001a\u00020\u00072\u0006\u0010t\u001a\u00020s2\u0006\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020\u00072\u0006\u0010z\u001a\u00020yH\u0014¢\u0006\u0004\b{\u0010|J\u0018\u0010\u007f\u001a\u00020\u00072\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R*\u0010¸\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010À\u0001\u001a\u00030¹\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R*\u0010È\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R*\u0010Ð\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R*\u0010Ø\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R*\u0010à\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R*\u0010è\u0001\u001a\u00030á\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R*\u0010ð\u0001\u001a\u00030é\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001R*\u0010ø\u0001\u001a\u00030ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R*\u0010\u0080\u0002\u001a\u00030ù\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R*\u0010\u0088\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R*\u0010\u0090\u0002\u001a\u00030\u0089\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002R*\u0010\u0098\u0002\u001a\u00030\u0091\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R \u0010\u009d\u0002\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002¨\u0006\u009f\u0002"}, d2 = {"Lru/myspar/main_activity/impl/MainActivity;", "Lvx/iobyxmoadg;", "Lru/myspar/main_activity/impl/draadjrbmk;", "Lsx/zoijcleaow;", "Lst/iobyxmoadg;", "<init>", "()V", "Lgg/wwaezpbzkn;", "jhduphickx", "", "navigationBarColor", "igdgnonuha", "(I)V", "Lru/myspar/main_activity/impl/gtknphoqwx;", "uiLabel", "Lvf0/iobyxmoadg;", "snackbarController", "roivzttewh", "(Lru/myspar/main_activity/impl/gtknphoqwx;Lvf0/iobyxmoadg;)V", "Lg70/ppxfxbqfkf;", "dialogHolder", "tbqsvytpvh", "(Lg70/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lru/myspar/evropolis/api/model/EvropolisGift;", "gift", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "eslsurpljm", "(Lru/myspar/evropolis/api/model/EvropolisGift;Lru/myspar/core/models/delivery/DeliveryCode;)V", "q", "", "description", "p", "(Ljava/lang/String;)V", "Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs;", "args", "rhgxfdycjh", "(Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs;)V", "Laf0/iobyxmoadg;", "loymaxPopup", "Lru/myspar/analytics/api/model/AnalyticsPage;", "page", "g", "(Laf0/iobyxmoadg;Lru/myspar/analytics/api/model/AnalyticsPage;)V", "h", "Lat/zoijcleaow;", "request", "uawqvzlxes", "(Lat/zoijcleaow;)V", "", "permissions", "", "ikoacuggdj", "(Ljava/util/List;)Z", "c", "fiwbwshyhd", "yzdjzghtvl", "krqnebusok", "f", "r", "Lpf0/eablkybsjg;", "params", "t", "(Lpf0/eablkybsjg;)V", "ipoelvxyzq", "Lp00/ppxfxbqfkf;", "message", "C", "(Lp00/ppxfxbqfkf;)V", "Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonuses;", "reviewWithBonuses", "x", "(Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonuses;)V", "Lg70/wkgbmnqykc;", "screenKey", "bonusQuantity", "w", "(Lg70/wkgbmnqykc;Ljava/lang/Integer;)V", "shopId", "Leg0/zoijcleaow;", "popupModel", "i", "(Ljava/lang/String;Leg0/zoijcleaow;)V", "m", "(Leg0/zoijcleaow;)V", "k", "a", "A", "fyldjkxazc", "Lxa0/wflxmlrfwp;", "s", "(Lxa0/wflxmlrfwp;)V", "wizcaqwiak", "Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "dialogArgs", "fmlbqenlif", "(Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "ixidwrxhsl", "Lru/myspar/main_activity/impl/models/PopupTypesUiModel;", "popup", "j", "(Lru/myspar/main_activity/impl/models/PopupTypesUiModel;)V", "Lru/myspar/main_activity/impl/models/PopupTypesUiModel$PurchaseRating;", "n", "(Lru/myspar/main_activity/impl/models/PopupTypesUiModel$PurchaseRating;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onDestroy", "Lru/myspar/common/view/hint/model/HintUiModel;", "hint", "Lru/myspar/common/view/hint/model/HintDialogAnalyticsInfo;", "analyticsInfo", "zoijcleaow", "(Lru/myspar/common/view/hint/model/HintUiModel;Lru/myspar/common/view/hint/model/HintDialogAnalyticsInfo;)V", "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "Landroidx/fragment/app/Fragment;", "fragment", "iobyxmoadg", "(Landroidx/fragment/app/Fragment;)V", "Lxe0/iobyxmoadg;", "cqumvgiudr", "Lxe0/iobyxmoadg;", "sflfametgt", "()Lxe0/iobyxmoadg;", "setLoymaxPopupFeatureApi", "(Lxe0/iobyxmoadg;)V", "loymaxPopupFeatureApi", "Llx1/iobyxmoadg;", "esjtqupxsv", "Llx1/iobyxmoadg;", "opjhrmiecq", "()Llx1/iobyxmoadg;", "setPurchasesFeatureApi", "(Llx1/iobyxmoadg;)V", "purchasesFeatureApi", "Lp80/iobyxmoadg;", "lereixgezr", "Lp80/iobyxmoadg;", "uwvvkdfqfp", "()Lp80/iobyxmoadg;", "setDynamicQrFeatureApi", "(Lp80/iobyxmoadg;)V", "dynamicQrFeatureApi", "Ll20/zoijcleaow;", "pmvmpeiblj", "Ll20/zoijcleaow;", "lrnfpwlwnk", "()Ll20/zoijcleaow;", "setSubscribeToDarkModeStateUseCase", "(Ll20/zoijcleaow;)V", "subscribeToDarkModeStateUseCase", "Ln90/iobyxmoadg;", "zynmafqrjb", "Ln90/iobyxmoadg;", "ydmasvzmpa", "()Ln90/iobyxmoadg;", "setEvropolisFeatureApi", "(Ln90/iobyxmoadg;)V", "evropolisFeatureApi", "Lf70/iobyxmoadg;", "istkbnxepw", "Lf70/iobyxmoadg;", "czzsidtyhn", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Ltp/iobyxmoadg;", "cdpycssgdh", "Ltp/iobyxmoadg;", "xrmfcynszj", "()Ltp/iobyxmoadg;", "setCartFeatureApi", "(Ltp/iobyxmoadg;)V", "cartFeatureApi", "Llq/iobyxmoadg;", "yadqdtsiqt", "Llq/iobyxmoadg;", "metgxyhuhe", "()Llq/iobyxmoadg;", "setCatalogFeatureApi", "(Llq/iobyxmoadg;)V", "catalogFeatureApi", "Lzh0/iobyxmoadg;", "iozdgvuglv", "Lzh0/iobyxmoadg;", "oipsdeybqn", "()Lzh0/iobyxmoadg;", "setNetworkPanelFeatureApi", "(Lzh0/iobyxmoadg;)V", "networkPanelFeatureApi", "Lqk0/zoijcleaow;", "lmojexxdyd", "Lqk0/zoijcleaow;", "bfopjjpdmp", "()Lqk0/zoijcleaow;", "setProfileFeatureApi", "(Lqk0/zoijcleaow;)V", "profileFeatureApi", "Lng0/iobyxmoadg;", "wwaezpbzkn", "Lng0/iobyxmoadg;", "zfvoamnweg", "()Lng0/iobyxmoadg;", "setMySparFeatureApi", "(Lng0/iobyxmoadg;)V", "mySparFeatureApi", "Lb92/iobyxmoadg;", "ylkuphrtab", "Lb92/iobyxmoadg;", "zeieaojujs", "()Lb92/iobyxmoadg;", "setSupportFeatureApi", "(Lb92/iobyxmoadg;)V", "supportFeatureApi", "Lm70/ppxfxbqfkf;", "pkzmftpjix", "Lm70/ppxfxbqfkf;", "rlfsiqarku", "()Lm70/ppxfxbqfkf;", "setDebugPanel", "(Lm70/ppxfxbqfkf;)V", "debugPanel", "Ly32/iobyxmoadg;", "hcddaimhww", "Ly32/iobyxmoadg;", "jztzpxfvev", "()Ly32/iobyxmoadg;", "setAppReviewApi", "(Ly32/iobyxmoadg;)V", "appReviewApi", "La90/iobyxmoadg;", "jpowsppfya", "La90/iobyxmoadg;", "yfnezrywwk", "()La90/iobyxmoadg;", "setEchecksFeatureApi", "(La90/iobyxmoadg;)V", "echecksFeatureApi", "Lq12/iobyxmoadg;", "hkdspvbjdz", "Lq12/iobyxmoadg;", "weqkydbzbr", "()Lq12/iobyxmoadg;", "setScanGoFeatureApi", "(Lq12/iobyxmoadg;)V", "scanGoFeatureApi", "Lwz1/iobyxmoadg;", "cllcsxoeiz", "Lwz1/iobyxmoadg;", "iyctptxqzt", "()Lwz1/iobyxmoadg;", "setRateBonusProductFeatureApi", "(Lwz1/iobyxmoadg;)V", "rateBonusProductFeatureApi", "Lfs/iobyxmoadg;", "dsvhmnatus", "Lfs/iobyxmoadg;", "getCitiesFeatureApi", "()Lfs/iobyxmoadg;", "setCitiesFeatureApi", "(Lfs/iobyxmoadg;)V", "citiesFeatureApi", "Lxn/iobyxmoadg;", "wypolnanlu", "Lxn/iobyxmoadg;", "okpsazkaxt", "()Lxn/iobyxmoadg;", "setAdsFeatureApi", "(Lxn/iobyxmoadg;)V", "adsFeatureApi", "stevsuqkhv", "Lgg/gtknphoqwx;", "nuxfzjnpeb", "()Lru/myspar/main_activity/impl/draadjrbmk;", "viewModel", "kegysxyocb", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainActivity extends ru.myspar.main_activity.impl.iobyxmoadg implements sx.zoijcleaow, st.iobyxmoadg {

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static final iobyxmoadg f90155kegysxyocb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    public static final int f90156tzroggbefp = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public tp.iobyxmoadg cartFeatureApi;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata */
    public wz1.iobyxmoadg rateBonusProductFeatureApi;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    public xe0.iobyxmoadg loymaxPopupFeatureApi;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata */
    public fs.iobyxmoadg citiesFeatureApi;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public lx1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    public y32.iobyxmoadg appReviewApi;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata */
    public q12.iobyxmoadg scanGoFeatureApi;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public zh0.iobyxmoadg networkPanelFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata */
    public a90.iobyxmoadg echecksFeatureApi;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public p80.iobyxmoadg dynamicQrFeatureApi;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    public qk0.zoijcleaow profileFeatureApi;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    public m70.ppxfxbqfkf debugPanel;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public l20.zoijcleaow subscribeToDarkModeStateUseCase;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel = new sopmlzcsov(cllcsxoeiz.zoijcleaow(draadjrbmk.class), new btonecajqb(this), new dxjokdxxww(this), new gtknphoqwx(null, this));

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    public ng0.iobyxmoadg mySparFeatureApi;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata */
    public xn.iobyxmoadg adsFeatureApi;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public lq.iobyxmoadg catalogFeatureApi;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public b92.iobyxmoadg supportFeatureApi;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public n90.iobyxmoadg evropolisFeatureApi;

    public static final class btonecajqb extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.activity.nufgyqmvbu f90177zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(androidx.activity.nufgyqmvbu nufgyqmvbuVar) {
            super(0);
            this.f90177zdlpuopuiu = nufgyqmvbuVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return this.f90177zdlpuopuiu.getViewModelStore();
        }
    }

    public static final class dxjokdxxww extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.activity.nufgyqmvbu f90178zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(androidx.activity.nufgyqmvbu nufgyqmvbuVar) {
            super(0);
            this.f90178zdlpuopuiu = nufgyqmvbuVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            return this.f90178zdlpuopuiu.getDefaultViewModelProviderFactory();
        }
    }

    public static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ MainActivity f90179iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f90180jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.wkgbmnqykc f90181yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90182zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ MainActivity f90183jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f90184yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f90185zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, MainActivity mainActivity) {
                super(2, gxszxtbevoVar);
                this.f90183jyumaefscl = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f90183jyumaefscl);
                iobyxmoadgVar.f90184yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f90185zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = this.f90183jyumaefscl.lrnfpwlwnk().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
                    nufgyqmvbu nufgyqmvbuVar = this.f90183jyumaefscl.new nufgyqmvbu();
                    this.f90185zdlpuopuiu = 1;
                    if (lqeggnwhkgVarZoijcleaow.collect(nufgyqmvbuVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(androidx.appcompat.app.wkgbmnqykc wkgbmnqykcVar, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, MainActivity mainActivity) {
            super(2, gxszxtbevoVar);
            this.f90181yggfygwlhe = wkgbmnqykcVar;
            this.f90180jyumaefscl = zoijcleaowVar;
            this.f90179iwizpuwonk = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f90181yggfygwlhe, this.f90180jyumaefscl, gxszxtbevoVar, this.f90179iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90182zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f90181yggfygwlhe.getLifecycle();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lifecycle, "<get-lifecycle>(...)");
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f90180jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f90179iwizpuwonk);
                this.f90182zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class gtknphoqwx extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.activity.nufgyqmvbu f90186yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f90187zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(tg.iobyxmoadg iobyxmoadgVar, androidx.activity.nufgyqmvbu nufgyqmvbuVar) {
            super(0);
            this.f90187zdlpuopuiu = iobyxmoadgVar;
            this.f90186yggfygwlhe = nufgyqmvbuVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f90187zdlpuopuiu;
            return (iobyxmoadgVar2 == null || (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) == null) ? this.f90186yggfygwlhe.getDefaultViewModelCreationExtras() : iobyxmoadgVar;
        }
    }

    static final class gxszxtbevo implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f90188yggfygwlhe;

        static final class iobyxmoadg implements vdvldrhtss {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ vf0.iobyxmoadg f90190yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ MainActivity f90191zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.main_activity.impl.MainActivity$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            /* synthetic */ class C2068iobyxmoadg extends kotlin.jvm.internal.iobyxmoadg implements tg.draadjrbmk {
                C2068iobyxmoadg(Object obj) {
                    super(1, obj, d40.iobyxmoadg.class, "selectTab", "selectTab(Lru/myspar/core/ui/model/MainTab;Z)V", 0);
                }

                @Override // tg.draadjrbmk
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    iobyxmoadg((MainTab) obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                public final void iobyxmoadg(MainTab mainTab) {
                    d40.iobyxmoadg.iozdgvuglv((d40.iobyxmoadg) this.f60022zdlpuopuiu, mainTab, false, 2, null);
                }
            }

            public /* synthetic */ class zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final /* synthetic */ int[] f90192iobyxmoadg;

                static {
                    int[] iArr = new int[MainTab.values().length];
                    try {
                        iArr[MainTab.MY_SPAR.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MainTab.CATALOG.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MainTab.CART.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[MainTab.PROFILE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[MainTab.SUPPORT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f90192iobyxmoadg = iArr;
                }
            }

            iobyxmoadg(MainActivity mainActivity, vf0.iobyxmoadg iobyxmoadgVar) {
                this.f90191zdlpuopuiu = mainActivity;
                this.f90190yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn agtfadlqog(MainActivity mainActivity) {
                mainActivity.nuxfzjnpeb().rhgxfdycjh(ru.myspar.main_activity.impl.btonecajqb.wflxmlrfwp.f90226iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn btonecajqb(MainActivity mainActivity) {
                mainActivity.nuxfzjnpeb().rhgxfdycjh(ru.myspar.main_activity.impl.btonecajqb.eablkybsjg.f90216iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn gtknphoqwx(MainActivity mainActivity, Splash splash) {
                mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.iobyxmoadg(splash));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn ojitshcjhn(MainActivity mainActivity) {
                mainActivity.nuxfzjnpeb().rhgxfdycjh(ru.myspar.main_activity.impl.btonecajqb.gtknphoqwx.f90217iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m9.wkgbmnqykc wflxmlrfwp(MainActivity mainActivity, MainTab it) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                int i13 = zoijcleaow.f90192iobyxmoadg[it.ordinal()];
                if (i13 == 1) {
                    return mainActivity.zfvoamnweg().iobyxmoadg();
                }
                if (i13 == 2) {
                    return lq.iobyxmoadg.ppxfxbqfkf(mainActivity.metgxyhuhe(), null, 1, null);
                }
                if (i13 == 3) {
                    return mainActivity.xrmfcynszj().iobyxmoadg();
                }
                if (i13 == 4) {
                    return qk0.zoijcleaow.zoijcleaow(mainActivity.bfopjjpdmp(), null, 1, null);
                }
                if (i13 == 5) {
                    return mainActivity.zeieaojujs().iobyxmoadg();
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                lqeggnwhkg((qf0.jyumaefscl) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void lqeggnwhkg(qf0.jyumaefscl state, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1569697639, i13, -1, "ru.myspar.main_activity.impl.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:196)");
                }
                d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
                draadjrbmkVar.sopmlzcsov(1591762194);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new C2068iobyxmoadg(iobyxmoadgVar);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1591780929);
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f90191zdlpuopuiu);
                final MainActivity mainActivity = this.f90191zdlpuopuiu;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ru.myspar.main_activity.impl.ppxfxbqfkf
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return MainActivity.gxszxtbevo.iobyxmoadg.gtknphoqwx(mainActivity, (Splash) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt2;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1591764707);
                boolean zLmojexxdyd3 = draadjrbmkVar.lmojexxdyd(this.f90191zdlpuopuiu);
                final MainActivity mainActivity2 = this.f90191zdlpuopuiu;
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ru.myspar.main_activity.impl.wkgbmnqykc
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return MainActivity.gxszxtbevo.iobyxmoadg.wflxmlrfwp(mainActivity2, (MainTab) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1591785900);
                boolean zLmojexxdyd4 = draadjrbmkVar.lmojexxdyd(this.f90191zdlpuopuiu);
                final MainActivity mainActivity3 = this.f90191zdlpuopuiu;
                Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: ru.myspar.main_activity.impl.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MainActivity.gxszxtbevo.iobyxmoadg.agtfadlqog(mainActivity3);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                }
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt4;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1591790115);
                boolean zLmojexxdyd5 = draadjrbmkVar.lmojexxdyd(this.f90191zdlpuopuiu);
                final MainActivity mainActivity4 = this.f90191zdlpuopuiu;
                Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd5 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: ru.myspar.main_activity.impl.gxszxtbevo
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MainActivity.gxszxtbevo.iobyxmoadg.ojitshcjhn(mainActivity4);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
                }
                tg.iobyxmoadg iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt5;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1591793026);
                boolean zLmojexxdyd6 = draadjrbmkVar.lmojexxdyd(this.f90191zdlpuopuiu);
                final MainActivity mainActivity5 = this.f90191zdlpuopuiu;
                Object objYadqdtsiqt6 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd6 || objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: ru.myspar.main_activity.impl.lqeggnwhkg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MainActivity.gxszxtbevo.iobyxmoadg.btonecajqb(mainActivity5);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt6);
                }
                draadjrbmkVar.stevsuqkhv();
                sf0.btonecajqb.nufgyqmvbu(state, draadjrbmkVar3, draadjrbmkVar2, draadjrbmkVar4, iobyxmoadgVar2, iobyxmoadgVar3, (tg.iobyxmoadg) objYadqdtsiqt6, draadjrbmkVar, i13 & 14, 0);
                if (!state.wflxmlrfwp()) {
                    this.f90191zdlpuopuiu.jhduphickx();
                    vf0.lqeggnwhkg.eablkybsjg(this.f90190yggfygwlhe, draadjrbmkVar, 0);
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ NavigationPayload f90193jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ MainActivity f90194yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f90195zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(MainActivity mainActivity, NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f90194yggfygwlhe = mainActivity;
                this.f90193jyumaefscl = navigationPayload;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn kcexrzcfyt(MainActivity mainActivity, androidx.activity.jyumaefscl jyumaefsclVar) {
                if (xx.iobyxmoadg.f123319iobyxmoadg.iozdgvuglv() && mainActivity.rlfsiqarku().eablkybsjg()) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                d40.iobyxmoadg.f26931iobyxmoadg.draadjrbmk();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f90194yggfygwlhe, this.f90193jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f90195zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
                FragmentManager supportFragmentManager = this.f90194yggfygwlhe.getSupportFragmentManager();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(supportFragmentManager, "getSupportFragmentManager(...)");
                iobyxmoadgVar.yggfygwlhe(supportFragmentManager);
                NavigationPayload navigationPayload = this.f90193jyumaefscl;
                if (navigationPayload != null) {
                    iobyxmoadgVar.pkzmftpjix(navigationPayload);
                }
                iwizpuwonk onBackPressedDispatcher = this.f90194yggfygwlhe.getOnBackPressedDispatcher();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
                final MainActivity mainActivity = this.f90194yggfygwlhe;
                esjtqupxsv.zoijcleaow(onBackPressedDispatcher, mainActivity, false, new tg.draadjrbmk() { // from class: ru.myspar.main_activity.impl.nufgyqmvbu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return MainActivity.gxszxtbevo.zoijcleaow.kcexrzcfyt(mainActivity, (androidx.activity.jyumaefscl) obj2);
                    }
                }, 2, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        gxszxtbevo(NavigationPayload navigationPayload) {
            this.f90188yggfygwlhe = navigationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(MainActivity mainActivity, vf0.iobyxmoadg iobyxmoadgVar, ru.myspar.main_activity.impl.gtknphoqwx it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            mainActivity.roivzttewh(it, iobyxmoadgVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            zoijcleaow((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1456536448, i13, -1, "ru.myspar.main_activity.impl.MainActivity.onCreate.<anonymous> (MainActivity.kt:190)");
            }
            final vf0.iobyxmoadg iobyxmoadgVarIobyxmoadg = vf0.zoijcleaow.iobyxmoadg(draadjrbmkVar, 0);
            draadjrbmk draadjrbmkVarNuxfzjnpeb = MainActivity.this.nuxfzjnpeb();
            draadjrbmkVar.sopmlzcsov(1379067037);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(MainActivity.this) | draadjrbmkVar.lmojexxdyd(iobyxmoadgVarIobyxmoadg);
            final MainActivity mainActivity = MainActivity.this;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ru.myspar.main_activity.impl.zoijcleaow
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return MainActivity.gxszxtbevo.ppxfxbqfkf(mainActivity, iobyxmoadgVarIobyxmoadg, (gtknphoqwx) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            vx.ppxfxbqfkf.zoijcleaow(draadjrbmkVarNuxfzjnpeb, (tg.draadjrbmk) objYadqdtsiqt, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1569697639, true, new iobyxmoadg(MainActivity.this, iobyxmoadgVarIobyxmoadg), draadjrbmkVar, 54), draadjrbmkVar, 384);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVar.sopmlzcsov(1379113745);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(MainActivity.this) | draadjrbmkVar.lmojexxdyd(this.f90188yggfygwlhe);
            MainActivity mainActivity2 = MainActivity.this;
            NavigationPayload navigationPayload = this.f90188yggfygwlhe;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(mainActivity2, navigationPayload, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(wwaezpbzknVar, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 6);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* synthetic */ class lqeggnwhkg implements sj.nufgyqmvbu, agtfadlqog {
        lqeggnwhkg() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(g70.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objTbqsvytpvh = MainActivity.this.tbqsvytpvh(ppxfxbqfkfVar, gxszxtbevoVar);
            return objTbqsvytpvh == mg.zoijcleaow.gxszxtbevo() ? objTbqsvytpvh : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.vdvldrhtss(2, MainActivity.this, MainActivity.class, "handleDialogManager", "handleDialogManager(Lru/myspar/dialog_manager/api/models/DialogHolder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    static final class nufgyqmvbu implements sj.nufgyqmvbu {
        nufgyqmvbu() {
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(x00.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            e60.eablkybsjg.f30596iobyxmoadg.gxszxtbevo(MainActivity.this);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f90198cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f90200jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f90201yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f90202zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f90200jyumaefscl = obj;
            this.f90198cqumvgiudr |= Integer.MIN_VALUE;
            return MainActivity.this.tbqsvytpvh(null, this);
        }
    }

    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ MainActivity f90203iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f90204jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.wkgbmnqykc f90205yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90206zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ MainActivity f90207jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f90208yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f90209zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, MainActivity mainActivity) {
                super(2, gxszxtbevoVar);
                this.f90207jyumaefscl = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f90207jyumaefscl);
                iobyxmoadgVar.f90208yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f90209zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = this.f90207jyumaefscl.czzsidtyhn().ppxfxbqfkf();
                    lqeggnwhkg lqeggnwhkgVar = this.f90207jyumaefscl.new lqeggnwhkg();
                    this.f90209zdlpuopuiu = 1;
                    if (lqeggnwhkgVarPpxfxbqfkf.collect(lqeggnwhkgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(androidx.appcompat.app.wkgbmnqykc wkgbmnqykcVar, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, MainActivity mainActivity) {
            super(2, gxszxtbevoVar);
            this.f90205yggfygwlhe = wkgbmnqykcVar;
            this.f90204jyumaefscl = zoijcleaowVar;
            this.f90203iwizpuwonk = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f90205yggfygwlhe, this.f90204jyumaefscl, gxszxtbevoVar, this.f90203iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90206zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f90205yggfygwlhe.getLifecycle();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lifecycle, "<get-lifecycle>(...)");
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f90204jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f90203iwizpuwonk);
                this.f90206zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f90210iobyxmoadg;

        static {
            int[] iArr = new int[eg0.iobyxmoadg.values().length];
            try {
                iArr[eg0.iobyxmoadg.PROMO_CODE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eg0.iobyxmoadg.PRODUCT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eg0.iobyxmoadg.IMAGE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eg0.iobyxmoadg.TEXT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[eg0.iobyxmoadg.APP_UPDATE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f90210iobyxmoadg = iArr;
        }
    }

    private final void A(final eg0.zoijcleaow popupModel) {
        f70.zoijcleaow.ppxfxbqfkf(okpsazkaxt().wkgbmnqykc(new TextPopupDialogArgs(popupModel.gxszxtbevo(), popupModel.eablkybsjg(), popupModel.ojitshcjhn(), popupModel.draadjrbmk(), popupModel.wflxmlrfwp(), popupModel.agtfadlqog(), popupModel.ppxfxbqfkf()), new tg.iobyxmoadg() { // from class: qf0.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.B(this.f78698zdlpuopuiu, popupModel);
            }
        }), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn B(MainActivity mainActivity, eg0.zoijcleaow zoijcleaowVar) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.dxjokdxxww(zoijcleaowVar.nufgyqmvbu(), zoijcleaowVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void C(p00.ppxfxbqfkf message) {
        f70.zoijcleaow.ppxfxbqfkf(UpdateApplicationDialogFragment.INSTANCE.iobyxmoadg(message), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void a(final eg0.zoijcleaow popupModel) {
        f70.zoijcleaow.ppxfxbqfkf(okpsazkaxt().iobyxmoadg(new ImagePopupDialogArgs(popupModel.gxszxtbevo(), popupModel.eablkybsjg(), popupModel.ojitshcjhn(), popupModel.draadjrbmk(), popupModel.wflxmlrfwp(), popupModel.agtfadlqog(), popupModel.lqeggnwhkg(), popupModel.ppxfxbqfkf()), new tg.iobyxmoadg() { // from class: qf0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.b(this.f78721zdlpuopuiu, popupModel);
            }
        }), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ageimvtcrz(MainActivity mainActivity, boolean z13) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.wkgbmnqykc(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn auzgnhcxok(at.zoijcleaow zoijcleaowVar, MainActivity mainActivity) {
        skhdrjzrfn(zoijcleaowVar, mainActivity);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn b(MainActivity mainActivity, eg0.zoijcleaow zoijcleaowVar) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.dxjokdxxww(zoijcleaowVar.nufgyqmvbu(), zoijcleaowVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void c() {
        jztzpxfvev().iobyxmoadg(this, new tg.draadjrbmk() { // from class: qf0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MainActivity.d(this.f78735zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: qf0.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MainActivity.e(this.f78725zdlpuopuiu, (rx.nufgyqmvbu) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn d(MainActivity mainActivity, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        mainActivity.fiwbwshyhd();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void dvvnrvtcbc(at.zoijcleaow zoijcleaowVar, MainActivity mainActivity, List list) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.nufgyqmvbu(new at.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar.zoijcleaow(), list)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn e(MainActivity mainActivity, rx.nufgyqmvbu it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        f70.zoijcleaow.zoijcleaow(it, mainActivity.czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void eslsurpljm(EvropolisGift gift, DeliveryCode deliveryCode) {
        f70.zoijcleaow.ppxfxbqfkf(ydmasvzmpa().ppxfxbqfkf(gift, deliveryCode), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ezmngbhpjk(MainActivity mainActivity, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.gxszxtbevo(productFirst, productSecond));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void f() {
        f70.zoijcleaow.wkgbmnqykc(IqosAgreementsDialogFragment.INSTANCE.iobyxmoadg(), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void fiwbwshyhd() {
        if (i10.zoijcleaow.iobyxmoadg() != i10.iobyxmoadg.RUSTORE) {
            f70.zoijcleaow.ppxfxbqfkf(InAppReviewDialogFragment.INSTANCE.iobyxmoadg(new InAppReviewDialogArgs(null, 1, null)).iyctptxqzt(new tg.draadjrbmk() { // from class: qf0.dxjokdxxww
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return MainActivity.ageimvtcrz(this.f78695zdlpuopuiu, ((Boolean) obj).booleanValue());
                }
            }), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
        }
    }

    private final void fmlbqenlif(BuildYourComboDialogArgs dialogArgs) {
        f70.zoijcleaow.ppxfxbqfkf(BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(dialogArgs).bfopjjpdmp(new rgvfuqvkyq() { // from class: qf0.wkgbmnqykc
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.ezmngbhpjk(this.f78733zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        }), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final void fyldjkxazc(eg0.zoijcleaow popupModel) {
        String strOjitshcjhn = popupModel.ojitshcjhn();
        String strDraadjrbmk = popupModel.draadjrbmk();
        String strAgtfadlqog = popupModel.agtfadlqog();
        String strPpxfxbqfkf = popupModel.ppxfxbqfkf();
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        f70.zoijcleaow.ppxfxbqfkf(UpdateApplicationTwoDialogFragment.INSTANCE.iobyxmoadg(new UpdateApplicationTwoDialogArgs(null, null, strOjitshcjhn, strDraadjrbmk, strAgtfadlqog, strPpxfxbqfkf, popupModel.lqeggnwhkg(), 3, null)), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void g(af0.iobyxmoadg loymaxPopup, AnalyticsPage page) {
        f70.zoijcleaow.ppxfxbqfkf(sflfametgt().iobyxmoadg(loymaxPopup, page), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn grlcpdaxtj(MainActivity mainActivity) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(ru.myspar.main_activity.impl.btonecajqb.agtfadlqog.f90211iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void h() {
        f70.zoijcleaow.wkgbmnqykc(oipsdeybqn().zoijcleaow(), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hszhottldk(MainActivity mainActivity, eg0.zoijcleaow zoijcleaowVar) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.ppxfxbqfkf(zoijcleaowVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void i(String shopId, eg0.zoijcleaow popupModel) {
        int i13 = zoijcleaow.f90210iobyxmoadg[popupModel.dxjokdxxww().ordinal()];
        if (i13 == 1) {
            m(popupModel);
            return;
        }
        if (i13 == 2) {
            k(shopId, popupModel);
            return;
        }
        if (i13 == 3) {
            a(popupModel);
        } else if (i13 == 4) {
            A(popupModel);
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            fyldjkxazc(popupModel);
        }
    }

    private final void igdgnonuha(int navigationBarColor) {
        wflxmlrfwp.zoijcleaow(this, null, c60.zoijcleaow.eablkybsjg(this) ? zynmafqrjb.f2374eablkybsjg.ppxfxbqfkf(navigationBarColor) : zynmafqrjb.f2374eablkybsjg.wkgbmnqykc(navigationBarColor, navigationBarColor), 1, null);
    }

    private final boolean ikoacuggdj(List permissions) {
        Iterator it = permissions.iterator();
        while (it.hasNext()) {
            if (androidx.core.content.iobyxmoadg.checkSelfPermission(this, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    private final void ipoelvxyzq() {
        f70.zoijcleaow.zoijcleaow(weqkydbzbr().iobyxmoadg(this, new tg.iobyxmoadg() { // from class: qf0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.grlcpdaxtj(this.f78700zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: qf0.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.mhtqkkgtqm(this.f78690zdlpuopuiu);
            }
        }), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwxlajgraz(at.zoijcleaow zoijcleaowVar, MainActivity mainActivity, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        dvvnrvtcbc(zoijcleaowVar, mainActivity, it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ixidwrxhsl() {
        f70.zoijcleaow.zoijcleaow(new ya0.wkgbmnqykc(this, new tg.iobyxmoadg() { // from class: qf0.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.jrbgnlbqoe(this.f78722zdlpuopuiu);
            }
        }, null, 4, null), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final void j(PopupTypesUiModel popup) {
        if (!(popup instanceof PopupTypesUiModel.PurchaseRating)) {
            throw new NoWhenBranchMatchedException();
        }
        n((PopupTypesUiModel.PurchaseRating) popup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jhduphickx() {
        int iPpxfxbqfkf = c60.zoijcleaow.ppxfxbqfkf(this, s40.ppxfxbqfkf.colorSpecialSurface1);
        if (Build.VERSION.SDK_INT < 35) {
            getWindow().setNavigationBarColor(iPpxfxbqfkf);
        } else {
            igdgnonuha(iPpxfxbqfkf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jrbgnlbqoe(MainActivity mainActivity) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(ru.myspar.main_activity.impl.btonecajqb.lqeggnwhkg.f90221iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void k(String shopId, final eg0.zoijcleaow popupModel) {
        String strGtknphoqwx = popupModel.gtknphoqwx();
        if (strGtknphoqwx == null) {
            return;
        }
        f70.zoijcleaow.ppxfxbqfkf(okpsazkaxt().ppxfxbqfkf(new ProductDayPopupDialogArgs(popupModel.gxszxtbevo(), popupModel.eablkybsjg(), popupModel.ojitshcjhn(), popupModel.draadjrbmk(), popupModel.wflxmlrfwp(), popupModel.agtfadlqog(), shopId, popupModel.ppxfxbqfkf(), strGtknphoqwx, null, UserVerificationMethods.USER_VERIFY_NONE, null), new tg.iobyxmoadg() { // from class: qf0.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.l(this.f78694zdlpuopuiu, popupModel);
            }
        }), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void krqnebusok() {
        f70.zoijcleaow.ppxfxbqfkf(UpdateDialogFragment.INSTANCE.iobyxmoadg(), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn l(MainActivity mainActivity, eg0.zoijcleaow zoijcleaowVar) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.dxjokdxxww(f40.zoijcleaow.PRODUCT, zoijcleaowVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ void lxfrhoxuzk(MainActivity mainActivity, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        mainActivity.igdgnonuha(i13);
    }

    private final void m(eg0.zoijcleaow popupModel) {
        f70.zoijcleaow.ppxfxbqfkf(okpsazkaxt().zoijcleaow(new PromoCodePopupDialogArgs(popupModel.gxszxtbevo(), popupModel.eablkybsjg(), popupModel.ojitshcjhn(), popupModel.draadjrbmk(), popupModel.wflxmlrfwp(), popupModel.agtfadlqog(), popupModel.btonecajqb())), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn mhtqkkgtqm(MainActivity mainActivity) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(ru.myspar.main_activity.impl.btonecajqb.agtfadlqog.f90211iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void n(PopupTypesUiModel.PurchaseRating popup) {
        f70.zoijcleaow.ppxfxbqfkf(PurchaseRatingDialogFragment.INSTANCE.iobyxmoadg(popup).yfnezrywwk(new rgvfuqvkyq() { // from class: qf0.oxmwwwfdhm
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.o(this.f78723zdlpuopuiu, (f40.zoijcleaow) obj, (String) obj2);
            }
        }), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn o(MainActivity mainActivity, f40.zoijcleaow link, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(link, "link");
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.ojitshcjhn(link, str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void p(String description) {
        f70.zoijcleaow.zoijcleaow(rx.nufgyqmvbu.iobyxmoadg.wflxmlrfwp(new rx.nufgyqmvbu.iobyxmoadg(this, Boolean.TRUE, null, 4, null).nufgyqmvbu(description), pm.dxjokdxxww.f76951ok, null, 2, null).zoijcleaow(), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final void q() {
        f70.zoijcleaow.ppxfxbqfkf(uwvvkdfqfp().iobyxmoadg(new DynamicQrCodeArgs(false)), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final void r() {
        f70.zoijcleaow.ppxfxbqfkf(uwvvkdfqfp().iobyxmoadg(new DynamicQrCodeArgs(true)), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void rhgxfdycjh(PurchaseListSharedWithYouDialogArgs args) {
        f70.zoijcleaow.ppxfxbqfkf(opjhrmiecq().eablkybsjg(args), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void roivzttewh(ru.myspar.main_activity.impl.gtknphoqwx uiLabel, vf0.iobyxmoadg snackbarController) {
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.wkgbmnqykc) {
            p(((ru.myspar.main_activity.impl.gtknphoqwx.wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.kcexrzcfyt) {
            q();
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.btonecajqb) {
            rhgxfdycjh(((ru.myspar.main_activity.impl.gtknphoqwx.btonecajqb) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.draadjrbmk) {
            ru.myspar.main_activity.impl.gtknphoqwx.draadjrbmk draadjrbmkVar = (ru.myspar.main_activity.impl.gtknphoqwx.draadjrbmk) uiLabel;
            eslsurpljm(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.rgvfuqvkyq) {
            ru.myspar.main_activity.impl.gtknphoqwx.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.main_activity.impl.gtknphoqwx.rgvfuqvkyq) uiLabel;
            g(rgvfuqvkyqVar.iobyxmoadg(), rgvfuqvkyqVar.zoijcleaow());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.zoijcleaow) {
            e60.eablkybsjg.f30596iobyxmoadg.zoijcleaow();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.main_activity.impl.gtknphoqwx.ppxfxbqfkf.f90424iobyxmoadg)) {
            h();
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.cqumvgiudr) {
            snackbarController.btonecajqb(((ru.myspar.main_activity.impl.gtknphoqwx.cqumvgiudr) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.iobyxmoadg) {
            snackbarController.lqeggnwhkg();
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.eablkybsjg) {
            uawqvzlxes(((ru.myspar.main_activity.impl.gtknphoqwx.eablkybsjg) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.main_activity.impl.gtknphoqwx.agtfadlqog.f90405iobyxmoadg)) {
            c();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.main_activity.impl.gtknphoqwx.C2077gtknphoqwx.f90414iobyxmoadg)) {
            yzdjzghtvl();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.main_activity.impl.gtknphoqwx.wflxmlrfwp.f90430iobyxmoadg)) {
            krqnebusok();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.main_activity.impl.gtknphoqwx.ojitshcjhn.f90422iobyxmoadg)) {
            f();
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.zdlpuopuiu) {
            r();
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.jyumaefscl) {
            t(((ru.myspar.main_activity.impl.gtknphoqwx.jyumaefscl) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.main_activity.impl.gtknphoqwx.lqeggnwhkg.f90420iobyxmoadg)) {
            ipoelvxyzq();
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.esjtqupxsv) {
            C(((ru.myspar.main_activity.impl.gtknphoqwx.esjtqupxsv) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.iwizpuwonk) {
            x(((ru.myspar.main_activity.impl.gtknphoqwx.iwizpuwonk) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.vdvldrhtss) {
            ru.myspar.main_activity.impl.gtknphoqwx.vdvldrhtss vdvldrhtssVar = (ru.myspar.main_activity.impl.gtknphoqwx.vdvldrhtss) uiLabel;
            i(vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.gxszxtbevo) {
            wizcaqwiak(((ru.myspar.main_activity.impl.gtknphoqwx.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.yggfygwlhe) {
            s(((ru.myspar.main_activity.impl.gtknphoqwx.yggfygwlhe) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.dxjokdxxww) {
            fmlbqenlif(((ru.myspar.main_activity.impl.gtknphoqwx.dxjokdxxww) uiLabel).iobyxmoadg());
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.main_activity.impl.gtknphoqwx.nufgyqmvbu.f90421iobyxmoadg)) {
            ixidwrxhsl();
        } else {
            if (!(uiLabel instanceof ru.myspar.main_activity.impl.gtknphoqwx.oxmwwwfdhm)) {
                throw new NoWhenBranchMatchedException();
            }
            j(((ru.myspar.main_activity.impl.gtknphoqwx.oxmwwwfdhm) uiLabel).iobyxmoadg());
        }
    }

    private final void s(xa0.wflxmlrfwp params) {
        new xa0.draadjrbmk.iobyxmoadg(this, Boolean.TRUE, null, 4, null).zoijcleaow(params).iobyxmoadg().show();
    }

    private static final void skhdrjzrfn(at.zoijcleaow zoijcleaowVar, MainActivity mainActivity) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.nufgyqmvbu(new at.ppxfxbqfkf.zoijcleaow(zoijcleaowVar.zoijcleaow())));
    }

    private final void t(pf0.eablkybsjg params) {
        f70.zoijcleaow.ppxfxbqfkf(RateOrderDialogFragment.INSTANCE.iobyxmoadg(new RateOrderDialogArgs(params.ppxfxbqfkf(), params.zoijcleaow(), params.iobyxmoadg(), params.eablkybsjg(), params.wkgbmnqykc())).weqkydbzbr(new tg.iobyxmoadg() { // from class: qf0.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.u();
            }
        }).iyctptxqzt(new tg.draadjrbmk() { // from class: qf0.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MainActivity.v(this.f78699zdlpuopuiu, (MySparScreenPayload) obj);
            }
        }), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object tbqsvytpvh(g70.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar2;
        MainActivity mainActivity;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar2 = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar2.f90198cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar2.f90198cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar2.f90200jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar2.f90198cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            mainActivity = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (g70.ppxfxbqfkf) ppxfxbqfkfVar2.f90201yggfygwlhe;
            mainActivity = (MainActivity) ppxfxbqfkfVar2.f90202zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th2) {
                mainActivity.czzsidtyhn().iobyxmoadg(g70.iobyxmoadg.ppxfxbqfkf.f36556iobyxmoadg);
                mainActivity.pmvmpeiblj(th2);
            }
        }
        while (((qf0.jyumaefscl) mainActivity.nuxfzjnpeb().getState().getValue()).wflxmlrfwp()) {
            ppxfxbqfkfVar2.f90202zdlpuopuiu = mainActivity;
            ppxfxbqfkfVar2.f90201yggfygwlhe = ppxfxbqfkfVar;
            ppxfxbqfkfVar2.f90198cqumvgiudr = 1;
            if (pj.crxdokpmqz.zoijcleaow(50L, ppxfxbqfkfVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(supportFragmentManager, "getSupportFragmentManager(...)");
        f70.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar, supportFragmentManager);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn u() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void uawqvzlxes(final at.zoijcleaow request) {
        if (ikoacuggdj(request.iobyxmoadg())) {
            skhdrjzrfn(request, this);
            return;
        }
        eablkybsjg.ppxfxbqfkf activityResultRegistry = getActivityResultRegistry();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(activityResultRegistry, "<get-activityResultRegistry>(...)");
        u40.zoijcleaow.zoijcleaow(activityResultRegistry, request.zoijcleaow(), new tg.iobyxmoadg() { // from class: qf0.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.auzgnhcxok(request, this);
            }
        }, new tg.draadjrbmk() { // from class: qf0.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MainActivity.iwxlajgraz(request, this, (List) obj);
            }
        }, (String[]) request.iobyxmoadg().toArray(new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn v(MainActivity mainActivity, MySparScreenPayload payload) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.C2069btonecajqb(payload));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void w(g70.wkgbmnqykc screenKey, Integer bonusQuantity) {
        f70.zoijcleaow.zoijcleaow(iyctptxqzt().iobyxmoadg(this, new RateProductResultDialogArgs(bonusQuantity)), czzsidtyhn(), screenKey);
    }

    private final void wizcaqwiak(final eg0.zoijcleaow popupModel) {
        f70.zoijcleaow.zoijcleaow(ee0.zoijcleaow.zoijcleaow(ee0.zoijcleaow.f31209iobyxmoadg, this, new tg.iobyxmoadg() { // from class: qf0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.hszhottldk(this.f78719zdlpuopuiu, popupModel);
            }
        }, null, null, rx.ppxfxbqfkf.VERTICAL, 12, null), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void x(final ReviewWithBonuses reviewWithBonuses) {
        final g70.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = reviewWithBonuses.lqeggnwhkg() ? g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY") : new g70.wkgbmnqykc.iobyxmoadg(hg.jyumaefscl.eablkybsjg("MY_SPAR_SCREEN_KEY"));
        f70.zoijcleaow.ppxfxbqfkf(iyctptxqzt().zoijcleaow(new ReviewWithBonusesDialogArgs(reviewWithBonuses), new tg.iobyxmoadg() { // from class: qf0.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.y(this.f78728zdlpuopuiu, wkgbmnqykcVarIobyxmoadg, reviewWithBonuses);
            }
        }).tzroggbefp(new tg.iobyxmoadg() { // from class: qf0.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.z(this.f78730zdlpuopuiu, reviewWithBonuses);
            }
        }), czzsidtyhn(), wkgbmnqykcVarIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn y(MainActivity mainActivity, g70.wkgbmnqykc wkgbmnqykcVar, ReviewWithBonuses reviewWithBonuses) {
        mainActivity.w(wkgbmnqykcVar, reviewWithBonuses.getBonusQuantity());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yzdjzghtvl() {
        f70.zoijcleaow.ppxfxbqfkf(yfnezrywwk().iobyxmoadg(), czzsidtyhn(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn z(MainActivity mainActivity, ReviewWithBonuses reviewWithBonuses) {
        mainActivity.nuxfzjnpeb().rhgxfdycjh(new ru.myspar.main_activity.impl.btonecajqb.draadjrbmk(reviewWithBonuses));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // vx.wkgbmnqykc, androidx.appcompat.app.wkgbmnqykc, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(base, "base");
        e60.iobyxmoadg.f30600iobyxmoadg.iobyxmoadg(base);
        super.attachBaseContext(base);
    }

    public final qk0.zoijcleaow bfopjjpdmp() {
        qk0.zoijcleaow zoijcleaowVar = this.profileFeatureApi;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("profileFeatureApi");
        return null;
    }

    public final f70.iobyxmoadg czzsidtyhn() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    @Override // sx.zoijcleaow
    public void iobyxmoadg(Fragment fragment) {
        String tag;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragment, "fragment");
        if ((fragment instanceof TabContainerFragment) || (tag = fragment.getTag()) == null) {
            return;
        }
        czzsidtyhn().iobyxmoadg(new g70.iobyxmoadg.C0821iobyxmoadg(tag));
    }

    public final wz1.iobyxmoadg iyctptxqzt() {
        wz1.iobyxmoadg iobyxmoadgVar = this.rateBonusProductFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("rateBonusProductFeatureApi");
        return null;
    }

    public final y32.iobyxmoadg jztzpxfvev() {
        y32.iobyxmoadg iobyxmoadgVar = this.appReviewApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("appReviewApi");
        return null;
    }

    public final l20.zoijcleaow lrnfpwlwnk() {
        l20.zoijcleaow zoijcleaowVar = this.subscribeToDarkModeStateUseCase;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("subscribeToDarkModeStateUseCase");
        return null;
    }

    public final lq.iobyxmoadg metgxyhuhe() {
        lq.iobyxmoadg iobyxmoadgVar = this.catalogFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("catalogFeatureApi");
        return null;
    }

    protected draadjrbmk nuxfzjnpeb() {
        return (draadjrbmk) this.viewModel.getValue();
    }

    public final zh0.iobyxmoadg oipsdeybqn() {
        zh0.iobyxmoadg iobyxmoadgVar = this.networkPanelFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("networkPanelFeatureApi");
        return null;
    }

    public final xn.iobyxmoadg okpsazkaxt() {
        xn.iobyxmoadg iobyxmoadgVar = this.adsFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("adsFeatureApi");
        return null;
    }

    @Override // ru.myspar.main_activity.impl.iobyxmoadg, androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lxfrhoxuzk(this, 0, 1, null);
        NavigationPayload navigationPayloadIobyxmoadg = g40.zoijcleaow.f36188iobyxmoadg.iobyxmoadg(getIntent());
        if (savedInstanceState != null) {
            navigationPayloadIobyxmoadg = null;
        }
        ppxfxbqfkf.zoijcleaow.zoijcleaow(this, null, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1456536448, true, new gxszxtbevo(navigationPayloadIobyxmoadg)), 1, null);
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new wkgbmnqykc(this, zoijcleaowVar, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new eablkybsjg(this, zoijcleaowVar, null, this), 3, null);
    }

    @Override // ru.myspar.main_activity.impl.iobyxmoadg, androidx.appcompat.app.wkgbmnqykc, androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onDestroy() {
        czzsidtyhn().clear();
        super.onDestroy();
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    protected void onNewIntent(Intent intent) {
        NavigationPayload navigationPayloadIobyxmoadg = g40.zoijcleaow.f36188iobyxmoadg.iobyxmoadg(intent);
        if (navigationPayloadIobyxmoadg != null) {
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadIobyxmoadg);
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onResume() {
        super.onResume();
        nuxfzjnpeb().rhgxfdycjh(ru.myspar.main_activity.impl.btonecajqb.zoijcleaow.f90228iobyxmoadg);
    }

    public final lx1.iobyxmoadg opjhrmiecq() {
        lx1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    public final m70.ppxfxbqfkf rlfsiqarku() {
        m70.ppxfxbqfkf ppxfxbqfkfVar = this.debugPanel;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("debugPanel");
        return null;
    }

    public final xe0.iobyxmoadg sflfametgt() {
        xe0.iobyxmoadg iobyxmoadgVar = this.loymaxPopupFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("loymaxPopupFeatureApi");
        return null;
    }

    public final p80.iobyxmoadg uwvvkdfqfp() {
        p80.iobyxmoadg iobyxmoadgVar = this.dynamicQrFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dynamicQrFeatureApi");
        return null;
    }

    public final q12.iobyxmoadg weqkydbzbr() {
        q12.iobyxmoadg iobyxmoadgVar = this.scanGoFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("scanGoFeatureApi");
        return null;
    }

    public final tp.iobyxmoadg xrmfcynszj() {
        tp.iobyxmoadg iobyxmoadgVar = this.cartFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("cartFeatureApi");
        return null;
    }

    public final n90.iobyxmoadg ydmasvzmpa() {
        n90.iobyxmoadg iobyxmoadgVar = this.evropolisFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("evropolisFeatureApi");
        return null;
    }

    public final a90.iobyxmoadg yfnezrywwk() {
        a90.iobyxmoadg iobyxmoadgVar = this.echecksFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("echecksFeatureApi");
        return null;
    }

    public final b92.iobyxmoadg zeieaojujs() {
        b92.iobyxmoadg iobyxmoadgVar = this.supportFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("supportFeatureApi");
        return null;
    }

    public final ng0.iobyxmoadg zfvoamnweg() {
        ng0.iobyxmoadg iobyxmoadgVar = this.mySparFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("mySparFeatureApi");
        return null;
    }

    @Override // st.iobyxmoadg
    public void zoijcleaow(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
        HintNavLink navLink = hint.getNavLink();
        if (hint.getBottomSheetInfo() != null) {
            f70.zoijcleaow.ppxfxbqfkf(metgxyhuhe().zoijcleaow(new HintDialogArgs(hint, analyticsInfo)), czzsidtyhn(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
        } else if (navLink != null) {
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(navLink.getNavLink()), navLink.getReference(), null, null, false, null, null, false, 252, null));
        }
    }
}
