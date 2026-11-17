package v5;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.zdlpuopuiu;
import u5.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends lqeggnwhkg implements gtknphoqwx {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final SQLiteStatement f116065yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(SQLiteStatement delegate) {
        super(delegate);
        zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f116065yggfygwlhe = delegate;
    }

    @Override // u5.gtknphoqwx
    public long jrbgnlbqoe() {
        return this.f116065yggfygwlhe.executeInsert();
    }

    @Override // u5.gtknphoqwx
    public int pkzmftpjix() {
        return this.f116065yggfygwlhe.executeUpdateDelete();
    }
}
