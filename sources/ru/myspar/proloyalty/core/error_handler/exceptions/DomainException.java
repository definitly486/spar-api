package ru.myspar.proloyalty.core.error_handler.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/myspar/proloyalty/core/error_handler/exceptions/DomainException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "zdlpuopuiu", "Ljava/lang/String;", "iobyxmoadg", "()Ljava/lang/String;", "error-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DomainException extends Exception {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String code;

    /* JADX WARN: Multi-variable type inference failed */
    public DomainException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public String getCode() {
        return this.code;
    }

    public /* synthetic */ DomainException(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
    }

    public DomainException(String str, String str2) {
        super(str);
        this.code = str2;
    }
}
