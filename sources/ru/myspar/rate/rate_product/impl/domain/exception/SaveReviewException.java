package ru.myspar.rate.rate_product.impl.domain.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.error_handler.exceptions.DomainException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/myspar/rate/rate_product/impl/domain/exception/SaveReviewException;", "Lru/myspar/core/error_handler/exceptions/DomainException;", "", "message", "<init>", "(Ljava/lang/String;)V", "yggfygwlhe", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SaveReviewException extends DomainException {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveReviewException(String message) {
        super(null, null, 3, null);
        zdlpuopuiu.btonecajqb(message, "message");
        this.message = message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
