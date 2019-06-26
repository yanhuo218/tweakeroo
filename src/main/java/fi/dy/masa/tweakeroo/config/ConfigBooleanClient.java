package fi.dy.masa.tweakeroo.config;

import fi.dy.masa.malilib.config.options.ConfigBooleanHotkeyed;
import fi.dy.masa.malilib.gui.GuiBase;
import net.minecraft.client.resource.language.I18n;

public class ConfigBooleanClient extends ConfigBooleanHotkeyed
{
    public ConfigBooleanClient(String name, boolean defaultValue, String defaultHotkey, String comment)
    {
        this(name, defaultValue, defaultHotkey, comment, name);
    }

    public ConfigBooleanClient(String name, boolean defaultValue, String defaultHotkey, String comment, String prettyName)
    {
        super(name, defaultValue, defaultHotkey, comment, prettyName);
    }

    @Override
    public String getComment()
    {
        String comment = super.getComment();

        if (comment == null)
        {
            return "";
        }

        return comment + "\n" + I18n.translate("tweakeroo.label.config_comment.single_player_only");
    }

    @Override
    public String getConfigGuiDisplayName()
    {
        return GuiBase.TXT_GOLD + this.getName() + GuiBase.TXT_RST;
    }
}