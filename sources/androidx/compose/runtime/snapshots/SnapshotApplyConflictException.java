package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroidx/compose/runtime/snapshots/lqeggnwhkg;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/lqeggnwhkg;)V", "zdlpuopuiu", "Landroidx/compose/runtime/snapshots/lqeggnwhkg;", "getSnapshot", "()Landroidx/compose/runtime/snapshots/lqeggnwhkg;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotApplyConflictException extends Exception {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final lqeggnwhkg snapshot;

    public SnapshotApplyConflictException(lqeggnwhkg lqeggnwhkgVar) {
        this.snapshot = lqeggnwhkgVar;
    }
}
