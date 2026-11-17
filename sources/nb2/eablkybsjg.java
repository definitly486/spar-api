package nb2;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ dxjokdxxww f69560zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(dxjokdxxww dxjokdxxwwVar) {
        super(0);
        this.f69560zdlpuopuiu = dxjokdxxwwVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        SQLiteDatabase writableDatabase = this.f69560zdlpuopuiu.f69555iobyxmoadg.getWritableDatabase();
        writableDatabase.enableWriteAheadLogging();
        return writableDatabase;
    }
}
