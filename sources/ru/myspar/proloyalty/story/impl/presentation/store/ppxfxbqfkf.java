package ru.myspar.proloyalty.story.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.story.api.model.StoryPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryPayload f101685iobyxmoadg;

        public iobyxmoadg(StoryPayload args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f101685iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101685iobyxmoadg, ((iobyxmoadg) obj).f101685iobyxmoadg);
        }

        public int hashCode() {
            return this.f101685iobyxmoadg.hashCode();
        }

        public final StoryPayload iobyxmoadg() {
            return this.f101685iobyxmoadg;
        }

        public String toString() {
            return "Init(args=" + this.f101685iobyxmoadg + ")";
        }
    }
}
