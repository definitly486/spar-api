package ru.myspar.proloyalty.main_activity.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.esjtqupxsv;
import androidx.activity.zynmafqrjb;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.lifecycle.sopmlzcsov;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ed1.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import it1.Splash;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import ru.myspar.proloyalty.ads.api.model.ImagePopupDialogArgs;
import ru.myspar.proloyalty.ads.api.model.ProductDayPopupDialogArgs;
import ru.myspar.proloyalty.ads.api.model.PromoCodePopupDialogArgs;
import ru.myspar.proloyalty.ads.api.model.TextPopupDialogArgs;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.auth.api.model.EmailVerifyDialogArgs;
import ru.myspar.proloyalty.catalog.api.model.HintDialogArgs;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintNavLink;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.domain.models.payload.MySparScreenPayload;
import ru.myspar.proloyalty.core.domain.models.reviewWithBonuses.ReviewWithBonuses;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.navigation.containers.TabContainerFragment;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.domain.feature.rateorder.model.RateOrderDialogArgs;
import ru.myspar.proloyalty.domain.feature.review.store.InAppReviewDialogArgs;
import ru.myspar.proloyalty.domain.feature.updateapplicationtwo.store.UpdateApplicationTwoDialogArgs;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.iqos.IqosAgreementsDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder.RateOrderDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.update.UpdateApplicationDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.update.UpdateDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.updateapplicationtwo.UpdateApplicationTwoDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.proloyalty.legacy.presentation.screen.review.InAppReviewDialogFragment;
import ru.myspar.proloyalty.main_activity.impl.MainActivity;
import ru.myspar.proloyalty.main_activity.impl.dialogs_interactor.dialog.purchaserating.PurchaseRatingDialogFragment;
import ru.myspar.proloyalty.main_activity.impl.models.PopupTypesUiModel;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.proloyalty.rate.rate_bonus_product.api.model.RateProductResultDialogArgs;
import ru.myspar.proloyalty.rate.rate_bonus_product.api.model.ReviewWithBonusesDialogArgs;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import uc1.iwizpuwonk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¤\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ³\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0084\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00103\u001a\u0002022\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e00H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010\u0006J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u001eH\u0002¢\u0006\u0004\b;\u0010!J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\b@\u0010\u0006J\u0017\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ!\u0010L\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\b\u0010K\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010Q\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bU\u0010RJ\u0017\u0010V\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bV\u0010TJ\u0017\u0010W\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bW\u0010TJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bX\u0010TJ\u0017\u0010Z\u001a\u00020\u00072\u0006\u0010=\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\b\\\u0010TJ\u0017\u0010_\u001a\u00020\u00072\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0007H\u0002¢\u0006\u0004\ba\u0010\u0006J\u0017\u0010c\u001a\u00020\u00072\u0006\u0010'\u001a\u00020bH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010'\u001a\u00020eH\u0002¢\u0006\u0004\bf\u0010gJ\u001f\u0010l\u001a\u00020\u00072\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\u00072\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u0007H\u0002¢\u0006\u0004\br\u0010\u0006J\u0019\u0010u\u001a\u00020\u00072\b\u0010t\u001a\u0004\u0018\u00010sH\u0014¢\u0006\u0004\bu\u0010vJ\u0019\u0010y\u001a\u00020\u00072\b\u0010x\u001a\u0004\u0018\u00010wH\u0014¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020\u0007H\u0014¢\u0006\u0004\b{\u0010\u0006J\u000f\u0010|\u001a\u00020\u0007H\u0014¢\u0006\u0004\b|\u0010\u0006J\u001f\u0010}\u001a\u00020\u00072\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\b}\u0010mJ\u001a\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020~H\u0014¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0084\u0001\u001a\u00020\u00072\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¥\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010µ\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R*\u0010½\u0001\u001a\u00030¶\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R*\u0010Å\u0001\u001a\u00030¾\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R*\u0010Í\u0001\u001a\u00030Æ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Õ\u0001\u001a\u00030Î\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R*\u0010Ý\u0001\u001a\u00030Ö\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R*\u0010å\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R*\u0010í\u0001\u001a\u00030æ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R*\u0010õ\u0001\u001a\u00030î\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R*\u0010ý\u0001\u001a\u00030ö\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R*\u0010\u0085\u0002\u001a\u00030þ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÿ\u0001\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R*\u0010\u008d\u0002\u001a\u00030\u0086\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R*\u0010\u0095\u0002\u001a\u00030\u008e\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002\"\u0006\b\u0093\u0002\u0010\u0094\u0002R*\u0010\u009d\u0002\u001a\u00030\u0096\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002\"\u0006\b\u009b\u0002\u0010\u009c\u0002R*\u0010¥\u0002\u001a\u00030\u009e\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0002\u0010 \u0002\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R*\u0010\u00ad\u0002\u001a\u00030¦\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R \u0010²\u0002\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0002\u0010¯\u0002\u001a\u0006\b°\u0002\u0010±\u0002¨\u0006´\u0002"}, d2 = {"Lru/myspar/proloyalty/main_activity/impl/MainActivity;", "Lsw0/iobyxmoadg;", "Lru/myspar/proloyalty/main_activity/impl/ojitshcjhn;", "Lpw0/zoijcleaow;", "Lms0/iobyxmoadg;", "<init>", "()V", "Lgg/wwaezpbzkn;", "ikoacuggdj", "", "navigationBarColor", "ageimvtcrz", "(I)V", "Lru/myspar/proloyalty/main_activity/impl/agtfadlqog;", "uiLabel", "Lzc1/iobyxmoadg;", "snackbarController", "dvvnrvtcbc", "(Lru/myspar/proloyalty/main_activity/impl/agtfadlqog;Lzc1/iobyxmoadg;)V", "Lv51/ppxfxbqfkf;", "dialogHolder", "auzgnhcxok", "(Lv51/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift;", "gift", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "e", "(Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;)V", "x", "", "description", "w", "(Ljava/lang/String;)V", "Lru/myspar/proloyalty/purchases/api/model/PurchaseListSharedWithYouDialogArgs;", "args", "b", "(Lru/myspar/proloyalty/purchases/api/model/PurchaseListSharedWithYouDialogArgs;)V", "Lhh1/btonecajqb;", "popup", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;", "analyticsPage", "o", "(Lhh1/btonecajqb;Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;)V", "Lur0/zoijcleaow;", "request", "igdgnonuha", "(Lur0/zoijcleaow;)V", "", "permissions", "", "okpsazkaxt", "(Ljava/util/List;)Z", "k", "mhtqkkgtqm", "c", "f", "n", Scopes.EMAIL, "d", "Ltc1/ppxfxbqfkf;", "params", "z", "(Ltc1/ppxfxbqfkf;)V", "fmlbqenlif", "Lhz0/ppxfxbqfkf;", "message", "I", "(Lhz0/ppxfxbqfkf;)V", "Lru/myspar/proloyalty/core/domain/models/reviewWithBonuses/ReviewWithBonuses;", "reviewWithBonuses", "D", "(Lru/myspar/proloyalty/core/domain/models/reviewWithBonuses/ReviewWithBonuses;)V", "Lv51/wkgbmnqykc;", "screenKey", "bonusQuantity", "C", "(Lv51/wkgbmnqykc;Ljava/lang/Integer;)V", "shopId", "Ljd1/ppxfxbqfkf;", "popupModel", "p", "(Ljava/lang/String;Ljd1/ppxfxbqfkf;)V", "t", "(Ljd1/ppxfxbqfkf;)V", "r", "i", "G", "jrbgnlbqoe", "Lx81/wflxmlrfwp;", "y", "(Lx81/wflxmlrfwp;)V", "ipoelvxyzq", "Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "dialogArgs", "krqnebusok", "(Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "yzdjzghtvl", "Lru/myspar/proloyalty/main_activity/impl/models/PopupTypesUiModel;", "q", "(Lru/myspar/proloyalty/main_activity/impl/models/PopupTypesUiModel;)V", "Lru/myspar/proloyalty/main_activity/impl/models/PopupTypesUiModel$PurchaseRating;", "u", "(Lru/myspar/proloyalty/main_activity/impl/models/PopupTypesUiModel$PurchaseRating;)V", "Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;", "hint", "Lru/myspar/proloyalty/common/view/hint/model/HintDialogAnalyticsInfo;", "analyticsInfo", "g", "(Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;Lru/myspar/proloyalty/common/view/hint/model/HintDialogAnalyticsInfo;)V", "Lru/myspar/proloyalty/common/view/hint/model/HintNavLink;", "navLink", "iwxlajgraz", "(Lru/myspar/proloyalty/common/view/hint/model/HintNavLink;)V", "skhdrjzrfn", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onDestroy", "ppxfxbqfkf", "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "Landroidx/fragment/app/Fragment;", "fragment", "iobyxmoadg", "(Landroidx/fragment/app/Fragment;)V", "Lzg1/iobyxmoadg;", "cqumvgiudr", "Lzg1/iobyxmoadg;", "iyctptxqzt", "()Lzg1/iobyxmoadg;", "setPopupsFeatureApi", "(Lzg1/iobyxmoadg;)V", "popupsFeatureApi", "Lri1/iobyxmoadg;", "esjtqupxsv", "Lri1/iobyxmoadg;", "lrnfpwlwnk", "()Lri1/iobyxmoadg;", "setPurchasesFeatureApi", "(Lri1/iobyxmoadg;)V", "purchasesFeatureApi", "Ly61/iobyxmoadg;", "lereixgezr", "Ly61/iobyxmoadg;", "sflfametgt", "()Ly61/iobyxmoadg;", "setDynamicQrFeatureApi", "(Ly61/iobyxmoadg;)V", "dynamicQrFeatureApi", "Lu01/zoijcleaow;", "pmvmpeiblj", "Lu01/zoijcleaow;", "tbqsvytpvh", "()Lu01/zoijcleaow;", "setSubscribeToDarkModeStateUseCase", "(Lu01/zoijcleaow;)V", "subscribeToDarkModeStateUseCase", "Lr71/iobyxmoadg;", "zynmafqrjb", "Lr71/iobyxmoadg;", "oipsdeybqn", "()Lr71/iobyxmoadg;", "setEvropolisFeatureApi", "(Lr71/iobyxmoadg;)V", "evropolisFeatureApi", "Lu51/iobyxmoadg;", "istkbnxepw", "Lu51/iobyxmoadg;", "ydmasvzmpa", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Leo0/iobyxmoadg;", "cdpycssgdh", "Leo0/iobyxmoadg;", "rlfsiqarku", "()Leo0/iobyxmoadg;", "setCartFeatureApi", "(Leo0/iobyxmoadg;)V", "cartFeatureApi", "Lxo0/iobyxmoadg;", "yadqdtsiqt", "Lxo0/iobyxmoadg;", "czzsidtyhn", "()Lxo0/iobyxmoadg;", "setCatalogFeatureApi", "(Lxo0/iobyxmoadg;)V", "catalogFeatureApi", "La51/iobyxmoadg;", "iozdgvuglv", "La51/iobyxmoadg;", "uwvvkdfqfp", "()La51/iobyxmoadg;", "setDebugPanelFeatureApi", "(La51/iobyxmoadg;)V", "debugPanelFeatureApi", "Lgi1/iobyxmoadg;", "lmojexxdyd", "Lgi1/iobyxmoadg;", "weqkydbzbr", "()Lgi1/iobyxmoadg;", "setProfileFeatureApi", "(Lgi1/iobyxmoadg;)V", "profileFeatureApi", "Lsd1/iobyxmoadg;", "wwaezpbzkn", "Lsd1/iobyxmoadg;", "opjhrmiecq", "()Lsd1/iobyxmoadg;", "setMySparFeatureApi", "(Lsd1/iobyxmoadg;)V", "mySparFeatureApi", "Lvu1/iobyxmoadg;", "ylkuphrtab", "Lvu1/iobyxmoadg;", "roivzttewh", "()Lvu1/iobyxmoadg;", "setSupportFeatureApi", "(Lvu1/iobyxmoadg;)V", "supportFeatureApi", "Lup1/iobyxmoadg;", "pkzmftpjix", "Lup1/iobyxmoadg;", "xrmfcynszj", "()Lup1/iobyxmoadg;", "setAppReviewApi", "(Lup1/iobyxmoadg;)V", "appReviewApi", "Lk71/iobyxmoadg;", "hcddaimhww", "Lk71/iobyxmoadg;", "zfvoamnweg", "()Lk71/iobyxmoadg;", "setEchecksFeatureApi", "(Lk71/iobyxmoadg;)V", "echecksFeatureApi", "Lmn1/iobyxmoadg;", "jpowsppfya", "Lmn1/iobyxmoadg;", "nuxfzjnpeb", "()Lmn1/iobyxmoadg;", "setScanGoFeatureApi", "(Lmn1/iobyxmoadg;)V", "scanGoFeatureApi", "Lnl1/iobyxmoadg;", "hkdspvbjdz", "Lnl1/iobyxmoadg;", "zeieaojujs", "()Lnl1/iobyxmoadg;", "setRateBonusProductFeatureApi", "(Lnl1/iobyxmoadg;)V", "rateBonusProductFeatureApi", "Lvq0/iobyxmoadg;", "cllcsxoeiz", "Lvq0/iobyxmoadg;", "getCitiesFeatureApi", "()Lvq0/iobyxmoadg;", "setCitiesFeatureApi", "(Lvq0/iobyxmoadg;)V", "citiesFeatureApi", "Lim0/iobyxmoadg;", "dsvhmnatus", "Lim0/iobyxmoadg;", "jztzpxfvev", "()Lim0/iobyxmoadg;", "setAdsFeatureApi", "(Lim0/iobyxmoadg;)V", "adsFeatureApi", "Lan0/iobyxmoadg;", "wypolnanlu", "Lan0/iobyxmoadg;", "metgxyhuhe", "()Lan0/iobyxmoadg;", "setAuthFeatureApi", "(Lan0/iobyxmoadg;)V", "authFeatureApi", "Lw01/btonecajqb;", "stevsuqkhv", "Lw01/btonecajqb;", "bfopjjpdmp", "()Lw01/btonecajqb;", "setGetActiveEditOrderIdUseCase", "(Lw01/btonecajqb;)V", "getActiveEditOrderIdUseCase", "La51/zoijcleaow;", "kegysxyocb", "La51/zoijcleaow;", "yfnezrywwk", "()La51/zoijcleaow;", "setDebugPanelFeatureObserver", "(La51/zoijcleaow;)V", "debugPanelFeatureObserver", "tzroggbefp", "Lgg/gtknphoqwx;", "uawqvzlxes", "()Lru/myspar/proloyalty/main_activity/impl/ojitshcjhn;", "viewModel", "mbcevpiqjq", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainActivity extends ru.myspar.proloyalty.main_activity.impl.iobyxmoadg implements pw0.zoijcleaow, ms0.iobyxmoadg {

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private static final iobyxmoadg f97718mbcevpiqjq = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    public static final int f97719ntlheqmsrt = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public eo0.iobyxmoadg cartFeatureApi;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata */
    public vq0.iobyxmoadg citiesFeatureApi;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    public zg1.iobyxmoadg popupsFeatureApi;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata */
    public im0.iobyxmoadg adsFeatureApi;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public ri1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    public k71.iobyxmoadg echecksFeatureApi;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata */
    public nl1.iobyxmoadg rateBonusProductFeatureApi;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public a51.iobyxmoadg debugPanelFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata */
    public mn1.iobyxmoadg scanGoFeatureApi;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata */
    public a51.zoijcleaow debugPanelFeatureObserver;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public y61.iobyxmoadg dynamicQrFeatureApi;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    public gi1.iobyxmoadg profileFeatureApi;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    public up1.iobyxmoadg appReviewApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public u01.zoijcleaow subscribeToDarkModeStateUseCase;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata */
    public w01.btonecajqb getActiveEditOrderIdUseCase;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel = new sopmlzcsov(cllcsxoeiz.zoijcleaow(ojitshcjhn.class), new gtknphoqwx(this), new btonecajqb(this), new draadjrbmk(null, this));

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    public sd1.iobyxmoadg mySparFeatureApi;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata */
    public an0.iobyxmoadg authFeatureApi;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public xo0.iobyxmoadg catalogFeatureApi;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public vu1.iobyxmoadg supportFeatureApi;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public r71.iobyxmoadg evropolisFeatureApi;

    public static final class btonecajqb extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.activity.nufgyqmvbu f97742zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(androidx.activity.nufgyqmvbu nufgyqmvbuVar) {
            super(0);
            this.f97742zdlpuopuiu = nufgyqmvbuVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            return this.f97742zdlpuopuiu.getDefaultViewModelProviderFactory();
        }
    }

    public static final class draadjrbmk extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.activity.nufgyqmvbu f97743yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97744zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(tg.iobyxmoadg iobyxmoadgVar, androidx.activity.nufgyqmvbu nufgyqmvbuVar) {
            super(0);
            this.f97744zdlpuopuiu = iobyxmoadgVar;
            this.f97743yggfygwlhe = nufgyqmvbuVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f97744zdlpuopuiu;
            return (iobyxmoadgVar2 == null || (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) == null) ? this.f97743yggfygwlhe.getDefaultViewModelCreationExtras() : iobyxmoadgVar;
        }
    }

    public static final class dxjokdxxww implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MainActivity f97745yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f97746zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ MainActivity f97747yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f97748zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.MainActivity$dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2308iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f97750yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f97751zdlpuopuiu;

                public C2308iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f97751zdlpuopuiu = obj;
                    this.f97750yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, MainActivity mainActivity) {
                this.f97748zdlpuopuiu = nufgyqmvbuVar;
                this.f97747yggfygwlhe = mainActivity;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2308iobyxmoadg c2308iobyxmoadg;
                if (gxszxtbevoVar instanceof C2308iobyxmoadg) {
                    c2308iobyxmoadg = (C2308iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2308iobyxmoadg.f97750yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2308iobyxmoadg.f97750yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2308iobyxmoadg = new C2308iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2308iobyxmoadg = new C2308iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2308iobyxmoadg.f97751zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2308iobyxmoadg.f97750yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f97748zdlpuopuiu;
                    if (((iwizpuwonk) this.f97747yggfygwlhe.uawqvzlxes().getState().getValue()).gtknphoqwx() == null) {
                        c2308iobyxmoadg.f97750yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2308iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public dxjokdxxww(sj.lqeggnwhkg lqeggnwhkgVar, MainActivity mainActivity) {
            this.f97746zdlpuopuiu = lqeggnwhkgVar;
            this.f97745yggfygwlhe = mainActivity;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f97746zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f97745yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ MainActivity f97752iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f97753jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.wkgbmnqykc f97754yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97755zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ MainActivity f97756jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f97757yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97758zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, MainActivity mainActivity) {
                super(2, gxszxtbevoVar);
                this.f97756jyumaefscl = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f97756jyumaefscl);
                iobyxmoadgVar.f97757yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f97758zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = this.f97756jyumaefscl.tbqsvytpvh().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
                    nufgyqmvbu nufgyqmvbuVar = this.f97756jyumaefscl.new nufgyqmvbu();
                    this.f97758zdlpuopuiu = 1;
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
            this.f97754yggfygwlhe = wkgbmnqykcVar;
            this.f97753jyumaefscl = zoijcleaowVar;
            this.f97752iwizpuwonk = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f97754yggfygwlhe, this.f97753jyumaefscl, gxszxtbevoVar, this.f97752iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97755zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f97754yggfygwlhe.getLifecycle();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lifecycle, "<get-lifecycle>(...)");
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f97753jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f97752iwizpuwonk);
                this.f97755zdlpuopuiu = 1;
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

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.activity.nufgyqmvbu f97759zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(androidx.activity.nufgyqmvbu nufgyqmvbuVar) {
            super(0);
            this.f97759zdlpuopuiu = nufgyqmvbuVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return this.f97759zdlpuopuiu.getViewModelStore();
        }
    }

    static final class gxszxtbevo implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f97760yggfygwlhe;

        static final class iobyxmoadg implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zc1.iobyxmoadg f97762yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ MainActivity f97763zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.MainActivity$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2309iobyxmoadg implements vdvldrhtss {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ zc1.iobyxmoadg f97764yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ MainActivity f97765zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.MainActivity$gxszxtbevo$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public /* synthetic */ class C2310iobyxmoadg {

                    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                    public static final /* synthetic */ int[] f97766iobyxmoadg;

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
                        f97766iobyxmoadg = iArr;
                    }
                }

                C2309iobyxmoadg(MainActivity mainActivity, zc1.iobyxmoadg iobyxmoadgVar) {
                    this.f97765zdlpuopuiu = mainActivity;
                    this.f97764yggfygwlhe = iobyxmoadgVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn agtfadlqog(MainActivity mainActivity, Splash splash) {
                    mainActivity.uawqvzlxes().q(new wflxmlrfwp.wkgbmnqykc(splash));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn iwizpuwonk(MainActivity mainActivity) {
                    mainActivity.uawqvzlxes().q(wflxmlrfwp.zoijcleaow.f98060iobyxmoadg);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn jyumaefscl(MainActivity mainActivity) {
                    mainActivity.uawqvzlxes().q(wflxmlrfwp.draadjrbmk.f98043iobyxmoadg);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn kcexrzcfyt(MainActivity mainActivity) {
                    mainActivity.uawqvzlxes().q(wflxmlrfwp.rgvfuqvkyq.f98056iobyxmoadg);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn ojitshcjhn(MainActivity mainActivity) {
                    mainActivity.uawqvzlxes().q(wflxmlrfwp.ppxfxbqfkf.f98055iobyxmoadg);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn oxmwwwfdhm(MainActivity mainActivity) {
                    mainActivity.uawqvzlxes().q(wflxmlrfwp.ojitshcjhn.f98052iobyxmoadg);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final m9.wkgbmnqykc yggfygwlhe(MainActivity mainActivity, MainTab it) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                    int i13 = C2310iobyxmoadg.f97766iobyxmoadg[it.ordinal()];
                    if (i13 == 1) {
                        return mainActivity.opjhrmiecq().iobyxmoadg();
                    }
                    if (i13 == 2) {
                        return xo0.iobyxmoadg.wkgbmnqykc(mainActivity.czzsidtyhn(), null, 1, null);
                    }
                    if (i13 == 3) {
                        return mainActivity.rlfsiqarku().iobyxmoadg();
                    }
                    if (i13 == 4) {
                        return mainActivity.weqkydbzbr().iobyxmoadg();
                    }
                    if (i13 == 5) {
                        return mainActivity.roivzttewh().iobyxmoadg();
                    }
                    throw new NoWhenBranchMatchedException();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn zdlpuopuiu(MainActivity mainActivity, MainTab it) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                    mainActivity.uawqvzlxes().q(new wflxmlrfwp.agtfadlqog(it));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.vdvldrhtss
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    wflxmlrfwp((iwizpuwonk) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                public final void wflxmlrfwp(iwizpuwonk state, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(107971418, i13, -1, "ru.myspar.proloyalty.main_activity.impl.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:213)");
                    }
                    draadjrbmkVar.sopmlzcsov(-1518885077);
                    boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f97765zdlpuopuiu);
                    final MainActivity mainActivity = this.f97765zdlpuopuiu;
                    Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                    if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.main_activity.impl.ppxfxbqfkf
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return MainActivity.gxszxtbevo.iobyxmoadg.C2309iobyxmoadg.agtfadlqog(mainActivity, (Splash) obj);
                            }
                        };
                        draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                    }
                    tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt;
                    draadjrbmkVar.stevsuqkhv();
                    draadjrbmkVar.sopmlzcsov(-1518905689);
                    boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f97765zdlpuopuiu);
                    final MainActivity mainActivity2 = this.f97765zdlpuopuiu;
                    Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                    if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.main_activity.impl.wkgbmnqykc
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return MainActivity.gxszxtbevo.iobyxmoadg.C2309iobyxmoadg.zdlpuopuiu(mainActivity2, (MainTab) obj);
                            }
                        };
                        draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                    }
                    tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt2;
                    draadjrbmkVar.stevsuqkhv();
                    draadjrbmkVar.sopmlzcsov(-1518902427);
                    boolean zLmojexxdyd3 = draadjrbmkVar.lmojexxdyd(this.f97765zdlpuopuiu);
                    final MainActivity mainActivity3 = this.f97765zdlpuopuiu;
                    Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                    if (zLmojexxdyd3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.main_activity.impl.eablkybsjg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return MainActivity.gxszxtbevo.iobyxmoadg.C2309iobyxmoadg.yggfygwlhe(mainActivity3, (MainTab) obj);
                            }
                        };
                        draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                    }
                    tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                    draadjrbmkVar.stevsuqkhv();
                    draadjrbmkVar.sopmlzcsov(-1518879835);
                    boolean zLmojexxdyd4 = draadjrbmkVar.lmojexxdyd(this.f97765zdlpuopuiu);
                    final MainActivity mainActivity4 = this.f97765zdlpuopuiu;
                    Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                    if (zLmojexxdyd4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.main_activity.impl.gxszxtbevo
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return MainActivity.gxszxtbevo.iobyxmoadg.C2309iobyxmoadg.jyumaefscl(mainActivity4);
                            }
                        };
                        draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVar.stevsuqkhv();
                    wc1.gxszxtbevo.gxszxtbevo(state, draadjrbmkVar2, draadjrbmkVar3, draadjrbmkVar4, (tg.iobyxmoadg) objYadqdtsiqt4, draadjrbmkVar, i13 & 14, 0);
                    draadjrbmkVar.sopmlzcsov(-1518876737);
                    if (!state.agtfadlqog()) {
                        this.f97765zdlpuopuiu.ikoacuggdj();
                        zc1.lqeggnwhkg.eablkybsjg(this.f97764yggfygwlhe, draadjrbmkVar, 0);
                    }
                    draadjrbmkVar.stevsuqkhv();
                    if (!state.agtfadlqog() && state.gtknphoqwx() != null) {
                        jd1.iobyxmoadg iobyxmoadgVarGtknphoqwx = state.gtknphoqwx();
                        draadjrbmkVar.sopmlzcsov(-1518862657);
                        boolean zLmojexxdyd5 = draadjrbmkVar.lmojexxdyd(this.f97765zdlpuopuiu);
                        final MainActivity mainActivity5 = this.f97765zdlpuopuiu;
                        Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
                        if (zLmojexxdyd5 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.main_activity.impl.lqeggnwhkg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return MainActivity.gxszxtbevo.iobyxmoadg.C2309iobyxmoadg.iwizpuwonk(mainActivity5);
                                }
                            };
                            draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
                        }
                        tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt5;
                        draadjrbmkVar.stevsuqkhv();
                        draadjrbmkVar.sopmlzcsov(-1518859548);
                        boolean zLmojexxdyd6 = draadjrbmkVar.lmojexxdyd(this.f97765zdlpuopuiu);
                        final MainActivity mainActivity6 = this.f97765zdlpuopuiu;
                        Object objYadqdtsiqt6 = draadjrbmkVar.yadqdtsiqt();
                        if (zLmojexxdyd6 || objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.main_activity.impl.nufgyqmvbu
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return MainActivity.gxszxtbevo.iobyxmoadg.C2309iobyxmoadg.ojitshcjhn(mainActivity6);
                                }
                            };
                            draadjrbmkVar.jyumaefscl(objYadqdtsiqt6);
                        }
                        tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt6;
                        draadjrbmkVar.stevsuqkhv();
                        draadjrbmkVar.sopmlzcsov(-1518856766);
                        boolean zLmojexxdyd7 = draadjrbmkVar.lmojexxdyd(this.f97765zdlpuopuiu);
                        final MainActivity mainActivity7 = this.f97765zdlpuopuiu;
                        Object objYadqdtsiqt7 = draadjrbmkVar.yadqdtsiqt();
                        if (zLmojexxdyd7 || objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.main_activity.impl.dxjokdxxww
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return MainActivity.gxszxtbevo.iobyxmoadg.C2309iobyxmoadg.oxmwwwfdhm(mainActivity7);
                                }
                            };
                            draadjrbmkVar.jyumaefscl(objYadqdtsiqt7);
                        }
                        tg.iobyxmoadg iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt7;
                        draadjrbmkVar.stevsuqkhv();
                        draadjrbmkVar.sopmlzcsov(-1518854013);
                        boolean zLmojexxdyd8 = draadjrbmkVar.lmojexxdyd(this.f97765zdlpuopuiu);
                        final MainActivity mainActivity8 = this.f97765zdlpuopuiu;
                        Object objYadqdtsiqt8 = draadjrbmkVar.yadqdtsiqt();
                        if (zLmojexxdyd8 || objYadqdtsiqt8 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt8 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.main_activity.impl.btonecajqb
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return MainActivity.gxszxtbevo.iobyxmoadg.C2309iobyxmoadg.kcexrzcfyt(mainActivity8);
                                }
                            };
                            draadjrbmkVar.jyumaefscl(objYadqdtsiqt8);
                        }
                        draadjrbmkVar.stevsuqkhv();
                        kcexrzcfyt.lqeggnwhkg(null, iobyxmoadgVarGtknphoqwx, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, (tg.iobyxmoadg) objYadqdtsiqt8, draadjrbmkVar, 0, 1);
                    }
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                }
            }

            iobyxmoadg(MainActivity mainActivity, zc1.iobyxmoadg iobyxmoadgVar) {
                this.f97763zdlpuopuiu = mainActivity;
                this.f97762yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn ppxfxbqfkf(MainActivity mainActivity, zc1.iobyxmoadg iobyxmoadgVar, agtfadlqog it) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                mainActivity.dvvnrvtcbc(it, iobyxmoadgVar);
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
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1365134657, i13, -1, "ru.myspar.proloyalty.main_activity.impl.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:209)");
                }
                ojitshcjhn ojitshcjhnVarUawqvzlxes = this.f97763zdlpuopuiu.uawqvzlxes();
                draadjrbmkVar.sopmlzcsov(-1423941857);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f97763zdlpuopuiu) | draadjrbmkVar.lmojexxdyd(this.f97762yggfygwlhe);
                final MainActivity mainActivity = this.f97763zdlpuopuiu;
                final zc1.iobyxmoadg iobyxmoadgVar = this.f97762yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.main_activity.impl.zoijcleaow
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return MainActivity.gxszxtbevo.iobyxmoadg.ppxfxbqfkf(mainActivity, iobyxmoadgVar, (agtfadlqog) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                sw0.ppxfxbqfkf.zoijcleaow(ojitshcjhnVarUawqvzlxes, (tg.draadjrbmk) objYadqdtsiqt, ezmngbhpjk.nufgyqmvbu.eablkybsjg(107971418, true, new C2309iobyxmoadg(this.f97763zdlpuopuiu, this.f97762yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, 384);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ NavigationPayload f97767jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ MainActivity f97768yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97769zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(MainActivity mainActivity, NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f97768yggfygwlhe = mainActivity;
                this.f97767jyumaefscl = navigationPayload;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn kcexrzcfyt(MainActivity mainActivity, androidx.activity.jyumaefscl jyumaefsclVar) {
                mainActivity.uawqvzlxes().q(wflxmlrfwp.iobyxmoadg.f98048iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(this.f97768yggfygwlhe, this.f97767jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f97769zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
                FragmentManager supportFragmentManager = this.f97768yggfygwlhe.getSupportFragmentManager();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(supportFragmentManager, "getSupportFragmentManager(...)");
                iobyxmoadgVar.yggfygwlhe(supportFragmentManager);
                NavigationPayload navigationPayload = this.f97767jyumaefscl;
                if (navigationPayload != null) {
                    iobyxmoadgVar.pkzmftpjix(navigationPayload);
                }
                androidx.activity.iwizpuwonk onBackPressedDispatcher = this.f97768yggfygwlhe.getOnBackPressedDispatcher();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
                final MainActivity mainActivity = this.f97768yggfygwlhe;
                esjtqupxsv.zoijcleaow(onBackPressedDispatcher, mainActivity, false, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.main_activity.impl.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return MainActivity.gxszxtbevo.ppxfxbqfkf.kcexrzcfyt(mainActivity, (androidx.activity.jyumaefscl) obj2);
                    }
                }, 2, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iwxlajgraz f97770jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ MainActivity f97771yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97772zdlpuopuiu;

            static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ iwxlajgraz f97773zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.MainActivity$gxszxtbevo$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                static final class C2311iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                    int f97774iwizpuwonk;

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    /* synthetic */ Object f97776yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    Object f97777zdlpuopuiu;

                    C2311iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f97776yggfygwlhe = obj;
                        this.f97774iwizpuwonk |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                iobyxmoadg(iwxlajgraz iwxlajgrazVar) {
                    this.f97773zdlpuopuiu = iwxlajgrazVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Object emit(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
                    C2311iobyxmoadg c2311iobyxmoadg;
                    iobyxmoadg iobyxmoadgVar;
                    if (gxszxtbevoVar instanceof C2311iobyxmoadg) {
                        c2311iobyxmoadg = (C2311iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2311iobyxmoadg.f97774iwizpuwonk;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2311iobyxmoadg.f97774iwizpuwonk = i13 - Integer.MIN_VALUE;
                        } else {
                            c2311iobyxmoadg = new C2311iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2311iobyxmoadg = new C2311iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj = c2311iobyxmoadg.f97776yggfygwlhe;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2311iobyxmoadg.f97774iwizpuwonk;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj);
                        this.f97773zdlpuopuiu.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                        c2311iobyxmoadg.f97777zdlpuopuiu = this;
                        c2311iobyxmoadg.f97774iwizpuwonk = 1;
                        if (pj.crxdokpmqz.zoijcleaow(100L, c2311iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar = this;
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar = (iobyxmoadg) c2311iobyxmoadg.f97777zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadgVar.f97773zdlpuopuiu.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(MainActivity mainActivity, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f97771yggfygwlhe = mainActivity;
                this.f97770jyumaefscl = iwxlajgrazVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f97771yggfygwlhe, this.f97770jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f97772zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = this.f97771yggfygwlhe.yfnezrywwk().nufgyqmvbu();
                    iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f97770jyumaefscl);
                    this.f97772zdlpuopuiu = 1;
                    if (lqeggnwhkgVarNufgyqmvbu.collect(iobyxmoadgVar, this) == objGxszxtbevo) {
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
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        gxszxtbevo(NavigationPayload navigationPayload) {
            this.f97760yggfygwlhe = navigationPayload;
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-64917517, i13, -1, "ru.myspar.proloyalty.main_activity.impl.MainActivity.onCreate.<anonymous> (MainActivity.kt:204)");
            }
            zc1.iobyxmoadg iobyxmoadgVarIobyxmoadg = zc1.zoijcleaow.iobyxmoadg(draadjrbmkVar, 0);
            draadjrbmkVar.sopmlzcsov(2085033849);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            MainActivity.this.uwvvkdfqfp().zoijcleaow(((Boolean) iwxlajgrazVar.getValue()).booleanValue(), ezmngbhpjk.nufgyqmvbu.eablkybsjg(1365134657, true, new iobyxmoadg(MainActivity.this, iobyxmoadgVarIobyxmoadg), draadjrbmkVar, 54), draadjrbmkVar, 48);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVar.sopmlzcsov(2085104832);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(MainActivity.this);
            MainActivity mainActivity = MainActivity.this;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(mainActivity, iwxlajgrazVar, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(wwaezpbzknVar, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 6);
            draadjrbmkVar.sopmlzcsov(2085113467);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(MainActivity.this) | draadjrbmkVar.lmojexxdyd(this.f97760yggfygwlhe);
            MainActivity mainActivity2 = MainActivity.this;
            NavigationPayload navigationPayload = this.f97760yggfygwlhe;
            Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new ppxfxbqfkf(mainActivity2, navigationPayload, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVar.stevsuqkhv();
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(wwaezpbzknVar, (rgvfuqvkyq) objYadqdtsiqt3, draadjrbmkVar, 6);
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
        public final Object emit(v51.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objAuzgnhcxok = MainActivity.this.auzgnhcxok(ppxfxbqfkfVar, gxszxtbevoVar);
            return objAuzgnhcxok == mg.zoijcleaow.gxszxtbevo() ? objAuzgnhcxok : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.vdvldrhtss(2, MainActivity.this, MainActivity.class, "handleDialogManager", "handleDialogManager(Lru/myspar/proloyalty/dialog_manager/api/models/DialogHolder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    static final class nufgyqmvbu implements sj.nufgyqmvbu {
        nufgyqmvbu() {
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(oz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            e60.eablkybsjg.f30596iobyxmoadg.gxszxtbevo(MainActivity.this);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f97780cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f97782jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f97783yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f97784zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f97782jyumaefscl = obj;
            this.f97780cqumvgiudr |= Integer.MIN_VALUE;
            return MainActivity.this.auzgnhcxok(null, this);
        }
    }

    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ MainActivity f97785iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f97786jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.wkgbmnqykc f97787yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97788zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ MainActivity f97789jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f97790yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97791zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, MainActivity mainActivity) {
                super(2, gxszxtbevoVar);
                this.f97789jyumaefscl = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f97789jyumaefscl);
                iobyxmoadgVar.f97790yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f97791zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(this.f97789jyumaefscl.ydmasvzmpa().ppxfxbqfkf(), this.f97789jyumaefscl);
                    lqeggnwhkg lqeggnwhkgVar = this.f97789jyumaefscl.new lqeggnwhkg();
                    this.f97791zdlpuopuiu = 1;
                    if (dxjokdxxwwVar.collect(lqeggnwhkgVar, this) == objGxszxtbevo) {
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
            this.f97787yggfygwlhe = wkgbmnqykcVar;
            this.f97786jyumaefscl = zoijcleaowVar;
            this.f97785iwizpuwonk = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f97787yggfygwlhe, this.f97786jyumaefscl, gxszxtbevoVar, this.f97785iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97788zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f97787yggfygwlhe.getLifecycle();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lifecycle, "<get-lifecycle>(...)");
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f97786jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f97785iwizpuwonk);
                this.f97788zdlpuopuiu = 1;
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
        public static final /* synthetic */ int[] f97792iobyxmoadg;

        static {
            int[] iArr = new int[jd1.zoijcleaow.values().length];
            try {
                iArr[jd1.zoijcleaow.PROMO_CODE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jd1.zoijcleaow.PRODUCT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jd1.zoijcleaow.IMAGE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jd1.zoijcleaow.TEXT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jd1.zoijcleaow.APP_UPDATE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f97792iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn A() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn B(MainActivity mainActivity, MySparScreenPayload payload) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.gtknphoqwx(payload));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void C(v51.wkgbmnqykc screenKey, Integer bonusQuantity) {
        u51.zoijcleaow.wkgbmnqykc(zeieaojujs().zoijcleaow(this, new RateProductResultDialogArgs(bonusQuantity)), ydmasvzmpa(), screenKey);
    }

    private final void D(final ReviewWithBonuses reviewWithBonuses) {
        final v51.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = reviewWithBonuses.lqeggnwhkg() ? v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY") : new v51.wkgbmnqykc.iobyxmoadg(hg.jyumaefscl.eablkybsjg("MY_SPAR_SCREEN_KEY"));
        u51.zoijcleaow.zoijcleaow(zeieaojujs().iobyxmoadg(new ReviewWithBonusesDialogArgs(reviewWithBonuses), new tg.iobyxmoadg() { // from class: uc1.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.E(this.f113298zdlpuopuiu, wkgbmnqykcVarIobyxmoadg, reviewWithBonuses);
            }
        }).tzroggbefp(new tg.iobyxmoadg() { // from class: uc1.kcexrzcfyt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.F(this.f113290zdlpuopuiu, reviewWithBonuses);
            }
        }), ydmasvzmpa(), wkgbmnqykcVarIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn E(MainActivity mainActivity, v51.wkgbmnqykc wkgbmnqykcVar, ReviewWithBonuses reviewWithBonuses) {
        mainActivity.C(wkgbmnqykcVar, reviewWithBonuses.getBonusQuantity());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn F(MainActivity mainActivity, ReviewWithBonuses reviewWithBonuses) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.C2323wflxmlrfwp(reviewWithBonuses));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void G(final jd1.ppxfxbqfkf popupModel) {
        u51.zoijcleaow.zoijcleaow(jztzpxfvev().zoijcleaow(new TextPopupDialogArgs(popupModel.gxszxtbevo(), popupModel.eablkybsjg(), popupModel.ojitshcjhn(), popupModel.draadjrbmk(), popupModel.wflxmlrfwp(), popupModel.agtfadlqog(), popupModel.ppxfxbqfkf()), new tg.iobyxmoadg() { // from class: uc1.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.H(this.f113305zdlpuopuiu, popupModel);
            }
        }), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn H(MainActivity mainActivity, jd1.ppxfxbqfkf ppxfxbqfkfVar) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.btonecajqb(ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void I(hz0.ppxfxbqfkf message) {
        u51.zoijcleaow.zoijcleaow(UpdateApplicationDialogFragment.INSTANCE.iobyxmoadg(message), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn a(MainActivity mainActivity, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.nufgyqmvbu(productFirst, productSecond));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ageimvtcrz(int navigationBarColor) {
        androidx.activity.wflxmlrfwp.zoijcleaow(this, null, p41.ppxfxbqfkf.eablkybsjg(this) ? zynmafqrjb.f2374eablkybsjg.ppxfxbqfkf(navigationBarColor) : zynmafqrjb.f2374eablkybsjg.wkgbmnqykc(navigationBarColor, navigationBarColor), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object auzgnhcxok(v51.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar2;
        MainActivity mainActivity;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar2 = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar2.f97780cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar2.f97780cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar2.f97782jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar2.f97780cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            mainActivity = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (v51.ppxfxbqfkf) ppxfxbqfkfVar2.f97783yggfygwlhe;
            mainActivity = (MainActivity) ppxfxbqfkfVar2.f97784zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th2) {
                mainActivity.ydmasvzmpa().iobyxmoadg(v51.iobyxmoadg.ppxfxbqfkf.f116104iobyxmoadg);
                mainActivity.pmvmpeiblj(th2);
            }
        }
        while (((iwizpuwonk) mainActivity.uawqvzlxes().getState().getValue()).agtfadlqog()) {
            ppxfxbqfkfVar2.f97784zdlpuopuiu = mainActivity;
            ppxfxbqfkfVar2.f97783yggfygwlhe = ppxfxbqfkfVar;
            ppxfxbqfkfVar2.f97780cqumvgiudr = 1;
            if (pj.crxdokpmqz.zoijcleaow(50L, ppxfxbqfkfVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(supportFragmentManager, "getSupportFragmentManager(...)");
        u51.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar, supportFragmentManager);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void b(PurchaseListSharedWithYouDialogArgs args) {
        u51.zoijcleaow.zoijcleaow(lrnfpwlwnk().nufgyqmvbu(args), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final void c() {
        u51.zoijcleaow.zoijcleaow(zfvoamnweg().iobyxmoadg(), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void d(String email) {
        u51.zoijcleaow.zoijcleaow(metgxyhuhe().wkgbmnqykc(new EmailVerifyDialogArgs(email)), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dvvnrvtcbc(agtfadlqog uiLabel, zc1.iobyxmoadg snackbarController) {
        if (uiLabel instanceof agtfadlqog.wkgbmnqykc) {
            w(((agtfadlqog.wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.zdlpuopuiu) {
            x();
            return;
        }
        if (uiLabel instanceof agtfadlqog.gtknphoqwx) {
            b(((agtfadlqog.gtknphoqwx) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.C2312agtfadlqog) {
            agtfadlqog.C2312agtfadlqog c2312agtfadlqog = (agtfadlqog.C2312agtfadlqog) uiLabel;
            e(c2312agtfadlqog.zoijcleaow(), c2312agtfadlqog.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.oxmwwwfdhm) {
            agtfadlqog.oxmwwwfdhm oxmwwwfdhmVar = (agtfadlqog.oxmwwwfdhm) uiLabel;
            o(oxmwwwfdhmVar.zoijcleaow(), oxmwwwfdhmVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.ppxfxbqfkf) {
            e60.eablkybsjg.f30596iobyxmoadg.zoijcleaow();
            return;
        }
        if (uiLabel instanceof agtfadlqog.cqumvgiudr) {
            snackbarController.btonecajqb(((agtfadlqog.cqumvgiudr) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.zoijcleaow) {
            snackbarController.lqeggnwhkg();
            return;
        }
        if (uiLabel instanceof agtfadlqog.eablkybsjg) {
            igdgnonuha(((agtfadlqog.eablkybsjg) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, agtfadlqog.rgvfuqvkyq.f97816iobyxmoadg)) {
            k();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, agtfadlqog.draadjrbmk.f97798iobyxmoadg)) {
            c();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, agtfadlqog.ojitshcjhn.f97812iobyxmoadg)) {
            f();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, agtfadlqog.vdvldrhtss.f97817iobyxmoadg)) {
            n();
            return;
        }
        if (uiLabel instanceof agtfadlqog.jyumaefscl) {
            z(((agtfadlqog.jyumaefscl) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, agtfadlqog.nufgyqmvbu.f97811iobyxmoadg)) {
            fmlbqenlif();
            return;
        }
        if (uiLabel instanceof agtfadlqog.esjtqupxsv) {
            I(((agtfadlqog.esjtqupxsv) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.iwizpuwonk) {
            D(((agtfadlqog.iwizpuwonk) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.lqeggnwhkg) {
            agtfadlqog.lqeggnwhkg lqeggnwhkgVar = (agtfadlqog.lqeggnwhkg) uiLabel;
            p(lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.gxszxtbevo) {
            ipoelvxyzq(((agtfadlqog.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.yggfygwlhe) {
            y(((agtfadlqog.yggfygwlhe) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.wflxmlrfwp) {
            d(((agtfadlqog.wflxmlrfwp) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof agtfadlqog.btonecajqb) {
            krqnebusok(((agtfadlqog.btonecajqb) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, agtfadlqog.dxjokdxxww.f97799iobyxmoadg)) {
            yzdjzghtvl();
        } else if (uiLabel instanceof agtfadlqog.kcexrzcfyt) {
            q(((agtfadlqog.kcexrzcfyt) uiLabel).iobyxmoadg());
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, agtfadlqog.iobyxmoadg.f97804iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            finish();
        }
    }

    private final void e(EvropolisGift gift, DeliveryCode deliveryCode) {
        u51.zoijcleaow.zoijcleaow(oipsdeybqn().zoijcleaow(gift, deliveryCode), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eslsurpljm(MainActivity mainActivity) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.agtfadlqog(MainTab.CART));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ezmngbhpjk(MainActivity mainActivity) {
        mainActivity.uawqvzlxes().q(wflxmlrfwp.vdvldrhtss.f98057iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void f() {
        u51.zoijcleaow.zoijcleaow(UpdateDialogFragment.INSTANCE.iobyxmoadg(), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private static final void fiwbwshyhd(ur0.zoijcleaow zoijcleaowVar, MainActivity mainActivity) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.dxjokdxxww(new ur0.ppxfxbqfkf.zoijcleaow(zoijcleaowVar.zoijcleaow())));
    }

    private final void fmlbqenlif() {
        u51.zoijcleaow.wkgbmnqykc(nuxfzjnpeb().iobyxmoadg(this, new tg.iobyxmoadg() { // from class: uc1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.ezmngbhpjk(this.f113267zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: uc1.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.rhgxfdycjh(this.f113262zdlpuopuiu);
            }
        }), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    static /* synthetic */ void fyldjkxazc(MainActivity mainActivity, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        mainActivity.ageimvtcrz(i13);
    }

    private final void g(final HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
        u51.zoijcleaow.zoijcleaow(czzsidtyhn().lqeggnwhkg(new HintDialogArgs(hint, analyticsInfo), new tg.iobyxmoadg() { // from class: uc1.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.h(hint, this);
            }
        }), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn grlcpdaxtj(MainActivity mainActivity, jd1.ppxfxbqfkf ppxfxbqfkfVar) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.gxszxtbevo(ppxfxbqfkfVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn h(HintUiModel hintUiModel, MainActivity mainActivity) {
        HintNavLink navLink = hintUiModel.getNavLink();
        if (navLink != null) {
            mainActivity.iwxlajgraz(navLink);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void hszhottldk(ur0.zoijcleaow zoijcleaowVar, MainActivity mainActivity, List list) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.dxjokdxxww(new ur0.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar.zoijcleaow(), list)));
    }

    private final void i(final jd1.ppxfxbqfkf popupModel) {
        u51.zoijcleaow.zoijcleaow(jztzpxfvev().wkgbmnqykc(new ImagePopupDialogArgs(popupModel.gxszxtbevo(), popupModel.eablkybsjg(), popupModel.ojitshcjhn(), popupModel.draadjrbmk(), popupModel.wflxmlrfwp(), popupModel.agtfadlqog(), popupModel.lqeggnwhkg(), popupModel.ppxfxbqfkf()), new tg.iobyxmoadg() { // from class: uc1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.j(this.f113264zdlpuopuiu, popupModel);
            }
        }), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void igdgnonuha(final ur0.zoijcleaow request) {
        if (okpsazkaxt(request.iobyxmoadg())) {
            fiwbwshyhd(request, this);
            return;
        }
        eablkybsjg.ppxfxbqfkf activityResultRegistry = getActivityResultRegistry();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(activityResultRegistry, "<get-activityResultRegistry>(...)");
        d31.zoijcleaow.zoijcleaow(activityResultRegistry, request.zoijcleaow(), new tg.iobyxmoadg() { // from class: uc1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.lxfrhoxuzk(request, this);
            }
        }, new tg.draadjrbmk() { // from class: uc1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MainActivity.wizcaqwiak(request, this, (List) obj);
            }
        }, (String[]) request.iobyxmoadg().toArray(new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ikoacuggdj() {
        int iPpxfxbqfkf = p41.ppxfxbqfkf.ppxfxbqfkf(this, b31.ppxfxbqfkf.colorSpecialSurface1);
        if (Build.VERSION.SDK_INT < 35) {
            getWindow().setNavigationBarColor(iPpxfxbqfkf);
        } else {
            ageimvtcrz(iPpxfxbqfkf);
        }
    }

    private final void ipoelvxyzq(final jd1.ppxfxbqfkf popupModel) {
        u51.zoijcleaow.wkgbmnqykc(ac1.zoijcleaow.zoijcleaow(ac1.zoijcleaow.f1546iobyxmoadg, this, new tg.iobyxmoadg() { // from class: uc1.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.grlcpdaxtj(this.f113258zdlpuopuiu, popupModel);
            }
        }, null, null, ow0.ppxfxbqfkf.VERTICAL, 12, null), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void iwxlajgraz(HintNavLink navLink) {
        skhdrjzrfn();
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(k21.ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(navLink.getNavLink()), navLink.getReference(), null, null, false, null, null, false, 252, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ixidwrxhsl(MainActivity mainActivity, boolean z13) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.lqeggnwhkg(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn j(MainActivity mainActivity, jd1.ppxfxbqfkf ppxfxbqfkfVar) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.btonecajqb(ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void jrbgnlbqoe(jd1.ppxfxbqfkf popupModel) {
        String strOjitshcjhn = popupModel.ojitshcjhn();
        String strDraadjrbmk = popupModel.draadjrbmk();
        String strAgtfadlqog = popupModel.agtfadlqog();
        String strPpxfxbqfkf = popupModel.ppxfxbqfkf();
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        u51.zoijcleaow.zoijcleaow(UpdateApplicationTwoDialogFragment.INSTANCE.iobyxmoadg(new UpdateApplicationTwoDialogArgs(null, null, strOjitshcjhn, strDraadjrbmk, strAgtfadlqog, strPpxfxbqfkf, popupModel.lqeggnwhkg(), 3, null)), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void k() {
        xrmfcynszj().iobyxmoadg(this, new tg.draadjrbmk() { // from class: uc1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MainActivity.l(this.f113265zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: uc1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MainActivity.m(this.f113268zdlpuopuiu, (ow0.nufgyqmvbu) obj);
            }
        });
    }

    private final void krqnebusok(BuildYourComboDialogArgs dialogArgs) {
        u51.zoijcleaow.zoijcleaow(BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(dialogArgs).sflfametgt(new rgvfuqvkyq() { // from class: uc1.vdvldrhtss
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.a(this.f113303zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        }), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn l(MainActivity mainActivity, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        mainActivity.mhtqkkgtqm();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lxfrhoxuzk(ur0.zoijcleaow zoijcleaowVar, MainActivity mainActivity) {
        fiwbwshyhd(zoijcleaowVar, mainActivity);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn m(MainActivity mainActivity, ow0.nufgyqmvbu it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        u51.zoijcleaow.wkgbmnqykc(it, mainActivity.ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void mhtqkkgtqm() {
        if (yz0.zoijcleaow.iobyxmoadg() != yz0.iobyxmoadg.RUSTORE) {
            u51.zoijcleaow.zoijcleaow(InAppReviewDialogFragment.INSTANCE.iobyxmoadg(new InAppReviewDialogArgs(null, 1, null)).iyctptxqzt(new tg.draadjrbmk() { // from class: uc1.btonecajqb
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return MainActivity.ixidwrxhsl(this.f113259zdlpuopuiu, ((Boolean) obj).booleanValue());
                }
            }), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
        }
    }

    private final void n() {
        u51.zoijcleaow.ppxfxbqfkf(IqosAgreementsDialogFragment.INSTANCE.iobyxmoadg(), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void o(hh1.btonecajqb popup, AnalyticsPage analyticsPage) {
        u51.zoijcleaow.zoijcleaow(iyctptxqzt().iobyxmoadg(popup, analyticsPage), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final boolean okpsazkaxt(List permissions) {
        Iterator it = permissions.iterator();
        while (it.hasNext()) {
            if (androidx.core.content.iobyxmoadg.checkSelfPermission(this, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    private final void p(String shopId, jd1.ppxfxbqfkf popupModel) {
        int i13 = zoijcleaow.f97792iobyxmoadg[popupModel.dxjokdxxww().ordinal()];
        if (i13 == 1) {
            t(popupModel);
            return;
        }
        if (i13 == 2) {
            r(shopId, popupModel);
            return;
        }
        if (i13 == 3) {
            i(popupModel);
        } else if (i13 == 4) {
            G(popupModel);
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            jrbgnlbqoe(popupModel);
        }
    }

    private final void q(PopupTypesUiModel popup) {
        if (!(popup instanceof PopupTypesUiModel.PurchaseRating)) {
            throw new NoWhenBranchMatchedException();
        }
        u((PopupTypesUiModel.PurchaseRating) popup);
    }

    private final void r(String shopId, final jd1.ppxfxbqfkf popupModel) {
        String strGtknphoqwx = popupModel.gtknphoqwx();
        if (strGtknphoqwx == null) {
            return;
        }
        u51.zoijcleaow.zoijcleaow(jztzpxfvev().iobyxmoadg(new ProductDayPopupDialogArgs(popupModel.gxszxtbevo(), popupModel.eablkybsjg(), popupModel.ojitshcjhn(), popupModel.draadjrbmk(), popupModel.wflxmlrfwp(), popupModel.agtfadlqog(), shopId, popupModel.ppxfxbqfkf(), strGtknphoqwx, null, UserVerificationMethods.USER_VERIFY_NONE, null), new tg.iobyxmoadg() { // from class: uc1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.s(this.f113294zdlpuopuiu, popupModel);
            }
        }), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rhgxfdycjh(MainActivity mainActivity) {
        mainActivity.uawqvzlxes().q(wflxmlrfwp.vdvldrhtss.f98057iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn s(MainActivity mainActivity, jd1.ppxfxbqfkf ppxfxbqfkfVar) {
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.btonecajqb(k21.ojitshcjhn.PRODUCT, ppxfxbqfkfVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn() {
        String str = (String) bfopjjpdmp().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
            return;
        }
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().gtknphoqwx(yggfygwlhe.zoijcleaow(new EditOrderPayload(str, false, 2, null)), true);
    }

    private final void t(jd1.ppxfxbqfkf popupModel) {
        u51.zoijcleaow.zoijcleaow(jztzpxfvev().ppxfxbqfkf(new PromoCodePopupDialogArgs(popupModel.gxszxtbevo(), popupModel.eablkybsjg(), popupModel.ojitshcjhn(), popupModel.draadjrbmk(), popupModel.wflxmlrfwp(), popupModel.agtfadlqog(), popupModel.btonecajqb())), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void u(PopupTypesUiModel.PurchaseRating popup) {
        u51.zoijcleaow.zoijcleaow(PurchaseRatingDialogFragment.INSTANCE.iobyxmoadg(popup).yfnezrywwk(new rgvfuqvkyq() { // from class: uc1.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.v(this.f113309zdlpuopuiu, (k21.ojitshcjhn) obj, (String) obj2);
            }
        }), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn v(MainActivity mainActivity, k21.ojitshcjhn link, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(link, "link");
        mainActivity.uawqvzlxes().q(new wflxmlrfwp.oxmwwwfdhm(link, str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void w(String description) {
        u51.zoijcleaow.wkgbmnqykc(ow0.nufgyqmvbu.iobyxmoadg.wflxmlrfwp(new ow0.nufgyqmvbu.iobyxmoadg(this, Boolean.TRUE, null, 4, null).nufgyqmvbu(description), vk0.lqeggnwhkg.proloyalty_ok, null, 2, null).zoijcleaow(), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wizcaqwiak(ur0.zoijcleaow zoijcleaowVar, MainActivity mainActivity, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        hszhottldk(zoijcleaowVar, mainActivity, it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void x() {
        u51.zoijcleaow.zoijcleaow(sflfametgt().iobyxmoadg(), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final void y(x81.wflxmlrfwp params) {
        new x81.draadjrbmk.iobyxmoadg(this, Boolean.TRUE, null, 4, null).zoijcleaow(params).iobyxmoadg().show();
    }

    private final void yzdjzghtvl() {
        u51.zoijcleaow.wkgbmnqykc(new y81.wkgbmnqykc(this, new tg.iobyxmoadg() { // from class: uc1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.eslsurpljm(this.f113295zdlpuopuiu);
            }
        }, null, 4, null), ydmasvzmpa(), new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final void z(tc1.ppxfxbqfkf params) {
        u51.zoijcleaow.zoijcleaow(RateOrderDialogFragment.INSTANCE.iobyxmoadg(new RateOrderDialogArgs(params.ppxfxbqfkf(), params.zoijcleaow(), params.iobyxmoadg(), params.eablkybsjg(), params.wkgbmnqykc())).weqkydbzbr(new tg.iobyxmoadg() { // from class: uc1.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MainActivity.A();
            }
        }).iyctptxqzt(new tg.draadjrbmk() { // from class: uc1.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MainActivity.B(this.f113302zdlpuopuiu, (MySparScreenPayload) obj);
            }
        }), ydmasvzmpa(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    @Override // sw0.wkgbmnqykc, androidx.appcompat.app.wkgbmnqykc, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(base, "base");
        r41.iobyxmoadg.f81705iobyxmoadg.iobyxmoadg(base);
        super.attachBaseContext(base);
    }

    public final w01.btonecajqb bfopjjpdmp() {
        w01.btonecajqb btonecajqbVar = this.getActiveEditOrderIdUseCase;
        if (btonecajqbVar != null) {
            return btonecajqbVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("getActiveEditOrderIdUseCase");
        return null;
    }

    public final xo0.iobyxmoadg czzsidtyhn() {
        xo0.iobyxmoadg iobyxmoadgVar = this.catalogFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("catalogFeatureApi");
        return null;
    }

    @Override // pw0.zoijcleaow
    public void iobyxmoadg(Fragment fragment) {
        String tag;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragment, "fragment");
        if ((fragment instanceof TabContainerFragment) || (tag = fragment.getTag()) == null) {
            return;
        }
        ydmasvzmpa().iobyxmoadg(new v51.iobyxmoadg.C2880iobyxmoadg(tag));
    }

    public final zg1.iobyxmoadg iyctptxqzt() {
        zg1.iobyxmoadg iobyxmoadgVar = this.popupsFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("popupsFeatureApi");
        return null;
    }

    public final im0.iobyxmoadg jztzpxfvev() {
        im0.iobyxmoadg iobyxmoadgVar = this.adsFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("adsFeatureApi");
        return null;
    }

    public final ri1.iobyxmoadg lrnfpwlwnk() {
        ri1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    public final an0.iobyxmoadg metgxyhuhe() {
        an0.iobyxmoadg iobyxmoadgVar = this.authFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("authFeatureApi");
        return null;
    }

    public final mn1.iobyxmoadg nuxfzjnpeb() {
        mn1.iobyxmoadg iobyxmoadgVar = this.scanGoFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("scanGoFeatureApi");
        return null;
    }

    public final r71.iobyxmoadg oipsdeybqn() {
        r71.iobyxmoadg iobyxmoadgVar = this.evropolisFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("evropolisFeatureApi");
        return null;
    }

    @Override // ru.myspar.proloyalty.main_activity.impl.iobyxmoadg, androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fyldjkxazc(this, 0, 1, null);
        NavigationPayload navigationPayloadIobyxmoadg = l21.zoijcleaow.f61377iobyxmoadg.iobyxmoadg(getIntent());
        if (savedInstanceState != null) {
            navigationPayloadIobyxmoadg = null;
        }
        ppxfxbqfkf.zoijcleaow.zoijcleaow(this, null, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-64917517, true, new gxszxtbevo(navigationPayloadIobyxmoadg)), 1, null);
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new wkgbmnqykc(this, zoijcleaowVar, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new eablkybsjg(this, zoijcleaowVar, null, this), 3, null);
    }

    @Override // ru.myspar.proloyalty.main_activity.impl.iobyxmoadg, androidx.appcompat.app.wkgbmnqykc, androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onDestroy() {
        ydmasvzmpa().clear();
        super.onDestroy();
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    protected void onNewIntent(Intent intent) {
        NavigationPayload navigationPayloadIobyxmoadg = l21.zoijcleaow.f61377iobyxmoadg.iobyxmoadg(intent);
        if (navigationPayloadIobyxmoadg != null) {
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadIobyxmoadg);
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onResume() {
        super.onResume();
        uawqvzlxes().q(wflxmlrfwp.eablkybsjg.f98045iobyxmoadg);
    }

    public final sd1.iobyxmoadg opjhrmiecq() {
        sd1.iobyxmoadg iobyxmoadgVar = this.mySparFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("mySparFeatureApi");
        return null;
    }

    @Override // ms0.iobyxmoadg
    public void ppxfxbqfkf(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
        HintNavLink navLink = hint.getNavLink();
        if (hint.getBottomSheetInfo() != null) {
            g(hint, analyticsInfo);
        } else if (navLink != null) {
            iwxlajgraz(navLink);
        }
    }

    public final eo0.iobyxmoadg rlfsiqarku() {
        eo0.iobyxmoadg iobyxmoadgVar = this.cartFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("cartFeatureApi");
        return null;
    }

    public final vu1.iobyxmoadg roivzttewh() {
        vu1.iobyxmoadg iobyxmoadgVar = this.supportFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("supportFeatureApi");
        return null;
    }

    public final y61.iobyxmoadg sflfametgt() {
        y61.iobyxmoadg iobyxmoadgVar = this.dynamicQrFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dynamicQrFeatureApi");
        return null;
    }

    public final u01.zoijcleaow tbqsvytpvh() {
        u01.zoijcleaow zoijcleaowVar = this.subscribeToDarkModeStateUseCase;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("subscribeToDarkModeStateUseCase");
        return null;
    }

    protected ojitshcjhn uawqvzlxes() {
        return (ojitshcjhn) this.viewModel.getValue();
    }

    public final a51.iobyxmoadg uwvvkdfqfp() {
        a51.iobyxmoadg iobyxmoadgVar = this.debugPanelFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("debugPanelFeatureApi");
        return null;
    }

    public final gi1.iobyxmoadg weqkydbzbr() {
        gi1.iobyxmoadg iobyxmoadgVar = this.profileFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("profileFeatureApi");
        return null;
    }

    public final up1.iobyxmoadg xrmfcynszj() {
        up1.iobyxmoadg iobyxmoadgVar = this.appReviewApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("appReviewApi");
        return null;
    }

    public final u51.iobyxmoadg ydmasvzmpa() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    public final a51.zoijcleaow yfnezrywwk() {
        a51.zoijcleaow zoijcleaowVar = this.debugPanelFeatureObserver;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("debugPanelFeatureObserver");
        return null;
    }

    public final nl1.iobyxmoadg zeieaojujs() {
        nl1.iobyxmoadg iobyxmoadgVar = this.rateBonusProductFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("rateBonusProductFeatureApi");
        return null;
    }

    public final k71.iobyxmoadg zfvoamnweg() {
        k71.iobyxmoadg iobyxmoadgVar = this.echecksFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("echecksFeatureApi");
        return null;
    }
}
