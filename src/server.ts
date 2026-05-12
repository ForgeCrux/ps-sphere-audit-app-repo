import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { z } from "zod";

export const server = new McpServer({
  name: "test-mcp",
  version: "0.1.0",
});

// ---------- Tools ----------
import { create_taskHandler } from "./tools/create_task.js";

server.registerTool("create_task", {
  description: "Creates a new task with title, optional description, and priority. Returns the task ID.",
  inputSchema: { title: z.string(), description: z.string().optional(), priority: z.string().optional() },
}, create_taskHandler);

