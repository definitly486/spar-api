package ru.myspar.rate.rate_product.impl.domain.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.error_handler.exceptions.DomainException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH×\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH×\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/myspar/rate/rate_product/impl/domain/exception/CompletedReviewException;", "Lru/myspar/core/error_handler/exceptions/DomainException;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "yggfygwlhe", "Ljava/lang/String;", "getMessage", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CompletedReviewException extends DomainException {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompletedReviewException(String message) {
        super(null, null, 3, null);
        zdlpuopuiu.btonecajqb(message, "message");
        this.message = message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CompletedReviewException) && zdlpuopuiu.eablkybsjg(this.message, ((CompletedReviewException) other).message);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CompletedReviewException(message=" + this.message + ")";
    }
}
