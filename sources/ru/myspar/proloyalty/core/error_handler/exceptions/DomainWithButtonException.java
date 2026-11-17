package ru.myspar.proloyalty.core.error_handler.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/myspar/proloyalty/core/error_handler/exceptions/DomainWithButtonException;", "Lru/myspar/proloyalty/core/error_handler/exceptions/DomainException;", "", "message", "code", "Lru/myspar/proloyalty/core/error_handler/exceptions/DomainWithButtonException$iobyxmoadg;", "buttonContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/error_handler/exceptions/DomainWithButtonException$iobyxmoadg;)V", "yggfygwlhe", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "jyumaefscl", "iobyxmoadg", "iwizpuwonk", "Lru/myspar/proloyalty/core/error_handler/exceptions/DomainWithButtonException$iobyxmoadg;", "wkgbmnqykc", "()Lru/myspar/proloyalty/core/error_handler/exceptions/DomainWithButtonException$iobyxmoadg;", "error-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DomainWithButtonException extends DomainException {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final iobyxmoadg buttonContent;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final String code;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final String message;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f95240iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f95241ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f95242wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f95243zoijcleaow;

        public iobyxmoadg(String text, int i13, String navLink, String str) {
            zdlpuopuiu.btonecajqb(text, "text");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f95240iobyxmoadg = text;
            this.f95243zoijcleaow = i13;
            this.f95241ppxfxbqfkf = navLink;
            this.f95242wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f95240iobyxmoadg, iobyxmoadgVar.f95240iobyxmoadg) && this.f95243zoijcleaow == iobyxmoadgVar.f95243zoijcleaow && zdlpuopuiu.eablkybsjg(this.f95241ppxfxbqfkf, iobyxmoadgVar.f95241ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f95242wkgbmnqykc, iobyxmoadgVar.f95242wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f95240iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f95243zoijcleaow)) * 31) + this.f95241ppxfxbqfkf.hashCode()) * 31;
            String str = this.f95242wkgbmnqykc;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final int iobyxmoadg() {
            return this.f95243zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f95242wkgbmnqykc;
        }

        public String toString() {
            return "ButtonContent(text=" + this.f95240iobyxmoadg + ", durationInSeconds=" + this.f95243zoijcleaow + ", navLink=" + this.f95241ppxfxbqfkf + ", reference=" + this.f95242wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f95240iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f95241ppxfxbqfkf;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DomainWithButtonException(String message, String code, iobyxmoadg buttonContent) {
        super(message, null, 2, null);
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(buttonContent, "buttonContent");
        this.message = message;
        this.code = code;
        this.buttonContent = buttonContent;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // ru.myspar.proloyalty.core.error_handler.exceptions.DomainException
    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
    public final iobyxmoadg getButtonContent() {
        return this.buttonContent;
    }
}
