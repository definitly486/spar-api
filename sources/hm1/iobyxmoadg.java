package hm1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.exception.CompletedReviewException;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.exception.GetNextReviewException;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.exception.SaveReviewException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final Throwable iobyxmoadg(ErrorResponse errorResponse) {
        zdlpuopuiu.btonecajqb(errorResponse, "errorResponse");
        String code = errorResponse.getCode();
        if (code != null) {
            int iHashCode = code.hashCode();
            if (iHashCode != -805352863) {
                if (iHashCode != 1321458474) {
                    if (iHashCode == 1770363428 && code.equals("review_completed")) {
                        String message = errorResponse.getMessage();
                        return new CompletedReviewException(message != null ? message : "");
                    }
                } else if (code.equals("unknown_next_item")) {
                    String message2 = errorResponse.getMessage();
                    return new GetNextReviewException(message2 != null ? message2 : "");
                }
            } else if (code.equals("review_error")) {
                String message3 = errorResponse.getMessage();
                return new SaveReviewException(message3 != null ? message3 : "");
            }
        }
        return new DomainException(errorResponse.getMessage(), null, 2, null);
    }
}
