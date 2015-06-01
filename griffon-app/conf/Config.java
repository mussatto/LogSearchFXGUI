import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                .e("title", "log-search-FXGUI")
                .e("startupGroups", asList("logSearchFXGUI"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("logSearchFXGUI", map()
                    .e("model", "com.curupira.LogSearchFXGUIModel")
                    .e("view", "com.curupira.LogSearchFXGUIView")
                    .e("controller", "com.curupira.LogSearchFXGUIController")
                )
            );
    }
}