package io.melakuera.tgbotzamena.constants;

/*
 * Шаблоны сообщений бота
 */
public class BotMessages {

	// Стартовое сообщение если бот запущен в группе 
	public static final String START_IN_GROUP =
			"""
			И так начинаем! Сперва посмотрите справку по боту с помощью команды /info. Дальше  не забудьте мне назначить *роль админа*, иначе я не смогу закреплять сообщения. И далее укажите группу для получения входящих замен, как показано сверху.
			Вы в любой момент можете перестать получать замены с помощью команды /quit.
			""";

	// Сообщение, который займет текст после выбора группы
	public static final String SUCCESS_APPLY_FACULTY = "Выбрана группа:";
	
	// Сообщение, если подписка на группу произошла успешно
	public static final String CONGRATULATION = "Поздравляем вы успешно подписались на замены "
			+ "группы %s! Если вы желаете, чтобы я именно *вас* упомянул при новых замен, "
			+ "просто введите команду /in";
	
	// Сообщение, если замена подписки на группы произошла успешно
	public static final String CONGRATULATION_IF_EXISTS = "Вы успешно поменяли подписку на группу %s! "
			+ "Если вы желаете, чтобы я именно *вас* упомянул при новых замен, "
			+ "просто введите команду /in";
	
	// Сообщение, который выводится командой /info
	public static final String INFO = """
			Вы на данный момент %s

			Сведение команд и запросов:
			/start - Получить начальное сообщение
			%s <наименование факультета> - Начать получать замены данной группы (высветиться подсказка)
			/in - Подписаться на входящие замены (Бот упомянет *вас*, когда пришла новая замена)
			/out - Отписаться от входящих замен (Бот перестанет упоминать *вас*)
			/info - Мне нужно писать для чего это команда?
			/quit - Перестать получать входящие замены (Иначе говоря, он будет бездействовать)
			
			В: А что с моими личными данными? Этот бот прослеживает что происходит в нашей группе? И зачем тебе админка?!
			
			О: Насчет этого вы можете абсолютно не беспокоится. Потому что сам Телеграм позаботился о ваших конфиденциальных данных. Так, я и этот бот не в состоянии сделать, что то масштабное с вашими пользовательским идентификатором, которую причем вы можете добыть довольно тривиальным образом. Подробнее: https://telegram.org/faq#q-what-are-your-thoughts-on-internet-privacy
		""";
	
	// Сообщение, который выводится при успешном результате команды /in и /out
	public static final String APPLY_MENTION = "Принято!";
	
	// Сообщение, который выводится при ошибке результата команды /in и /out
	public static final String MENTION_ERROR = "Так нельзя!";
	
	// Сообщение, который выводится командой /quit
	public static final String QUIT = "Вы уверены, что хотите перестать получать замены?";
	
	// Текст сообщении, который применяется после отмены отписки
	public static final String QUIT_NO = "Таки быть";
	
	// Текст сообщении, который применяется после подтверждении отписки
	public static final String QUIT_YES = "До свидос!";
	
	// Сообщение, если замены какой группы еще не выбрана
	public static final String GROUP_NOT_APPLY_ERROR = "Вы еще не подписались на ни одну группу!";
	
	private BotMessages() {}
}