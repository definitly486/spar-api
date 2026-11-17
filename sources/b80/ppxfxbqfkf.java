package b80;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.paging.Paging;
import ru.myspar.domain.feature.review.store.State;
import ru.myspar.rate.review.api.model.ReviewUser;
import ru.myspar.rate.review.api.model.Reviews;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, lqeggnwhkg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof lqeggnwhkg.zoijcleaow) {
            lqeggnwhkg.zoijcleaow zoijcleaowVar = (lqeggnwhkg.zoijcleaow) msg;
            return state.zoijcleaow((261599 & 1) != 0 ? state.productArticle : null, (261599 & 2) != 0 ? state.productName : null, (261599 & 4) != 0 ? state.colorsModel : null, (261599 & 8) != 0 ? state.ratingReview : 0.0d, (261599 & 16) != 0 ? state.currentPage : 0, (261599 & 32) != 0 ? state.isInitLoad : zoijcleaowVar.iobyxmoadg(), (261599 & 64) != 0 ? state.sumHeaderItem : null, (261599 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.items : null, (261599 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.paging : null, (261599 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : zoijcleaowVar.zoijcleaow(), (261599 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isCanAddReview : false, (261599 & 2048) != 0 ? state.isCanEditReview : false, (261599 & 4096) != 0 ? state.commentText : null, (261599 & 8192) != 0 ? state.answer : null, (261599 & 16384) != 0 ? state.isNeedScrollToTop : false, (261599 & 32768) != 0 ? state.isExpanded : false, (261599 & 65536) != 0 ? state.isNeedToExpand : false, (261599 & 131072) != 0 ? state.isNeedToCollapse : false);
        }
        if (!(msg instanceof lqeggnwhkg.ppxfxbqfkf)) {
            if (msg instanceof lqeggnwhkg.iobyxmoadg) {
                return state.zoijcleaow((261599 & 1) != 0 ? state.productArticle : null, (261599 & 2) != 0 ? state.productName : null, (261599 & 4) != 0 ? state.colorsModel : null, (261599 & 8) != 0 ? state.ratingReview : 0.0d, (261599 & 16) != 0 ? state.currentPage : 0, (261599 & 32) != 0 ? state.isInitLoad : false, (261599 & 64) != 0 ? state.sumHeaderItem : null, (261599 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.items : ((lqeggnwhkg.iobyxmoadg) msg).iobyxmoadg(), (261599 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.paging : null, (261599 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false, (261599 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isCanAddReview : false, (261599 & 2048) != 0 ? state.isCanEditReview : false, (261599 & 4096) != 0 ? state.commentText : null, (261599 & 8192) != 0 ? state.answer : null, (261599 & 16384) != 0 ? state.isNeedScrollToTop : false, (261599 & 32768) != 0 ? state.isExpanded : false, (261599 & 65536) != 0 ? state.isNeedToExpand : false, (261599 & 131072) != 0 ? state.isNeedToCollapse : false);
            }
            if (zdlpuopuiu.eablkybsjg(msg, lqeggnwhkg.wkgbmnqykc.f15485iobyxmoadg)) {
                return state.zoijcleaow((261599 & 1) != 0 ? state.productArticle : null, (261599 & 2) != 0 ? state.productName : null, (261599 & 4) != 0 ? state.colorsModel : null, (261599 & 8) != 0 ? state.ratingReview : 0.0d, (261599 & 16) != 0 ? state.currentPage : 0, (261599 & 32) != 0 ? state.isInitLoad : false, (261599 & 64) != 0 ? state.sumHeaderItem : null, (261599 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.items : null, (261599 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.paging : null, (261599 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false, (261599 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isCanAddReview : false, (261599 & 2048) != 0 ? state.isCanEditReview : false, (261599 & 4096) != 0 ? state.commentText : null, (261599 & 8192) != 0 ? state.answer : null, (261599 & 16384) != 0 ? state.isNeedScrollToTop : false, (261599 & 32768) != 0 ? state.isExpanded : false, (261599 & 65536) != 0 ? state.isNeedToExpand : false, (261599 & 131072) != 0 ? state.isNeedToCollapse : false);
            }
            throw new NoWhenBranchMatchedException();
        }
        lqeggnwhkg.ppxfxbqfkf ppxfxbqfkfVar = (lqeggnwhkg.ppxfxbqfkf) msg;
        Reviews reviewsZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        ReviewUser user = reviewsZoijcleaow.getUser();
        Paging paging = reviewsZoijcleaow.getPaging();
        return state.zoijcleaow((261599 & 1) != 0 ? state.productArticle : null, (261599 & 2) != 0 ? state.productName : null, (261599 & 4) != 0 ? state.colorsModel : null, (261599 & 8) != 0 ? state.ratingReview : 0.0d, (261599 & 16) != 0 ? state.currentPage : ppxfxbqfkfVar.iobyxmoadg(), (261599 & 32) != 0 ? state.isInitLoad : false, (261599 & 64) != 0 ? state.sumHeaderItem : reviewsZoijcleaow.getSumHeaderItem(), (261599 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.items : reviewsZoijcleaow.getItems(), (261599 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.paging : paging, (261599 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false, (261599 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isCanAddReview : ppxfxbqfkfVar.ppxfxbqfkf() && user.getIsCanAdd(), (261599 & 2048) != 0 ? state.isCanEditReview : ppxfxbqfkfVar.ppxfxbqfkf() && user.getIsCanEdit(), (261599 & 4096) != 0 ? state.commentText : user.getComment(), (261599 & 8192) != 0 ? state.answer : user.getAnswer(), (261599 & 16384) != 0 ? state.isNeedScrollToTop : ppxfxbqfkfVar.wkgbmnqykc(), (261599 & 32768) != 0 ? state.isExpanded : false, (261599 & 65536) != 0 ? state.isNeedToExpand : false, (261599 & 131072) != 0 ? state.isNeedToCollapse : false);
    }
}
