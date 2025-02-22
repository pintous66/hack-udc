export type ChatMessageDTO = {
  question: string;
  answer: string;
  date: string;
};

export type ChatDTO = {
  id: string;
  title?: string;
  msgs: ChatMessageDTO[];
  userId?: string;
};

export type ChatPreviewDTO = {
  id: string;
  title: string;
  lastMessage: string;
};

export type GroupedChatsDTO = {
  [date: string]: ChatPreviewDTO[];
};
