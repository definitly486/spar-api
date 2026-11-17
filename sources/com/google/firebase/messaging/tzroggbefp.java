package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class tzroggbefp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f24484iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f24485zoijcleaow = new androidx.collection.iobyxmoadg();

    interface iobyxmoadg {
        Task start();
    }

    tzroggbefp(Executor executor) {
        this.f24484iobyxmoadg = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task ppxfxbqfkf(String str, Task task) {
        synchronized (this) {
            this.f24485zoijcleaow.remove(str);
        }
        return task;
    }

    synchronized Task zoijcleaow(final String str, iobyxmoadg iobyxmoadgVar) {
        Task task = (Task) this.f24485zoijcleaow.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskContinueWithTask = iobyxmoadgVar.start().continueWithTask(this.f24484iobyxmoadg, new Continuation() { // from class: com.google.firebase.messaging.kegysxyocb
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return this.f24446iobyxmoadg.ppxfxbqfkf(str, task2);
            }
        });
        this.f24485zoijcleaow.put(str, taskContinueWithTask);
        return taskContinueWithTask;
    }
}
