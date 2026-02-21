local M = {}
function M.setup(opts)
    opts = opts or {}
    vim.filetype.add({ extension = { aathu = "aathu" } })
end
return M
